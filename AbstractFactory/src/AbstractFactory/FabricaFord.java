package AbstractFactory;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		// TODO Auto-generated method stub
		return new FiestaSedan();
	}

	@Override
	public CarroPopular criarCarroPoular() {
		// TODO Auto-generated method stub
		return new Fiesta();
	}

}
