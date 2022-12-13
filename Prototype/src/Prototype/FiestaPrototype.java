package Prototype;

public class FiestaPrototype extends CarroPrototype {

	protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
		this.valorCompra = fiestaPrototype.getValorCompra();
	}
	
	public FiestaPrototype() {
		this.valorCompra = 0.0;
	}
	
	@Override
	public String exibirInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarroPrototype clonar() {
		// TODO Auto-generated method stub
		return new FiestaPrototype(this);
	}

}
