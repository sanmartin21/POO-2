package zooPOO2;

public class Coracao {
	
	private String tipoSanguineo;

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coracao [tipoSanguineo=");
		builder.append(tipoSanguineo);
		builder.append("]");
		return builder.toString();
	}

	
	
	

}
