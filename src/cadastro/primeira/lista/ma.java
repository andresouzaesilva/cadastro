package cadastro.primeira.lista;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static ArrayList<Clientes> alterarCliente(ArrayList<Clientes> listaClientes, Clientes cli) {
		ArrayList<Clientes> lista = new ArrayList<>();
		for (int i = 0; i < listaClientes.size(); i++) {
			if (listaClientes.get(i).getNome().equals(cli.getNome())) {
				lista.add(cli);
				continue;
				
			}
			lista.add(listaClientes.get(i));
		}
		return lista;
	}
	
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
    
        ArrayList<Clientes> listaClientes = new ArrayList<>();
        
   
        boolean sair = false;
        while (!sair) {   
      
            System.out.println(" Entre com a opção ");
            System.out.println(" 1 - Criar cliente ");
            System.out.println(" 2 - Listar clientes cadastrados");
            System.out.println(" 3 - Excluir cliente ");
            System.out.println(" 4 - Alterar informações do cliente ");
            System.out.println(" 0 - Salir ");
            

            int opcao = Integer.parseInt(entrada.nextLine());
           
            
            switch(opcao) {
                case 1: 

                    Clientes c = new Clientes();
                    System.out.println("Entre com o nome do cliente: ");

                    c.setNome(entrada.nextLine());
                    System.out.println("Entre com o telefone do cliente (sem prefixo): ");

                    c.setTelefone(Integer.parseInt(entrada.nextLine()));
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
                    
                    break;
                case 2: 
                    
                   for(int i = 0; i < listaClientes.size(); i++){ 
                       System.out.println("Cliente: " + (i + 1));
                       
                       Clientes cli =  listaClientes.get(i); 
                       
                       System.out.println("Nome: " + cli.getNome());
                       System.out.println("Telefone: " + cli.getTelefone());
                       System.out.println("Genero: " + cli.getGenero());
                       System.out.println("Data de nascimento: " + cli.getData());
                       
                   }
                    
                    break;
                case 3: 
                    System.out.println("Entre com o nome do cliente que deseja excluir: ");
                    String cadastro = entrada.nextLine();
                    
                    for (int i = 0; i < listaClientes.size(); i++) {
                        Clientes cli = listaClientes.get(i);
                        
                        if (cadastro.equals(cli.getNome())) {

                            listaClientes.remove(i);
                            System.out.println("Cliente Excluído");
                        }
                    }
                    
                    break;
                case 4: 
                    System.out.println("Entre com o nome do cliente do cadastro que deseja alterar");
                    cadastro = entrada.nextLine();
                    
                    Clientes cli = null;
                    for (int i = 0; i < listaClientes.size(); i++) {
                    	
                         
                        if (cadastro.equals(listaClientes.get(i).getNome())) {
                            cli = listaClientes.get(i);
                            

                            
                        }
                    }
                    if (cli==null){
                    	System.out.println("Cliente não encontrado");
                    	break;
                    	
                    	
                    }
                    System.out.println("Genero: " + cli.getGenero());
                    System.out.println("Data: " + cli.getData());

                    System.out.println("Entre com o novo genero: ");
                    String genero = entrada.nextLine();
                    
                    System.out.println("Entre com a nova data de nascimento: ");
                    String data = entrada.nextLine();


                    cli.setGenero(genero);
                    cli.setData(data);
                    
                    listaClientes=alterarCliente(listaClientes,cli);
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
    
}