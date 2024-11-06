package comparacao;

public class Selection {
	
	public static long selectionSort(int[] vetor) {
        long tempoInicial = System.nanoTime();
        
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                	indiceMenor = j;
                }
            }
            
            int temp = vetor[indiceMenor];
            vetor[indiceMenor] = vetor[i];
            vetor[i] = temp;
        }
        
        long tempoFinal = System.nanoTime();
        return tempoFinal - tempoInicial;
    }
}
