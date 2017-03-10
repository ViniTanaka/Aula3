package br.usjt.arqDeSis.projetoOO;

public class Cilindro implements Volume{
	
	public double raio, altura, volume;
	public Cilindro(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
	}
	@Override
	public double volume() {
		volume = Math.PI*Math.pow(raio, 3)*altura;
		return volume;
	}
	

}
