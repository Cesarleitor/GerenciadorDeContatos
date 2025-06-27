import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorContatos agenda = new GerenciadorContatos();
        Scanner sc = new Scanner(System.in);
        int opcao;

         {
            do {
                System.out.println("\n1. Adicionar Contato");
                System.out.println("2. Listar Contato");
                System.out.println("3. Buscar por nome");
                System.out.println("4. Remover contato");
                System.out.print("0. Sair");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Telefone: ");
                    String telefone = sc.nextLine();
                    agenda.adicionar(new Contato(nome, telefone));  
                    break;
                case 2:
                    agenda.listar();
                    break;  
                case 3:
                    Contato c = agenda.buscarPorNome(sc.nextLine());
                    System.out.println(c != null ? c : "Não encontrado.");
                    break;
                case 4:
                    System.out.println("Remover contato: ");
                    boolean removido = agenda.remover(sc.nextLine());
                    System.out.println(removido ? "Removido." : "Não encontrado.");
                     break;

                }
            } while (opcao != 0);
            sc.close();
        }
    
    }
}
