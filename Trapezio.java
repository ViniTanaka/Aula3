package br.usjt.arqDeSis.projetoOO;

public class Trapezio extends Poligono {

	public double baseMenor, lado1, lado2, area, perim;
	public Trapezio(double base, double altura, double baseMenor, double lado1, double lado2) {
		super(base, altura);
		this.baseMenor = baseMenor;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		area = ((base+baseMenor)*altura)/2;
		return area;
	}

	@Override
	public double perimetro() {
		perim = base+baseMenor+lado1+lado2;
		return perim;
	}

}
