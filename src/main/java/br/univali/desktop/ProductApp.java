package br.univali.desktop;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ProductApp extends JFrame {
    private final ProductTableModel tableModel;
    private JTable productTable;
    private JTextField nameField;
    private JTextArea descriptionArea;
    private JTextField priceField;
    private JButton addButton;
    private JButton updateButton;
    private JButton clearButton;
    private int selectedRow = -1;

    public ProductApp() {
        setTitle("Product Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Initialize table model and table
        tableModel = new ProductTableModel();
        productTable = new JTable(tableModel);
        productTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        productTable.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int row = productTable.getSelectedRow();
                if (row >= 0) {
                    selectedRow = row;
                    Product product = tableModel.getProductAt(row);
                    if (product != null) {
                        nameField.setText(product.getName());
                        descriptionArea.setText(product.getDescription());
                        priceField.setText(String.valueOf(product.getPrice()));
                        updateButton.setEnabled(true);
                        addButton.setEnabled(false);
                    }
                }
            }
        });

        // Create form panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createTitledBorder("Product Details"));
        formPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Name field
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        gbc.weightx = 1.0;
        nameField = new JTextField(20);
        formPanel.add(nameField, gbc);

        // Description field
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Description:"), gbc);
        gbc.gridx = 1;
        descriptionArea = new JTextArea(3, 20);
        formPanel.add(new JScrollPane(descriptionArea), gbc);

        // Price field
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Price:"), gbc);
        gbc.gridx = 1;
        priceField = new JTextField(20);
        formPanel.add(priceField, gbc);

        // Buttons panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        clearButton = new JButton("Clear");
        updateButton.setEnabled(false);

        addButton.addActionListener(this::addProduct);
        updateButton.addActionListener(this::updateProduct);
        clearButton.addActionListener(e -> clearForm());

        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(clearButton);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        formPanel.add(buttonPanel, gbc);

        // Main layout
        setLayout(new BorderLayout(10, 10));
        add(new JScrollPane(productTable), BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);

        // Add some sample data
        addSampleData();
    }


    private void addSampleData() {
        tableModel.addProduct(new Product("Laptop", "High-performance laptop with SSD", 999.99));
        tableModel.addProduct(new Product("Smartphone", "Latest smartphone model", 699.99));
        tableModel.addProduct(new Product("Headphones", "Noise-cancelling wireless headphones", 199.99));
    }

    private void addProduct(ActionEvent e) {
        try {
            String name = nameField.getText().trim();
            String description = descriptionArea.getText().trim();
            double price = Double.parseDouble(priceField.getText().trim());

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a product name", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Product product = new Product(name, description, price);
            tableModel.addProduct(product);
            clearForm();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid price", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateProduct(ActionEvent e) {
        if (selectedRow >= 0) {
            try {
                String name = nameField.getText().trim();
                String description = descriptionArea.getText().trim();
                double price = Double.parseDouble(priceField.getText().trim());

                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter a product name", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Product updatedProduct = new Product(name, description, price);
                tableModel.updateProduct(selectedRow, updatedProduct);
                clearForm();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid price", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void clearForm() {
        nameField.setText("");
        descriptionArea.setText("");
        priceField.setText("");
        selectedRow = -1;
        productTable.clearSelection();
        updateButton.setEnabled(false);
        addButton.setEnabled(true);
    }

    public static final void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            ProductApp app = new ProductApp();
            app.setVisible(true);
        });
    }
}
