package aula09.palestra;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public abstract void exibirDados();
}
