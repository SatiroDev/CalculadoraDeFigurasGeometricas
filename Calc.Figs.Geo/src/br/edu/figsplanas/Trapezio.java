package br.edu.figsplanas;

import java.util.Scanner;

public class Trapezio {
	// atributos
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
			
	// métodos
	public void recebeAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Altura: ");
		altura = sc.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebeBaseMaior() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Base Maior: ");
		baseMaior = sc.nextDouble();
	}
	
	public void recebeBaseMaior(double h) {
		baseMaior = h;
	}
	
	public void recebeBaseMenor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da Base Menor: ");
		baseMenor = sc.nextDouble();
	}
	
	public void recebeBaseMenor(double h) {
		baseMenor = h;
	}
	
	
	public void retornaAltura() {
		System.out.println("A altura do trapezio é: " + altura);
	}
	
	public void retornaBaseMaior() {
		System.out.println("A base maior do trapezio é: " + baseMaior);
		
	}
	
	public void retornaBaseMenor() {
		System.out.println("A base menor do trapezio é: " + baseMenor);
		
	}
	
	public void retornaArea() {
		System.out.println("A área do trapezio é: " + area);
		
	}
	
	public void calcArea() {
		area = ((baseMaior * baseMenor) * altura)/2;
		System.out.println(area);
	}
	
	public void listaAtributos() {
		System.out.println("A altura do trapezio é: " + altura);
		System.out.println("A base maior do trapezio é: " + baseMaior);
		System.out.println("A base menor do trapezio é: " + baseMenor);
		System.out.println("A área do trapezio é: " + area);
		System.out.println("-------------------------------------");
		
	}

}
