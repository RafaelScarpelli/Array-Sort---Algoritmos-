package recursividade;

public class Merge {

	public static void main(String[] args) {

		// Ex 7
		int[][] matriz = { { 12, 11, 13, 5, 6 }, { 7, 2, 3, 14, 10 }, { 4, 8, 1, 15, 9 } };

		mergeSortMatriz(matriz);
		printMatriz(matriz);
		
		System.out.println();

		// Ex 8
		Pessoa[] pessoas = { new Pessoa("Ana", 24), new Pessoa("Bruno", 30), new Pessoa("Carlos", 20),
				new Pessoa("Diana", 27), new Pessoa("Eduardo", 22) };
		
		mergeSortObjeto(pessoas, 0, pessoas.length - 1);
		printObejto(pessoas);
		
		System.out.println();
		
		// Ex 9
		String[] palavras = { "ca", "aa", "ab", "b", "ab", "ba", "r", "a" };
		
		mergeSortString(palavras, 0, palavras.length - 1);
		printString(palavras);
		

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

	// Ex 7
	public static void mergeSortMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			mergeSort(matriz[i], 0, matriz[i].length - 1);
		}
	}

	public static void printMatriz(int[][] matriz) {
		for (int[] linha : matriz) {
			for (int elemento : linha) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}

	// Ex 8
	public static void mergeSortObjeto(Pessoa[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;

			mergeSortObjeto(vetor, inicio, meio);
			mergeSortObjeto(vetor, meio + 1, fim);

			mergeObjeto(vetor, inicio, meio, fim);
		}
	}

	public static void mergeObjeto(Pessoa[] vetor, int inicio, int meio, int fim) {
		int n1 = meio - inicio + 1;
		int n2 = fim - meio;

		Pessoa[] vetorEsquerdo = new Pessoa[n1];
		Pessoa[] vetorDireito = new Pessoa[n2];

		for (int i = 0; i < n1; i++) {
			vetorEsquerdo[i] = vetor[inicio + i];
		}
		for (int j = 0; j < n2; j++) {
			vetorDireito[j] = vetor[meio + 1 + j];
		}

		int i = 0, j = 0;
		int k = inicio;

		while (i < n1 && j < n2) {
			if (vetorEsquerdo[i].getIdade() <= vetorDireito[j].getIdade()) {
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

	public static void printObejto(Pessoa[] vetor) {
		for (Pessoa pessoa : vetor) {
			System.out.println(pessoa);
		}
	}

	// Ex 9
	public static void mergeSortString(String[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;

			mergeSortString(vetor, inicio, meio);
			mergeSortString(vetor, meio + 1, fim);

			mergeString(vetor, inicio, meio, fim);
		}
	}
	
	public static void mergeString(String[] vetor, int inicio, int meio, int fim) {
		int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        String[] leftArray = new String[n1];
        String[] rightArray = new String[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = vetor[inicio + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = vetor[meio + 1 + j];
        }
        
        int i = 0, j = 0;
        int k = inicio;

        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                vetor[k] = leftArray[i];
                i++;
            } else {
                vetor[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            vetor[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            vetor[k] = rightArray[j];
            j++;
            k++;
        }
	}
	
	public static void printString(String[] vetor) {
        for (String str : vetor) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
