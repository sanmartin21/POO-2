package atendimentoMedico;

public class AtendimentoIngles implements AtendimentoInterface{

	 @Override
	    public String calculaPrioridade() {
	        return ("Priority:\n"
	        		+ "1- Blue color (Not Urgent)\n"
	        		+ "2- Green color (Little Urgent)\n"
	        		+ "3- Yellow Color (Urgent)\n"
	        		+ "4- Orange (Very Urgent)\n"
	        		+ "5- Red Color (Emergency)\n");
	    }

	    @Override
	    public String calculaEstado() {
	    	 return ("Health condition:\n"
		        	+ "1- Injured\n"
		        	+ "2- Bleeding\n"
		       		+ "3- With fractures\n"
		       		+ "4- Passed out\n"
		       		+ "5- Death decree\n");
	    }

	
}
