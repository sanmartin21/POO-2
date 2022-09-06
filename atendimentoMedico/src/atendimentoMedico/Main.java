package atendimentoMedico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Paciente pac1 = new Paciente("Rodrigo Fernandes", "10/03/2010");
		Paciente pac2 = new Paciente("Pedro mata pombo", "12/09/2000");
		
		Especialidade pediatria = new Especialidade();
		pediatria.setDescricao("Pediatra");
		Especialidade cardiologia = new Especialidade();
		pediatria.setDescricao("Cardiologista");
		Especialidade ofamologista = new Especialidade();
		pediatria.setDescricao("Oftamologista");
		Especialidade urologista = new Especialidade();
		pediatria.setDescricao("Urologista");
		
		Medico med1 = new Medico(pediatria, "João Vitor", "21/02/2003");
		Medico med2 = new Medico(cardiologia, "Jenifer", "05/06/1999");
		Medico med3 = new Medico(ofamologista, "Luis Augusto", "06/10/1995");
		Medico med4 = new Medico(urologista, "Matheus", "05/05/2000");
	
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
			
			Atendimento atendimento = new Atendimento(pac1, med1);
			//medico auxiliar
			atendimento.setMedico(med2);
			atendimento.setInicio("27/08/2022 12:00");
			atendimento.setFim("27/08/2022 12:30");
			System.out.println(atendimento);

		} else if (selectorIdioma == 2) {

			AtendimentoGenerico atendimentoGenerico = new AtendimentoGenerico(ingles);
			atendimentoGenerico.calcularEstado();
			
			Atendimento atendimento2 = new Atendimento(pac2, med3);
			//medico auxiliar
			atendimento2.setMedico(med4);
			atendimento2.setInicio("29/08/2021 16:00");
			atendimento2.setFim("29/08/2021 17:00");
			System.out.println(atendimento2);

		}

		else {
			System.out.println("Opção inválida!");
		}

	}
}
