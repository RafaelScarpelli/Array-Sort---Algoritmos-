package recursividade;

public class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}
	
	@Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
	
}
