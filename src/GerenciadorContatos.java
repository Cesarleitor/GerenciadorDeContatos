import java.util.List;
import java.util.ArrayList;


public class GerenciadorContatos {
    private final List<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato contato) {
        contatos.add(contato);
    }
    public void listar() {
        for (Contato c : contatos) {
            System.out.println(c);
        }
    }
    public Contato buscarPorNome(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;    
    }
    public boolean remover(String nome) {
        Contato contato = buscarPorNome(nome);
        if (contato != null) {
            contatos.remove(contato);
            return true;
        }
        return false;
    }
}
