package atividadeGenericsEx1;

public class LAluno<T> {
	
	private T t;
	
	public void add(T t) {
        this.t = t;
      }

      public T get() {
        return t;
      }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LAluno [t=");
		builder.append(t);
		builder.append("]");
		return builder.toString();
	}
      
	

}
