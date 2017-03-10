package br.usjt.arqDeSis.projetoOO;
public class Quadrado extends Poligono implements Diagonal{

	public double diag, area, perimetro;
	public Quadrado(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		area = base * altura;
		return area;
	}
	@Override
	public double diagonal(){
		
		diag = base*Math.sqrt(2);
		return diag ;
	}

	@Override
	public double perimetro() {
		perimetro = altura + altura + base+ base;
		return perimetro;
	}

}
