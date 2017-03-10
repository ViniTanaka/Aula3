package br.usjt.arqDeSis.projetoOO;

public class Paralelograma extends Poligono {

	public double area, perim, lado1, lado2, lado3;
	public Paralelograma(double base, double altura, double lado1, double lado2, double lado3) {
		super(base, altura);	
		this.lado1=lado1;
		this.lado2 = lado2;
		this.lado3 =lado3;
	}

	@Override
	public double area() {
		area = base*altura;
		return area;
	}

	@Override
	public double perimetro() {
		perim = lado1 + lado2 +lado3+ base ;
		return perim;
	}

}
