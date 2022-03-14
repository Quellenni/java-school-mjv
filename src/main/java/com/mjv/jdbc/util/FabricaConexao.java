package com.mjv.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
	private static Connection conexao;
	public static void abrirConexao() throws Exception {
		if(conexao == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/mjv_school_db";
			String user = "root";
			String pass = "rootmysql";
			
			conexao = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexao realizada com sucesso");
		}
			
		
	}
	public static Connection getConexao() {
			return conexao;
	}
}
