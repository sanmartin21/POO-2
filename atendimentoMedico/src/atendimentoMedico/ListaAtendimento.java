package atendimentoMedico;

import java.util.List;

public class ListaAtendimento {
	
	public void addLista(List listAtendimentos, Atendimento atendimento) {
		listAtendimentos.add(atendimento);
	}

	public void mostrarLista(List listAtendimento) {
		for (int i = 0; i < listAtendimento.size(); i++) {
			System.out.println(listAtendimento.get(i));
		}
	}
}
