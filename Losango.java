package br.usjt.arqDeSis.projetoOO;

public class Losango extends Poligono {

	public double area, perim;
	public Losango(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		area = base * altura;
		return area;
	}

	@Override
	public double perimetro() {
		perim = 4 * base;
		return perim;
	}


}
