package comparacao;

import java.util.Random;

public class Teste {

	public static void main(String[] args) {

		int[] vetorTeste1 = gerarVetor(10000);
		int[] vetorTeste2 = vetorTeste1.clone();
		int[] vetorTeste3 = vetorTeste1.clone();
		int[] vetorTeste4 = vetorTeste1.clone();

		long tempoDeExecucaoBubble = Bubble.bubbleSort(vetorTeste1);
		System.out.println("Tempo de execução Bubble: " + tempoDeExecucaoBubble + " nanosegundos");
		
		long tempoDeExecucaoInsertion = Insertion.insertionSort(vetorTeste2);
		System.out.println("Tempo de execução Insertion: " + tempoDeExecucaoInsertion + " nanosegundos");
		
		long tempoDeExecucaoSelection = Selection.selectionSort(vetorTeste3);
		System.out.println("Tempo de execução Selection: " + tempoDeExecucaoSelection + " nanosegundos");
		
		long tempoDeExecucaoMerge = MergeS.tempoMerge(vetorTeste4);
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
