import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		int VarI, VarX;
		Scanner GetTeclado = new Scanner (System.in);
		
		QuestaoSimples Questao[] = new QuestaoSimples[3];
		
		Questao[0] = new QuestaoSimples("Qual é a cor do Sol?", "Laranja");
		Questao[1] = new QuestaoComDica("Qual é a cor do Sol?", "Laranja", "Mistura de duas cores primárias");
		Questao[2] = new QuestaoEscolhas("Qual é a cor do Sol?", "Laranja", "Azul", "Amarelo", "Laranja", "Violeta");
	
		for ( VarI = 0; VarI < Questao.length; VarI++) {
			
			System.out.println("\nAplicando a prova. Questao :" + (VarI + 1)+ Questao[VarI].getEnunciado());
			System.out.println(Questao[VarI].aplicarQuestao(GetTeclado.nextLine()));
		}
		
/*		for (VarI=0; VarI <=Questao.length; VarI++) {A
			
				
			System.out.println("\nAplicando a prova:");

			\\corrigir com o ponteiro do for;
			
		}
		
	}
*/
}
}
