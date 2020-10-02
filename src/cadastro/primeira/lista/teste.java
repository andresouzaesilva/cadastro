package cadastro.primeira.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
    
        ArrayList<Clientes> listaClientes = new ArrayList<>();
        
   
        boolean sair = false;
        while (!sair) {   
      
            System.out.println(" Entre com a opção ");
            System.out.println(" 1 - Criar cliente ");
            System.out.println(" 2 - Listar clientes cadastrados em ordem alfabética");
            System.out.println(" 3 - Excluir cliente ");
            System.out.println(" 4 - Alterar informações do cliente ");
            System.out.println(" 0 - Salir ");
            

            int opcao = Integer.parseInt(entrada.nextLine());
            
            System.out.println("================================");
           
            
            switch(opcao) {
                case 1: 

                    Clientes c = new Clientes();
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
                       listaClientes.stream().sorted((a, b) -> a.getNome().compareTo(b.getNome())).forEach(it -> System.out.println(it.getNome()));
                       System.out.println("================================");
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
                    System.out.println("Entre com o nome do cliente que pretende modificar: ");
                    cadastro = entrada.nextLine();
                    
                    for (int i = 0; i < listaClientes.size(); i++) {
                        Clientes cli = listaClientes.get(i);
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