package br.usjt.arqDeSis.projetoOO;

public class Retangulo extends Poligono implements Diagonal{
	
	public double diag, soma, area, perim;
	public Retangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		area = base * altura;
		return area;
	}

	@Override
	public double diagonal() {
		soma = (Math.pow(base, 2)) + (Math.pow(altura, 2));
		diag = Math.sqrt(soma);
		return diag;
	}

	@Override
	public double perimetro() {
		perim = 2*base + 2*altura;
		return perim;
	}

}
