package control;
import java.util.ArrayList;
import model.Aluno;

public class AlunoController {
    private ArrayList<Aluno> lista;

    public AlunoController() {
        lista = new ArrayList();
    }
   
    
public void cadastrar (String nome, int idade)    
{
    
    Aluno al = new Aluno(nome, idade);
    lista.add(al);
    
}
}
