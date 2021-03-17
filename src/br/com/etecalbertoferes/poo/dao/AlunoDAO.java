package br.com.etecalbertoferes.poo.dao;

import br.com.etecalbertoferes.poo.model.Aluno;

import java.util.List;

public interface AlunoDAO {
    void inserir(Aluno aluno);
    void buscarPorRM(long rm);
    void apagar(long rm);
    List<Aluno> buscarTodos();
    Aluno atualizar(Aluno aluno);
}
