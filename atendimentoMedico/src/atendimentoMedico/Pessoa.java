package atendimentoMedico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Pessoa {

	private String nome;
	
	private Date dataNascimento;



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() > 0)
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int calcularIdade(String dataNascimento, String dataAtual) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
		
		Date dataAtuall = dateFormat.parse(dataAtual);
		Date dataNascimentoo = dateFormat.parse(dataNascimento);
		
		long diferenca = dataAtuall.getTime() - dataNascimentoo.getTime();
		
		TimeUnit time = TimeUnit.DAYS;
		
		long diferencaEntreDatas = time.convert(diferenca, TimeUnit.MILLISECONDS);
		
		int tornaInteiro = Math.toIntExact(diferencaEntreDatas);
		int idadePessoa = tornaInteiro/365;
		
		return idadePessoa;

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
