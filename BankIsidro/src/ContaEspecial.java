
public class ContaEspecial extends conta {

	private float Limite;
	
	public ContaEspecial(String titular, String cpf, int nc, float saldo, float limite) {
		
		super(titular, cpf, nc, saldo);
		this.Limite = limite;	
	}

	public boolean debitar (float valor) {
		
		if (valor <= super.Saldo + this.Limite) {
			
			super.Saldo = super.Saldo - valor;
			return true;
			
		} else {
			return false;
		}
	}
	
	public String toString () {
		
		return "Conta :[nome do titular: " + NomeTitular + ", cpf: "+ CPf + ", numero da conta: " + NumeroConta + ", saldo: R$ " + Saldo + ", limite: R$ " + Limite;
	
		
	}

}
