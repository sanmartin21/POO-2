package atendimentoMedico;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	private String nome;
	
	private Date dataNascimento;

	public Pessoa(String nome, Date dataNascimento) {
		setNome(nome);
		setDataNascimento(dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int calcularIdade(Date dataNascimento) {

	    Calendar hoje = Calendar.getInstance();
	    Calendar birthDate = Calendar.getInstance();

	    int idade = 0;

	    birthDate.setTime(dataNascimento);
	    if (birthDate.after(hoje)) {
	        throw new IllegalArgumentException("Não pode nascer no futuro");
	    }

	    idade = hoje.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

	    // Se a data de nascimento for maior que a data de hoje (após 2 dias de ajuste do ano bissexto), diminua a idade em um ano   
	    if ( (birthDate.get(Calendar.DAY_OF_YEAR) - hoje.get(Calendar.DAY_OF_YEAR) > 3) ||
	            (birthDate.get(Calendar.MONTH) > hoje.get(Calendar.MONTH ))){
	        idade--;

	     // Se a data de nascimento e a data de hoje forem do mesmo mês e o dia do mês de nascimento for maior que o dia do mês de hoje, diminua a idade
	    }else if ((birthDate.get(Calendar.MONTH) == hoje.get(Calendar.MONTH )) &&
	              (birthDate.get(Calendar.DAY_OF_MONTH) > hoje.get(Calendar.DAY_OF_MONTH ))){
	        idade--;
	    }

	    return idade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
