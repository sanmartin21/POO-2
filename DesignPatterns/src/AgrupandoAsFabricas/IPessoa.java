package AgrupandoAsFabricas;

public interface IPessoa {
	
	public default String info() {
		return "Generico";
	}
}
