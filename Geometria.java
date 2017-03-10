package br.usjt.arqDeSis.projetoOO;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Geometria {
	public ArrayList <Figura> figuras;
	public double base, altura, lado1, lado2, lado3, raio;
	public Geometria(){
		figuras = new ArrayList<Figura>();
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do poligono"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do poligono"));
		lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 1 do poligono"));
		lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 2 do poligono"));
		lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado 3 do poligono"));
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do poligono"));
		
		Quadrado quad = new Quadrado(base, altura);
		Retangulo ret = new Retangulo(base, altura);
		Losango los = new Losango (base, altura);
		Paralelograma parale = new Paralelograma(base, altura, lado1, lado2, lado3);
		Triangulo tri = new Triangulo (base, altura, lado1, lado2);
		Circulo circ = new Circulo (raio);
		figuras.add(quad);
		figuras.add(ret);
		figuras.add(los);
		figuras.add(parale);
		figuras.add(tri);
		figuras.add(circ);
		
		JOptionPane.showMessageDialog(null, 
				"Area do quadrado: " + quad.area()+"\n"+
				"Perimetro do quadrado: "+ quad.perimetro()+"\n"+
				"Diagonal do quadrado: "+ quad.diagonal()+"\n"+
				"Area do retangulo: "+ ret.area() +"\n"+
				"Perimetro do retangulo: "+ret.perimetro()+"\n"+
				"Diagonal do retangulo: "+ ret.diagonal()+"\n"+
				"Area do losango: "+los.area()+"\n"+
				"Perimetro do losango: "+los.perimetro()+"\n"+
				"Area do paralelograma: "+parale.area()+"\n"+
				"Perimetro do paralelograma: "+parale.perimetro()+"\n"+
				"Area do triangulo: "+ tri.area()+"\n"+
				"Perimetro do triangulo: "+ tri.perimetro()+"\n"+
				"Area do circulo: "+circ.area()+"\n"+
				"Perimetro do circulo: "+circ.perimetro());
		
		
	}
	
}
