package atividadeGenericsEx4;

import java.util.ArrayList;
import java.util.List;

public class VerificaChaveValor <T>{

	List<ArmazenaChaveValor<T>> armazenaChaveValores = new ArrayList<ArmazenaChaveValor<T>>();
	
	public ArmazenaChaveValor<T> get(String chave){
		for (ArmazenaChaveValor<T> armazenaChaveValor : armazenaChaveValores) {
			if(armazenaChaveValor.getChave() == chave) {
				return armazenaChaveValor;
			}
		}
		return null;
	}
	
	public boolean add(String chave, T valor){
		if(get(chave)!= null) {
			return false;
		}
		armazenaChaveValores.add(new ArmazenaChaveValor<T>(chave, valor));
		return true;
	}
}
