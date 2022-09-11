
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
	
	//A construção do objeto Par só é permitida se for passado dois objetos,
	// K que será chamado de key dentro da classe e V que será chamado de 
	// value dentro da classe, K e V são desconhecidos para a classe Pair.

}
