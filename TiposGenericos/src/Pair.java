
public class Pair<K, V> {
	
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	//A constru��o do objeto Par s� � permitida se for passado dois objetos,
	// K que ser� chamado de key dentro da classe e V que ser� chamado de 
	// value dentro da classe, K e V s�o desconhecidos para a classe Pair.

}
