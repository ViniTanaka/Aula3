package br.usjt.arqDeSis.projetoOO;

public class Piramide implements Volume{

	public double base, altura, comprimento, volume;
	public Piramide(double base, double altura, double comprimento) {
		this.base = base;
		this.altura = altura;
		this.comprimento = comprimento;
	}

	@Override
	public double volume() {
		volume = (1/3)*(base*altura*comprimento);
		return volume;
	}

}
