
public class AppCartao {

	public static void main(String[] args) {

		CartaoPP Cartao1 = new CartaoPP("55360888798443", "Ricardo da S Luna", 28, 11, 1000);
		CartaoCashBack CartaoBronze = new CartaoCashBack("55360888798443", "Raphael da S Luna", 28, 11, 1000, 1);
		CartaoCashBack CartaoPrata = new CartaoCashBack("55360888798443", "Lele S Luna", 28, 11, 10000, 2);
		CartaoCashBack CartaoOuro = new CartaoCashBack("55360888798443", "Andrea Luna", 28, 11, 100000, 3);

		/*
		 * 
		 * System.out.println("\nCartao criado");
		 * 
		 * System.out.println("\nSaldo atual do cartao [" + Cartao1.getSaldo() + "]");
		 * 
		 * Cartao1.adcionarCredito(1700);
		 * 
		 * System.out.println("\nSaldo atual do cartao [" + Cartao1.getSaldo() + "]");
		 * 
		 * if (Cartao1.comprar(1000) == true) {
		 * System.out.println("\nSaldo atual do cartao [" + Cartao1.getSaldo() + "]");}
		 * else { System.out.println("\nCompra negada por saldo"); }
		 * 
		 * 
		 * if (Cartao1.comprar(5000) == true) {
		 * System.out.println("\nSaldo atual do cartao [" + Cartao1.getSaldo() + "]");}
		 * else { System.out.println("\nCompra negada por saldo"); }
		 * 
		 * if (Cartao1.comprar(200) == true) {
		 * System.out.println("\nSaldo atual do cartao [" + Cartao1.getSaldo() + "]");}
		 * else { System.out.println("\nCompra negada por saldo"); }
		 */

		if (Cartao1.comprar(100) == true) {
			System.out.println("\nSaldo atual do cartao [" + Cartao1.getSaldo() + "]");
			System.out.println(Cartao1);
			
		} else {
			System.out.println("\nCompra negada por saldo");
		}

		if (CartaoBronze.comprar(100) == true) {

			System.out.println("\nSaldo atual do cartao [" + CartaoBronze.getSaldo() + "]");
			System.out.println(CartaoBronze);
		}

		if (CartaoPrata.comprar(100) == true) {

			System.out.println("\nSaldo atual do cartao [" + CartaoPrata.getSaldo() + "]");
			System.out.println(CartaoPrata);
		}

		if (CartaoOuro.comprar(100) == true) {

			System.out.println("\nSaldo atual do cartao [" + CartaoOuro.getSaldo() + "]");
			System.out.println(CartaoOuro);
		}

		// CartaoCashBack CartaoPrata = new CartaoCashBack("55360888798443", "Lele S
		// Luna", 28, 11, 2000, 1);
		// CartaoCashBack CartaoOuro

	}

}
