package br.edu.figsplanas;

import java.util.Scanner;

public class Losango {
	// atributos
	public double dMaior;
	public double dMenor;
	public double area;	
	// métodos
	
	public void recebeDiametroMaior() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do diametro maior: ");
		dMaior = sc.nextDouble();
	}
	
	public void recebeDiametroMenor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do diametro menor: ");
		dMenor = sc.nextDouble();
	}
	
	public void recebeDiametroMaior(double H) {
		dMaior = H;
	}
	
	public void recebeDiametroMenor(double h) {
		dMenor = h;
	}
	
	
	public void retornaDiametroMaior() {
		System.out.println("O diametro maior do losango é: " + dMaior);
	}
	
	public void retornaDiametroMenor() {
		System.out.println("O diametro menor do losango é: " + dMenor);
	}
	
	public void retornaArea() {
		System.out.println("A área do losango é: " + area);
	}
	
	public void calcArea() {
		area = dMaior * dMenor;
		System.out.println(area);
	}
	
	public void listaAtributos() {
		System.out.println("O diametro maior do losango é: " + dMaior);
		System.out.println("O diametro menor do losango é: " + dMenor);
		System.out.println("A área do losango é: " + area);
		System.out.println("-------------------------------------");
		
	}

}