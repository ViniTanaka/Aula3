package br.usjt.arqDeSis.projetoOO;

public class Esfera implements Volume{
	public double raio, volume;
	public Esfera(double raio){
		this.raio = raio;
	}
	@Override
	public double volume() {
		volume = (4/3)*Math.PI*Math.pow(raio, 3);
		return volume;
	}
	
	
}
