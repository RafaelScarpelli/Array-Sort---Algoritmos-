package comparacao;

public class Insertion {

	public static long insertionSort(int[] vetor) {
		long tempoInicial = System.nanoTime();

		int n = vetor.length;

		for (int i = 1; i < n; i++) {
			int chave = vetor[i];
			int j = i - 1;

			while (j >= 0 && vetor[j] > chave) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = chave;
		}
		
		long tempoFinal = System.nanoTime();
		return tempoFinal - tempoInicial;
	}
}
