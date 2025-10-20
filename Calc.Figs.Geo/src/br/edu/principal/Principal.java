package br.edu.principal;

import br.edu.figsplanas.*;

public class Principal {

	public static void main(String[] args) {
		Triangulo obj1 = new Triangulo();
		obj1.recebeAltura();
		obj1.recebeBase();
		obj1.calcArea();
		obj1.retornaArea();
		obj1.listaAtributos();
		
		Quadrado obj2 = new Quadrado();
		obj2.recebeLado();
		obj2.calcArea();
		obj2.retornaArea();
		obj2.listaAtributos();
		
		Hexagono obj3 = new Hexagono();
		obj3.recebeLado();
		obj3.calcArea();
		obj3.retornaArea();
		obj3.listaAtributos();
		
		Circulo obj4 = new Circulo();
		obj4.recebeRaio();
		obj4.calcArea();
		obj4.retornaArea();
		obj4.listaAtributos();
		
		Losango obj5 = new Losango();
		obj5.recebeDiametroMaior();
		obj5.recebeDiametroMenor();
		obj5.calcArea();
		obj5.listaAtributos();
		
		Paralelogramo obj6 = new Paralelogramo();
		obj6.recebeAltura();
		obj6.recebeBase();
		obj6.calcArea();
		obj6.listaAtributos();
		
		Pentagono obj7 = new Pentagono();
		obj7.recebeLado();
		obj7.calcArea();
		obj7.listaAtributos();
		
		Trapezio obj8 = new Trapezio();
		obj8.recebeAltura();
		obj8.recebeBaseMaior();
		obj8.recebeBaseMenor();
		obj8.calcArea();
		obj8.retornaArea();
		obj8.listaAtributos();

		Retangulo obj9 = new Retangulo();
		obj9.recebeAltura();
		obj9.recebeBase();
		obj9.calcArea();
		obj9.retornaArea();
		obj9.listaAtributos();
	}
}
