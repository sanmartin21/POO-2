package atendimentoMedico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Paciente pacienteVitor = new Paciente("Vitor Ricardo", "27/05/2000");
		Paciente pacienteCarlos = new Paciente("Carlos Alexandre", "05/05/1994");
		
		Especialidade pediatria = new Especialidade();
		pediatria.setDescricao("Pediatra");
		Especialidade cardiologia = new Especialidade();
		pediatria.setDescricao("Cardiologista");
		Especialidade ofamologista = new Especialidade();
		pediatria.setDescricao("Oftamologista");
		Especialidade urologista = new Especialidade();
		pediatria.setDescricao("Urologista");
		
		Medico medicoPediatra = new Medico(pediatria, "João Vitor", "21/02/2003");
		Medico medicoCardiologista = new Medico(cardiologia, "Jenifer", "05/06/1999");
		Medico medicoOftamologista = new Medico(ofamologista, "Luis Augusto", "06/10/1995");
		Medico medicoUrologista = new Medico(urologista, "Matheus", "05/05/2000");
	
		AtendimentoPortugues portugues = new AtendimentoPortugues();
		AtendimentoIngles ingles = new AtendimentoIngles();

		System.out.println("Selecione 1 para inicializar o projeto em Português e 2 para inicializar o projeto em Inglês");
		System.out.println("Select 1 to initialize the project in Portuguese and 2 to initialize the project in English");
		
		Scanner input = new Scanner(System.in);
		int selectorIdioma = input.nextInt();
		

		if (selectorIdioma == 1) {

			AtendimentoGenerico atendimentoGenerico = new AtendimentoGenerico(portugues);
			
			System.out.println(atendimentoGenerico.calcularPrioridade());
			int options = input.nextInt();
			System.out.println(atendimentoGenerico.calcularEstado()); 
			options = input.nextInt();
			
			Atendimento atendimento = new Atendimento(pacienteVitor, medicoPediatra);
			//medico auxiliar
			atendimento.setMedico(medicoCardiologista);
			atendimento.setInicio("27/08/2022 12:00");
			atendimento.setFim("27/08/2022 12:30");
			System.out.println(atendimento);

		} else if (selectorIdioma == 2) {

			
			AtendimentoGenerico atendimentoGenerico = new AtendimentoGenerico(ingles);
			System.out.println(atendimentoGenerico.calcularPrioridade());
			int options = input.nextInt();
			System.out.println(atendimentoGenerico.calcularEstado()); 
			options = input.nextInt();
			Atendimento atendimento2 = new Atendimento(pacienteCarlos, medicoOftamologista);
			//medico auxiliar
			atendimento2.setMedico(medicoUrologista);
			atendimento2.setInicio("29/08/2021 16:00");
			atendimento2.setFim("29/08/2021 17:00");
			System.out.println(atendimento2);

		}

		else {
			System.out.println("Opção inválida!");
		}

	}
}
