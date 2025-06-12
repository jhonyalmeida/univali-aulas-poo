package br.univali.desktop;

import br.univali.threads.TarefaProdutos;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ProductTableModel extends AbstractTableModel {
    private final String[] columnNames = {"Name", "Description", "Price"};
    private final Map<Integer, Function<Product, Object>> columnValues;

    private List<Product> products;

    public ProductTableModel() {
        products = new ArrayList<>();
        columnValues = new HashMap<>();
        columnValues.put(0, Product::getName);
        columnValues.put(1, Product::getDescription);
        columnValues.put(2, p -> String.format("$%.2f", p.getPrice()));
    }

    public void addProduct(Product product) {
        products.add(product);
        fireTableRowsInserted(products.size() - 1, products.size() - 1);
    }

    public void updateProduct(int row, Product product) {
        products.set(row, product);
        fireTableRowsUpdated(row, row);
        new Thread(new TarefaProdutos(products)).start();
    }

    @Override
    public int getRowCount() {
        return products.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Product product = products.get(rowIndex);
        return columnValues.get(columnIndex).apply(product);
    }

    public Product getProductAt(int row) {
        if (row >= 0 && row < products.size()) {
            return products.get(row);
        }
        return null;
    }
}
