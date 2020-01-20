package com.br.POO.GFT;

import java.util.*;
import java.util.List;
import java.awt.*;



public class Main  {
	
	public static void main(String[] args) {

		
		Pessoa l1 = new Pessoa("João",15);
		Pessoa l2 = new Pessoa("Leandro",21);
		Pessoa l3 = new Pessoa("Paulo",17);
		Pessoa l4 = new Pessoa("Jessica",18);
		
		List<Pessoa> pessoa = new ArrayList<>();
		
		pessoa.add(l1);
		pessoa.add(l2);
		pessoa.add(l3);
		pessoa.add(l4);
		
		int q = 0,w = 0,t= 0,y = 0;
		
		for(int i = 0; i <pessoa.size();i++ ) {
			if(pessoa.get(i).getIdade() > q) {
				q = pessoa.get(i).getIdade();
				w = i;
	
			}
			
		}
		System.out.println("Pessoa Mais Velha --------------------------------------------------------------");
		
		System.out.println(" Nome :  " + pessoa.get(w).getNome()  + "  Idade:  " + pessoa.get(w).getIdade());
		
		System.out.println("Antes---------------------------------------------------------------------------");
		
		
		for(int i = 0; i< pessoa.size(); i++) {
			
			System.out.println("Nome :  " + pessoa.get(i).getNome()  + "  Idade:  " + pessoa.get(i).getIdade());
			
			
			
			}
		System.out.println("Depois-----------------------------------------------------------------------");
		
		for(int j = 0; j< pessoa.size(); j++) {
			
			if(pessoa.get(j).getIdade() < 18 ){
				pessoa.remove(j);
				t = j;				
			}
			
			
			System.out.println("Nome :  " + pessoa.get(t).getNome()  + "  Idade:  " + pessoa.get(t).getIdade());
				
		}
		

		for(int k = 0; k< pessoa.size(); k++) {
			
			if(pessoa.get(k).getNome() == "Jessica" ){
				
				y = k;				
			}
			
			
			
				
		}
		System.out.println("Nome-------------------------------------------------------------------------");
		
		System.out.println("Nome :  " + pessoa.get(y).getNome()  + "  Idade:  " + pessoa.get(y).getIdade());

	}
	
}
