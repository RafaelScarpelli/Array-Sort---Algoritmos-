package comparacao;

public class MergeS {
	
	public static long tempoMerge(int[] vetor) {
		long tempoInicial = System.nanoTime();
		
		mergeSort(vetor, 0, vetor.length - 1);

        long tempoFinal = System.nanoTime();
        return tempoFinal - tempoInicial;
	}
	
	public static void mergeSort(int[] vetor, int inicio, int fim) {
		
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;

			mergeSort(vetor, inicio, meio);
			mergeSort(vetor, meio + 1, fim);

			merge(vetor, inicio, meio, fim);
		}
	}

	public static void merge(int[] vetor, int inicio, int meio, int fim) {
		
		int n1 = meio - inicio + 1;
		int n2 = fim - meio;

		// Arrays temporários
		int[] vetorEsquerdo = new int[n1];
		int[] vetorDireito = new int[n2];

		for (int i = 0; i < n1; i++) {
			vetorEsquerdo[i] = vetor[inicio + i];
		}
		for (int j = 0; j < n2; j++) {
			vetorDireito[j] = vetor[meio + 1 + j];
		}

		int i = 0, j = 0;
		int k = inicio;

		while (i < n1 && j < n2) {
			if (vetorEsquerdo[i] <= vetorDireito[j]) {
				vetor[k] = vetorEsquerdo[i];
				i++;
			} else {
				vetor[k] = vetorDireito[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			vetor[k] = vetorEsquerdo[i];
			i++;
			k++;
		}

		while (j < n2) {
			vetor[k] = vetorDireito[j];
			j++;
			k++;
		}
	}

}
