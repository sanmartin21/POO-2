package AgrupandoAsFabricas;

public class FactoryPessoa implements IFactoryPessoa{

	@Override
	public Pessoa criarPessoa(String nome, String sexo) {
		if("F".equalsIgnoreCase(sexo))
			return new Mulher(nome, sexo);
		else if ("M".equalsIgnoreCase(sexo))
			return new Homem(nome, sexo);
		else 
			return new Pessoa(nome, sexo);
	}
}
