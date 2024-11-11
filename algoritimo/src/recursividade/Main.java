package recursividade;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// Ex 1
		String palavra = "arara";
		System.out.println(palindromo(palavra, 0, palavra.length() - 1));

		// Ex 2
		double[] vetor = { 1, 2, 3, 4, 5, 5 };
		System.out.println(somarArray(vetor, 0));

		// Ex 3
		System.out.println(contarLetra('a', palavra, 0));

		// Ex 4
		int n = 2;
		System.out.println(fibonacci(n));

		// Ex 5
		int numero = 12345;
		System.out.println(somarDigitos(numero));

		// Ex 6
		String inverter = "rafael";
		System.out.println(inverterString(inverter));

	}

	// Ex 1
	private static boolean palindromo(String palavra, int inicio, int fim) {

		// se os indices se cruzarem significa que a palavra retorna true pois vai estar pulando todos os false
		if (inicio >= fim) {
			return true;
		}
		if (palavra.charAt(inicio) != palavra.charAt(fim)) {
			return false;
		}
		return palindromo(palavra, inicio + 1, fim - 1);
	}

	// Ex 2
	private static double somarArray(double[] vetor, int i) {

		if (i >= vetor.length) {
			return 0;
		}
		return vetor[i] + somarArray(vetor, i + 1);
	}

	// Ex 3
	public static int contarLetra(char letra, String palavra, int i) {

		if (i >= palavra.length()) {
			return 0;
		}

		if (palavra.charAt(i) != letra) {
			return 0 + contarLetra(letra, palavra, i + 1);
		}

		return 1 + contarLetra(letra, palavra, i + 1);
	}

	// Ex 4
	public static int fibonacci(int n) {

		if (n < 2) {
			return n;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// Ex 5
	public static int somarDigitos(int numero) {

		String numeroStr = Integer.toString(numero);

		return somarDigitosAux(numeroStr);
	}

	public static int somarDigitosAux(String numero) {
		if (numero.isEmpty()) {
			return 0;
		}
		int digito = Integer.parseInt(numero.substring(0, 1));

		return digito + somarDigitosAux(numero.substring(1));
	}

	// Ex 6
	public static String inverterString(String palavra) {

		if (palavra.isEmpty() || palavra.length() == 1) {
			return palavra;
		}

		return palavra.charAt(palavra.length() - 1) + inverterString(palavra.substring(0, palavra.length() - 1));
	}
}
