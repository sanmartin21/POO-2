package atendimentoMedico;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException{
		
		Scanner entrada = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		Paciente paciente = new Paciente();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Paciente paciente1 = new Paciente();
		paciente1.setNome("João");
		String dataPaciente1 = "21/02/2003";
		
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = formatar.parse(dataPaciente1);
		paciente1.setDataNascimento(dataFormatada);
		
		
	
		Paciente paciente2 = new Paciente();
		paciente2.setNome("João");
		String dataPaciente2 = "21/02/2003";
		SimpleDateFormat formatar2 = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada2 = formatar2.parse(dataPaciente2);
		paciente2.setDataNascimento(dataFormatada2);
		
		Paciente paciente3 = new Paciente();
		paciente3.setNome("João");
		String dataPaciente3 = "21/02/2003";
		SimpleDateFormat formatar3 = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada3 = formatar3.parse(dataPaciente3);
		paciente3.setDataNascimento(dataFormatada3);
		
		Atendimento atendimento = new Atendimento();
		
		Operacao operacao = new Operacao();		
		
		Atestado atestado = new Atestado();
		
		ListaAtendimento listaAtendimento = new ListaAtendimento();
		
		Especialidade especialidadeCirurgiaoGeral = new Especialidade();
		especialidadeCirurgiaoGeral.setDescricao("Cirurgião Geral");
		Especialidade especialidadeOftamologista = new Especialidade();
		especialidadeOftamologista.setDescricao("Oftamologista.");
		Especialidade especialidadePediatria= new Especialidade();
		especialidadePediatria.setDescricao("Pediatra.");
		
		
		List<Medico> listMedicos = new ArrayList<>();
		Medico medico1 = new Medico();
		SimpleDateFormat formatar4 = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date dataMedico = formatar4.parse("06/10/2010");
		medico1.setNome("Ricardo");
		medico1.setDataNascimento(dataMedico);
		medico1.setEspecialidade(especialidadePediatria);
		listMedicos.add(medico1);
		
		
		Medico medico2 = new Medico();
		SimpleDateFormat formatar5 = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date dataMedico2 = formatar5.parse("24/05/1979");
		medico1.setNome("Jean");
		medico1.setDataNascimento(dataMedico2);
		medico1.setEspecialidade(especialidadeOftamologista);
		listMedicos.add(medico2);
		
		
		Medico medico3 = new Medico();
		SimpleDateFormat formatar6 = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date dataMedico3 = formatar6.parse("08/10/2000");
		medico1.setNome("Jean");
		medico1.setDataNascimento(dataMedico3);
		medico1.setEspecialidade(especialidadeOftamologista);
		listMedicos.add(medico3);
		
		
		/*System.out.println("\n---------- ATENDIMENTO MÉDICO ----------\n");
		
		while(true) {
			
			System.out.println("----- MENU -----\n"
					+ "1 - Médicos e especialidades\n"
					+ "2 - Sair do programa");
			int menuOp = entrada.nextInt();
			
				if(menuOp == 1) {
					
						System.out.println("O que deseja fazer?\n"
								+ "1 - Acessar lista de médicos e especialidades\n"
								+ "0 - Sair");
						int medicoOp = entrada.nextInt();
						
						if(medicoOp == 1) {
							System.out.println(" -- LISTA DE MÉDICOS E SUAS ESPECIALIDADES:");
							for(int i = 0; i < listMedicos.size(); i++){
							    System.out.println(listMedicos.get(i));
							}	
							System.out.println("\nDigite 0 para voltar");
							int voltar = entrada.nextInt();
						}
						else {
							continue;
					}
				if(menuOp == 2) {
					System.out.println("\n Fim do programa.");
					System.exit(0);
				}
					
		}//while menu
		

	}*/

}
}
