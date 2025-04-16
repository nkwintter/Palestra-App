package aula09.palestra;

public class Palestrante extends Pessoa{
	
	private String temaPalestra;

	public Palestrante(String nome, String cpf, String temaPalestra) {
		super(nome, cpf);
		this.temaPalestra = temaPalestra;

	}

	@Override
	public void exibirDados() {
		System.out.printf("Nome: %s"
				+ "\nCPF: %s"
				+ "\nTema da palestra: %s \n", getNome(), getCpf(), temaPalestra);
	}
	
}
