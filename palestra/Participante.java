package aula09.palestra;

public class Participante extends Pessoa{
	private String email;

	public Participante(String nome, String cpf, String email) {
		super(nome, cpf);
		this.email = email;
	}

	@Override
	public void exibirDados() {
		System.out.printf("Nome: %s"
				+ "\nCPF: %s"
				+ "\nEmail: %s \n", getNome(), getCpf(), email);
	}

}
