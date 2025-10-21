package br.edu.figsplanas;

import java.util.Scanner;

public class Circulo {
	// atributos
	private double area;
	private double raio;
			
	// métodos
	public void recebeRaio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
	}
	
	public void recebeRaio(double h) {
		raio = h;
	}
	
	
	public void retornaRaio() {
		System.out.println("O raio do circulo é: " + raio);
	}
	
	
	public void retornaArea() {
		System.out.println("A área do triangulo é: " + area);
		
	}
	
	public void calcArea() {
		area = 3.14 * Math.pow(raio, 2);
		System.out.println(area);
	}
	
	public void listaAtributos() {
		System.out.println("O raio do circulo é: " + raio);
		System.out.println("A área do triangulo é: " + area);
		System.out.println("-------------------------------------");
	}
	
}

