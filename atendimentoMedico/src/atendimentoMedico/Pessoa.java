package atendimentoMedico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

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

	public void setDataNascimento(String dataNascimento) {
		try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
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
