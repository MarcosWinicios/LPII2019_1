package exerciciocasaportas;

public class Pessoa {
	String nome;
	int idade;
	
	
	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void fazAniversario() {
		this.idade++;
	}
}
