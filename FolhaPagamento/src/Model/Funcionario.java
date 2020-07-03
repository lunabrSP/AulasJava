package Model;

public abstract class Funcionario {

	protected String Nome;
	protected int numRegistro;
	
	public Funcionario(int numRegistro, String nomeFunc) {
		this.Nome = nomeFunc;
		this.numRegistro = numRegistro;
	}

	public abstract float calculaSalario();

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}
	
}
