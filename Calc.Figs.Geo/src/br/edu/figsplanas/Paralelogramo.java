package br.edu.figsplanas;

import java.util.Scanner;

public class Paralelogramo {
	// atributos
	
	private double base;
	private double altura;
	private double area;
			
	// métodos
	public void recebeAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Altura do paralelogramo: ");
		altura = sc.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebeBase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Base do paralelogramo: ");
		base = sc.nextDouble();
	}
	
	public void retornaAltura() {
		System.out.println("A altura do paralelogramo é: " + altura);
	}
	
	public void retornaBase() {
		System.out.println("A base do paralelogramo é: " + base);
		
	}
	
	public void retornaArea() {
		System.out.println("A área do triangulo é: " + area);
		
	}
	
	public void calcArea() {
		area = base * altura;
		System.out.println(area);
	}
	
	public void listaAtributos() {
		System.out.println("A altura do paralelogramo é: " + altura);
		System.out.println("A base do paralelogramo é: " + base);
		System.out.println("A área do paralelogramo é: " + area);
		System.out.println("-------------------------------------");
		
	}

}
