package comparacao;

public class Bubble {

	public static long bubbleSort(int[] vetor) {
		long tempoInicial = System.nanoTime();

		int n = vetor.length;
		boolean trocou;

		for (int i = 0; i < n - 1; i++) {
			trocou = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
					trocou = true;
				}
			}
			if (!trocou) {
				break;
			}
		}
		
		long tempoFinal = System.nanoTime();
		return tempoFinal - tempoInicial;
	}
}
