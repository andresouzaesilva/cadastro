package cadastro.primeira.lista;

import java.util.Arrays;
import java.util.List;

public class Produto {
	private String nome;
	
	public Produto() {}
	
	public  Produto(String nome) {
		this.nome = nome;
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static List<Produto> getTodosProdutos(){
		Produto p1 = new Produto("Corte de cabelo");
		Produto p2 = new Produto("Corte de barba");
		Produto p3 = new Produto("Modelagem de barba");
		return Arrays.asList(p1,p2,p3);		
	}
	
	
	
}
