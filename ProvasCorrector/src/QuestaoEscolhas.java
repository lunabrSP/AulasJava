
public class QuestaoEscolhas extends QuestaoSimples {

	protected String Escolha1;
	protected String Escolha2;
	protected String Escolha3;
	protected String Escolha4;
	

	protected QuestaoEscolhas(String enunciado, String resposta, String Alternativa1, String Alternativa2, String Alternativa3, String Alternativa4) {
		super(enunciado, resposta);
		
		this.Escolha1 = Alternativa1;
		this.Escolha2 = Alternativa2;
		this.Escolha3 = Alternativa3;
		this.Escolha4 = Alternativa4;
	
	}
	
	
	
	
}