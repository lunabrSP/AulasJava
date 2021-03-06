
public class CartaoPP {

	protected String numeroCartao;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	public CartaoPP(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}

		
	protected String getNumeroCartao() {
		return numeroCartao;
	}



	protected void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}



	protected String getNomeTitular() {
		return nomeTitular;
	}



	protected void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}



	protected int getAnoValidade() {
		return anoValidade;
	}



	protected void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}



	protected int getMesValidade() {
		return mesValidade;
	}



	protected void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}



	protected double getSaldo() {
		return saldo;
	}



	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public void adcionarCredito(double valor) {
		if (valor >0 ) {
			
			setSaldo(getSaldo() + valor);
		}
	}

	public boolean comprar(double valor) {
		
		if (valor <= getSaldo()) {
			setSaldo(saldo - valor);
			return true;
		} else {
			
			return false;
		}
		
	}
	
	public String toString () {
		
		return "Operacao C.C.\n: [nome do titular: " + nomeTitular 
				+ ", Numero do cartao: "+ numeroCartao 
				+ ", Ano Validade: " + anoValidade 
				+ ", Saldo:R$ " + saldo;
		
	}
	
}
