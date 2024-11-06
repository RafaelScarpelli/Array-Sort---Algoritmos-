package comparacao;

import java.util.Random;

public class Teste {

	public static void main(String[] args) {

		int[] vetorTeste = gerarVetor(10000);

		long tempoDeExecucaoBubble = Bubble.bubbleSort(vetorTeste);
		System.out.println("Tempo de execução Bubble: " + tempoDeExecucaoBubble + " nanosegundos");
		
		long tempoDeExecucaoInsertion = Insertion.insertionSort(vetorTeste);
		System.out.println("Tempo de execução Insertion: " + tempoDeExecucaoInsertion + " nanosegundos");
		
		long tempoDeExecucaoSelection = Selection.selectionSort(vetorTeste);
		System.out.println("Tempo de execução Selection: " + tempoDeExecucaoSelection + " nanosegundos");
		
		long tempoDeExecucaoMerge = MergeS.tempoMerge(vetorTeste);
		System.out.println("Tempo de execução Merge: " + tempoDeExecucaoMerge + " nanosegundos");
		
		

	}

	public static int[] gerarVetor(int tamanho) {

		Random random = new Random();
		int[] vetor = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vetor[i] = random.nextInt(1000);
		}

		return vetor;
	}
}
