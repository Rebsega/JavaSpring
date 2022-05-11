package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();

	static {
		Empresa emp = new Empresa();
		emp.setNome("Alura");
		Empresa emp2 = new Empresa();
		emp2.setNome("Caelum");
		lista.add(emp);
		lista.add(emp2);
	}
	
	public void adiciona(Empresa emp) {
		Banco.lista.add(emp);
		System.out.println(lista);
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}
