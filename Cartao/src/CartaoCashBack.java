
public class CartaoCashBack extends CartaoPP{

	protected int tipo;
		
	protected CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo, int tipCartao) 
	{
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipCartao;
		
	}

	@Override
	public boolean comprar(double valor) {
		// TODO Auto-generated method stub
		
		if (valor <= getSaldo()) {
						
			switch (tipo) {
			case 1:
				setSaldo(saldo - valor +  (valor * .02)); 
				break;

			case 2:
				setSaldo(saldo - valor + (valor * .05));				
				break;
				
			case 3:
				setSaldo(saldo - valor +  (valor * .08));
				break;
				
			default:
				break;
			}
			
			return true;
		} else {
			
			return false;
		}
	}

	public String toString () {
		
		String Classe = "";
		
		switch (tipo) {case 1: Classe = "Bronze"; break; case 2: Classe = "Prata"; break; case 3: Classe = "Ouro"; break; default: break;}

		
		return "Operacao C.C.\n:"
				+ "\nOperacao CashBack " + Classe
				+ "[nome do titular: " + nomeTitular 
				+ ", Numero do cartao: "+ numeroCartao 
				+ ", Ano Validade: " + anoValidade 
				+ ", Saldo:R$ " + saldo;
		
	}
		
	
}

