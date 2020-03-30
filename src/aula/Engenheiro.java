package aula;

import aula.RH;

public class Engenheiro implements IFuncionario{

	public String nome;
	public String cpf;
	public String cursoSuperior;
	public double salario;
	
	Engenheiro(String nome, String cpf, String cursoSuperior, double salario){
		if (RH.validarCPF(cpf)) {
			this.nome = nome;
			this.cpf = cpf;
			this.cursoSuperior = cursoSuperior;
			this.salario = salario;
		}
	}

	@Override
	public double bonificacao() {
		return this.salario * 1.20;
	}

	
	
}
