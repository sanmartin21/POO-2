package zooPOO2;

public class Ar {
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao.length()>0)
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ar [descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
	

}
