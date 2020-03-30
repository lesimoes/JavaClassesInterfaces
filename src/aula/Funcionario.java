package aula;

public class Funcionario {

	
	public String nome;
	public String cpf;
	public double salario;
	
	Funcionario(String nome, String cpf, double salario){
		System.out.println("Construtor de Funcionario");
		if (this.validarCpf(cpf)) {
			this.nome = nome;
			this.cpf = cpf;
			this.salario = salario;
		}
	}
	
	public double bonificacao() {
		return this.salario * 1.10;
	}
	
	public boolean validarCpf(String cpf) {
		if (cpf.length() >= 11) {
			return true;
		}
		return false;
	}

}
