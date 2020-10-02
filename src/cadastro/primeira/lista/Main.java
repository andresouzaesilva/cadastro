package cadastro.primeira.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
	public static void listarClientesOrdenados (List<Cliente>listaClientes) {
		int clie = 0;
		 listaClientes.stream().sorted((a, b) -> a.getNome().compareTo(b.getNome())).forEach(it -> System.out.println((clie+1)+" - "+it.getNome()));
         System.out.println("================================");
	}	
	public static void listarClientes (List<Cliente>listaClientes) {
		int clie = 0;
		 listaClientes.stream().forEach(it -> System.out.println((clie+1)+" - "+it.getNome()));
        System.out.println("================================");
	}
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
    
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<String> listaGenero = new ArrayList<>();
        
        
   
        boolean sair = false;
        while (!sair) {   
      
            System.out.println(" Entre com a opção ");
            System.out.println(" 1 - Criar cliente ");
            System.out.println(" 2 - Listar clientes cadastrados em ordem alfabética");
            System.out.println(" 3 - Excluir cliente ");
            System.out.println(" 4 - Alterar informações do cliente ");
            System.out.println(" 5 - Listar clientes cadastrados em ordem alfabética agrupados por sexo");
            System.out.println(" 6 - Consumir Produto: ");
            System.out.println(" 0 - Salir ");
            

            int opcao = Integer.parseInt(entrada.nextLine());
            
            System.out.println("================================");
           
            
            switch(opcao) {
                case 1: 

                    Cliente c = new Cliente();
                    System.out.println("Entre com o nome do cliente: ");

                    c.setNome(entrada.nextLine());
                    System.out.println("Entre com o telefone do cliente (sem prefixo): ");

                    c.setTelefone(entrada.nextLine());
                    System.out.println("Entre com o genero do cliente: ");

                    c.setGenero(entrada.nextLine());
                    System.out.println("Entre com a data de nascimento do cliente (sem barra): ");

                    c.setData(entrada.nextLine());
                    listaClientes.add(c);

                    
                    System.out.println("Cliente Cadastrado: ");
                    System.out.println("Nome " + c.getNome());
                    System.out.println("Telefone " + c.getTelefone());
                    System.out.println("Genero " + c.getGenero());
                    System.out.println("Data de nascimento " + c.getData());
                    System.out.println("================================");
                    
                    break;
                case 2: 
                    
                {
                	listarClientesOrdenados(listaClientes);
                   }
                    
                
                    break;
                case 3: 
                    System.out.println("Entre com o nome do cliente que deseja excluir: ");
                    String cadastro = entrada.nextLine();
                    
                    for (int i = 0; i < listaClientes.size(); i++) {
                        Cliente cli = listaClientes.get(i);
                        
                        if (cadastro.equals(cli.getNome())) {

                            listaClientes.remove(i);
                            System.out.println("Cliente Excluído");
                        }
                    }
                    
                    break;
                case 4: 
                    System.out.println("Entre com o nome do cliente que pretende modificar: ");
                    cadastro = entrada.nextLine();
                    
                    for (int i = 0; i < listaClientes.size(); i++) {
                        Cliente cli = listaClientes.get(i);
                        if (cadastro.equals(cli.getNome())) {
                            System.out.println("Telefone: " + cli.getTelefone());
                            System.out.println("Data de Nascimento: " + cli.getData());
                            System.out.println("Genero: " + cli.getGenero());
                            System.out.println("Entre com o novo telefone: ");
                            String telefone = entrada.nextLine();
                            System.out.println("Entre com a nova data de nascimento: ");
                            String data = entrada.nextLine();;
                            System.out.println("Entre com o novo genero: ");
                            String genero = entrada.nextLine();;
                            
                            cli.setData(data);
                            cli.setTelefone(telefone);
                            cli.setGenero(genero);
                            
                        }
                    }
                    break;
                case 5: 
                    System.out.println("Entre com o nome o sexo de interesse: ");
                    cadastro = entrada.nextLine();
                    
                    
                    
                    {
                    for (int i = 0; i < listaClientes.size(); i++) {
                        Cliente cli = listaClientes.get(i);
                        if (cadastro.equals(cli.getGenero())) 
                        	listaGenero.add(cli.getNome());
                        }
                    }
                    Collections.sort(listaGenero);
                    for (String nomeGenero : listaGenero) {
						System.out.println(nomeGenero);
					}
                    
                    break;
                
                case 6: 
                	System.out.println("Escolha o Cliente: ");
                	listarClientes(listaClientes);
                	int cl = entrada.nextInt();
                    System.out.println("Entre com o produto consumido: ");
                    List<Produto> produtos = Produto.getTodosProdutos();
                    for (int i = 0; i < produtos.size(); i++ ) {
                    	System.out.println((i+1)+" - "+produtos.get(i).getNome());	
                    }
                    int p = entrada.nextInt();
                    //atualizarListaDeCliente(listaClientes, inserirProdutoCliente(listaClientes.get(cl),produtos.get(p)));
                    listaClientes.get(cl-1).addProduto(produtos.get(p));
                    for (Cliente prod:listaClientes) {
                    	System.out.println(prod.getNome());
                    	for (Produto pro:prod.getProdutos()) {
                    		System.out.println(pro.getNome());
                    	}
                    } 
                    
                    
                    break;
                    
                case 0:
                    sair = true;
                    System.out.println("Saindo do Programa");
                    break;
                    
                default: 
                    System.out.println("Opção Inválida");
                
            }
        }
        
    }
	private static void atualizarListaDeCliente(ArrayList<Cliente> listaClientes, Cliente cliente) {
		// Comparar clientes com da lista com cliente e alterar o que for cliente. Mesmo método do alterar cliente
		
	}
	private static Cliente inserirProdutoCliente(Cliente cliente, Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}
    
}