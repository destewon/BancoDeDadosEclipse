package br.com.foursys.banco.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.banco.dao.AlunoDAO;
import br.com.foursys.banco.model.Aluno;

public class TestaAlterarAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection bd = ConnectionFactory.getConnection();
			Aluno al = new Aluno("Teste", "sdeqws", 28);
			AlunoDAO dao = new AlunoDAO(bd);
			dao.alterar(al);
			System.out.println("Aluno alterado com sucesso!!!");
			bd.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro ao alterar o aluno!!!");
		}

	}

}
