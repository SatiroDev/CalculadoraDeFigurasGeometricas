package br.edu.figsplanas;

import java.util.Scanner;

public class Hexagono {
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
		System.out.println("O lado do hexagono é: " + lado);
	}
	
	
	public void retornaArea() {
		System.out.println("A área do hexagono é: " + area);
		
	}
	
	public void calcArea() {
		area = (3 * Math.pow(lado, 2) * Math.sqrt(3)) / 2;
		System.out.println(area);
	}
	
	public void listaAtributos() {
		System.out.println("O lado do hexagono é: " + lado);
		System.out.println("A área do hexagono é: " + area);
		System.out.println("-------------------------------------");
		
	}
}