package br.edu.figsplanas;

import java.util.Scanner;

public class Retangulo {
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
	
	public void recebeBase(double h) {
		base = h;
	}
	
	public void retornaAltura() {
		System.out.println("A altura do retangulo é: " + altura);
	}
	
	public void retornaBase() {
		System.out.println("A base do retangulo é: " + base);
		
	}
	
	public void retornaArea() {
		System.out.println("A área do retangulo é: " + area);
		
	}
	
	public void calcArea() {
		area = base * altura;
	}
	
	public void listaAtributos() {
		System.out.println("A altura do retangulo é: " + altura);
		System.out.println("A base do retangulo é: " + base);
		System.out.println("A área do retangulo é: " + area);
		System.out.println("-------------------------------------");
		
	}
}