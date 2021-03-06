package Model;

public class Chefe extends Funcionario {

	private float salarioBase;
	private float adcionalFuncao;
	private float beneficioTerno;
	

	public Chefe(int numRegistro, String nome, float SalarioBase, float AdcionalFuncao, float BeneficioTerno) {
		super(numRegistro, nome);
		this.salarioBase = SalarioBase;
		this.adcionalFuncao = AdcionalFuncao;
		this.beneficioTerno = BeneficioTerno;
	}

	public float calculaSalario() {
		return salarioBase * adcionalFuncao / 100 + beneficioTerno;
	}
	
	
}
