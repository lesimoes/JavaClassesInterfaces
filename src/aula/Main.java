package aula;

public class Main {

	public static void main(String[] args) {
		
		Analista winglerson = new Analista("Winglerson", "111111111111111", 20000);
		System.out.println(winglerson.nome);
		
		Engenheiro ze = new Engenheiro("Jose", "222222222222222", "Engenharia", 30000);
		System.out.println(ze.nome + " - " + ze.cursoSuperior);
		
				
		System.out.println(bonificacao(winglerson));
		System.out.println(bonificacaoInterface(ze));

	}
	
	public static double bonificacaoInterface(IFuncionario funcionario) {
		return funcionario.bonificacao();
	}
	
	public static double bonificacao(Funcionario funcionario) {
		return funcionario.bonificacao();
	}

}
