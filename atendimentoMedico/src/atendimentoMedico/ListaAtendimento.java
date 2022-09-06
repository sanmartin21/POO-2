package atendimentoMedico;

import java.util.ArrayList;
import java.util.List;

public class ListaAtendimento {
	

    protected List<Atendimento> listaAtendimento = new ArrayList<Atendimento>();

    
    public ListaAtendimento(Atendimento atendimento) {
        listaAtendimento.add(atendimento);
    }

    public void addLista(Atendimento atendimento) {
        listaAtendimento.add(atendimento);
    }

    public void mostrarLista() {
        System.out.println(listaAtendimento);
    
    }

    public List<Atendimento> getListaAtendimento() {
        return listaAtendimento;
    }

    public void setListaAtendimento(List<Atendimento> listaAtendimento) {
        this.listaAtendimento = listaAtendimento;
    }

       @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nListaAtendimento[");
        builder.append(listaAtendimento);
        builder.append("]\n");
        return builder.toString();

    }
}
