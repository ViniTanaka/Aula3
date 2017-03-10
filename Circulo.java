package br.usjt.arqDeSis.projetoOO;

public class Circulo extends Figura{

	public double area, perim, raio;
	public Circulo(double raio){
		this.raio = raio;
	}
	public void setRaio(double raio){
		this.raio = raio;
	}
	public double getRaio(){
		return raio;
	}
	@Override
	public double area() {
		area = Math.PI* Math.pow(raio, 2);
		return area;
	}

	@Override
	public double perimetro() {
		perim = 2* Math.PI* raio;
		return perim;
	}
}
