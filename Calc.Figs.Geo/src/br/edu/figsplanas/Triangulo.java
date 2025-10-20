package br.edu.figsplanas;

import java.util.Scanner;

public class Triangulo {
	
	// atributos
	public double base;
	public double altura;
	public double area;
	
	// métodos
	
	public void recebeAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Altura: ");
		altura = sc.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebeBase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Base: ");
		base = sc.nextDouble();
	}
	
	public void retornaAltura() {
		System.out.println("A altura do triangulo é: " + altura);
	}
	
	public void retornaBase() {
		System.out.println("A base do triangulo é: " + base);
		
	}
	
	public void retornaArea() {
		System.out.println("A área do triangulo é: " + area);
		
	}
	
	public void calcArea() {
		area = (base * altura) /2;
	}
	
	public void listaAtributos() {
		System.out.println("A altura do triangulo é: " + altura);
		System.out.println("A base do triangulo é: " + base);
		System.out.println("A área do triangulo é: " + area);
		System.out.println("-------------------------------------");
	}
}
