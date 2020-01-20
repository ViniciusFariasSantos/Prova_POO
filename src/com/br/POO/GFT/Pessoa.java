package com.br.POO.GFT;

public class Pessoa {
	
	String Nome;
	int Idade;
	public Pessoa(String nome, int idade) {
		super();
		Nome = nome;
		Idade = idade;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}

	
	
}
