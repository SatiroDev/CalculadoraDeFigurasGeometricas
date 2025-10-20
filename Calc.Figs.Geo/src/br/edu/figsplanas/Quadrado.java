package br.edu.figsplanas;

import java.util.Scanner;

public class Quadrado {
	// atributos
	public double lado;
	public double area;
		
	// métodos
	public void recebeLado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do lado: ");
		lado = sc.nextDouble();
	}
	
	public void recebeLado(double h) {
		lado = h;
	}
	

	public void retornaLado() {
		System.out.println("A altura do Quadrado é: " + lado);
	}
	
	
	public void retornaArea() {
		System.out.println("A área do Quadrado é: " + area);
		
	}
	
	public void calcArea() {
		area = Math.pow(lado, 2);
		System.out.println(area);
	}
	
	public void listaAtributos() {
		System.out.println("A altura do Quadrado é: " + lado);
		System.out.println("A área do Quadrado é: " + area);
		System.out.println("-------------------------------------");
		
	}
	
}
