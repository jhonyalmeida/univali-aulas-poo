package br.univali.aula13;

public interface PessoaFacade {
    Pessoa createPessoa(Pessoa pessoa);
    Pessoa updatePessoa(Pessoa pessoa);
    Pessoa getPessoa();
    void deletePessoa(Pessoa pessoa);
}
