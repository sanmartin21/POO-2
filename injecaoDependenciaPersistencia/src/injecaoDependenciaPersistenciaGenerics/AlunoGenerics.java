package injecaoDependenciaPersistenciaGenerics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import java.util.logging.Level;

public class AlunoGenerics extends PessoaGenerics{

	private int matricula;
	private String cpf;
	private Date dataNascimento;
	private String email;
	
	public AlunoGenerics() {
		
	}
	
	public AlunoGenerics(String nome, int matricula, String cpf, String dataNascimento, String email) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
		this.setEmail(email);
	}
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento2) {
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento2);
        } catch (ParseException ex) {
            Logger.getLogger(AlunoGenerics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public void persistir(TipoPersistenciaGenerics tipoPersistenciaGenerics) {
		System.out.println(tipoPersistenciaGenerics.persistir(this));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AlunoGenerics [matricula=");
		builder.append(matricula);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

 
	
	
}
