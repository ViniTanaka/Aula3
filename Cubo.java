package br.usjt.arqDeSis.projetoOO;

public class Cubo extends Quadrado implements Volume{

	public double comprimento, volume;
	public Cubo(double base, double altura, double comprimento) {
		super(base, altura);
		this.comprimento = comprimento;
	}
	@Override
	public double volume() {
		volume = base*altura*comprimento;
		return volume;
	}
	

}
