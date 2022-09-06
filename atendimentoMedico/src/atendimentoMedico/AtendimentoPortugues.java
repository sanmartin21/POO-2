package atendimentoMedico;

public class AtendimentoPortugues implements AtendimentoInterface{
	
	   @Override
	    public String calculaPrioridade() {
	        return ("Prioridade:\n"
	        		+ "1- Cor azul (Não Urgente)\n"
	        		+ "2- Cor verde (Pouco Urgente)\n"
	        		+ "3- Cor Amarela (Urgente)\n"
	        		+ "4- Cor Laranja (Muito Urgente)\n"
	        		+ "5- Cor Vermelha (Emergência)\n");
	    }

	    @Override
	    public String calculaEstado() {
	        return ("Estado:\n"
	        		+ "1- Ferido\n"
	        		+ "2- Sangrando\n"
	        		+ "3- Com fraturas\n"
	        		+ "4- Desmaiado\n"
	        		+ "5- Decretado óbito\n");
	    }

}
