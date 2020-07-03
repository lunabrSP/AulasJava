package Model;

public class Empreiteiro extends Funcionario {

	private float valorEmpreitada;

	public Empreiteiro(int numRegistro, String nomeFunc, float valorEmpreitada) {
		super(numRegistro, nomeFunc);
		this.valorEmpreitada = valorEmpreitada;
	}

	public float calculaSalario() {

		return valorEmpreitada;
	}

	private float getValorEmpreitada() {
		return valorEmpreitada;
	}

	private void setValorEmpreitada(float valorEmpreitada) {
		this.valorEmpreitada = valorEmpreitada;
	}

}
