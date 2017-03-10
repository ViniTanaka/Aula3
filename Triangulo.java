package br.usjt.arqDeSis.projetoOO;

public class Triangulo extends Poligono {
	public double area, perim, lado1, lado2;
	public Triangulo(double base, double altura, double lado1, double lado2) {
		super(base, altura);
		this.lado1=lado1;
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		area = (base*altura)/2;
		return area;
	}

	@Override
	public double perimetro() {
		perim = lado1 + lado2 + base;
		return perim;
	}

}
