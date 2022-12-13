package zooPOO2;

public class Mamifero extends Animal {

	private float velocidade;
	private String especie;
	private float qntLitrosDia;
	private boolean venenoso;

	public Mamifero(String cor, float tamanho, float velocidade, String especie, float qntLitrosDia, boolean venenoso) {
		super(cor, tamanho);
		setCor(cor);
		setTamanho(tamanho);
		setVelocidade(velocidade);
		setEspecie(especie);
		setQntLitrosDia(qntLitrosDia);
		setVenenoso(venenoso);

	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		if(velocidade >= 0)
		this.velocidade = velocidade;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		if(especie.length() > 0)
		this.especie = especie;
	}

	public float getQntLitrosDia() {
		return qntLitrosDia;
	}

	public void setQntLitrosDia(float qntLitrosDia) {
		if(qntLitrosDia >= 0)
		this.qntLitrosDia = qntLitrosDia;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public boolean isVeloz() {
		if (getVelocidade() > 100) {
			setVelocidade(getVelocidade());
			return true;
		}
		return false;

	}

	public boolean respiracao(String ar) {
		if (ar.equals("Oxigênio")) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [velocidade=");
		builder.append(velocidade);
		builder.append(", especie=");
		builder.append(especie);
		builder.append(", qntLitrosDia=");
		builder.append(qntLitrosDia);
		builder.append(", venenoso=");
		builder.append(venenoso);
		builder.append(", habilidades=");
		builder.append(habilidades);
		builder.append(", coracao=");
		builder.append(coracao);
		builder.append(", isVenenoso()=");
		builder.append(isVenenoso());
		builder.append(", isVeloz()=");
		builder.append(isVeloz());
		builder.append(", getCor()=");
		builder.append(getCor());
		builder.append("]");
		return builder.toString();
	}

	



}
