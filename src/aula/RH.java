package aula;

public class RH {

	public static boolean validarCPF(String cpf) {
		if (cpf.length() >= 11) {
			return true;
		}
		return false;
	}
	
}
