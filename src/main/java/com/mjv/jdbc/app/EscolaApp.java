package com.mjv.jdbc.app;

import com.mjv.jdbc.repository.AlunoRepository;
import com.mjv.jdbc.model.Aluno;

public class EscolaApp {
	public static void main(String[] args) {
	 try {
		 Aluno carla = new Aluno();
		 carla.setAltura(1.58);
		 carla.setAtivo(true);
		 carla.setNome("CARLA");
		 carla.setSexo("F");
		 
		 Aluno antonio = new Aluno();
		 antonio.setAltura(1.65);
		 antonio.setAtivo(true);
		 antonio.setNome("ANTONIO");
		 antonio.setSexo("M");
		 
		 AlunoRepository alunoRepository = new AlunoRepository();
		 alunoRepository.gravar(carla);
		 alunoRepository.gravar(antonio);
	 
	 }catch (Exception e) {
		e.printStackTrace();
	}
  }

}
