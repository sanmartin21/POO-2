package zooPOO2;

public class Animal {
	
	private String cor;
	private float tamanho;
	protected Habilidades habilidades;
	protected Coracao coracao;
	
	public Animal(String cor, float tamanho) {
		setCor(cor);
		setTamanho(tamanho);
		habilidades = new Habilidades();
		coracao  	= new Coracao();
		
	}
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		if(cor.length() > 0) 
			this.cor = cor;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		if(tamanho >= 0)
			this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [cor=");
		builder.append(cor);
		builder.append(", tamanho=");
		builder.append(tamanho);
		builder.append(", habilidades=");
		builder.append(habilidades);
		builder.append(", coracao=");
		builder.append(coracao);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
