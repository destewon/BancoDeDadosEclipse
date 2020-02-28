package br.com.foursys.banco.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.banco.dao.AlunoDAO;
import br.com.foursys.banco.model.Aluno;

public class TestaExluirAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection bd = ConnectionFactory.getConnection();

		Aluno al = new Aluno("Teste", "jau", 20);

		AlunoDAO dao = new AlunoDAO(bd);

		try {
			dao.excluir(al);
			System.out.println("Aluno excluido com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao excluir o aluno!!!");
		}

	}

}
