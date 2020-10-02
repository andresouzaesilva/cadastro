package cadastro.primeira.lista;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private String genero;
    private String data;
    private List<Produto> produtos = new ArrayList<>();
    
    
    public Cliente(){}
    
 
    public Cliente(String nome, String telefone, String genero, String data){
        this.nome = nome;
        this.telefone = telefone;
        this.genero = genero;
        this.data = data;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public void addProduto(Produto produto){
		this.produtos.add(produto);
	}


	public List<Produto> getProdutos() {
		return produtos;
	}
	
}

  
  