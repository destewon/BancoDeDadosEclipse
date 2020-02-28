package br.com.foursys.banco.util;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.foursys.banco.dao.AlunoDAO;
import br.com.foursys.banco.model.Aluno;

public class TestaBuscarTodosAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection bd = ConnectionFactory.getConnection();

		// Aluno al =new Aluno("Teste","jau",20);

		AlunoDAO dao = new AlunoDAO(bd);

		try {
			List<Aluno> alunos = dao.buscarTodos();
			// dao.buscarTodos();

			for (Aluno aluno : alunos) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Cidade: " + aluno.getCidade());
				System.out.println("idade: " + aluno.getIdade());
				System.out.println();
			}
			// System.out.println("Aluno buscado com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao buscar o aluno!!!");
		}

	}

}
