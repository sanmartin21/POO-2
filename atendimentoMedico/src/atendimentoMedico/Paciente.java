package atendimentoMedico;


public class Paciente extends Pessoa{
	
	public Paciente(String nome, String dataNascimento) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [getNome()=");
		builder.append(getNome());
		builder.append(", getDataNascimento()=");
		builder.append(getDataNascimento());
		builder.append("]");
		return builder.toString();
	}
	

}
