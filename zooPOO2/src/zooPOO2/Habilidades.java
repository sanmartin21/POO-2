package zooPOO2;

public class Habilidades {

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao.length() > 0)
			this.descricao = descricao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Habilidades [descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}	
	
	
}
