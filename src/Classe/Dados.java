package Classe;

/**
 *
 * @author ronil
 */
public class Dados {

public boolean validarUusuarios(String usuario, String senha) {
    if (usuario.equals("ronilson") && senha.equals("123")) {
	return true;
    } else {
	return false;
    }
}
}
