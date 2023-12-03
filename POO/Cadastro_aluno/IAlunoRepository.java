import java.util.ArrayList; // import the ArrayList class


public class IAlunoRepository implements Interface{
    ArrayList<Alunos> Alunos = new ArrayList<Alunos>();

    public void listar(){
        for( Alunos aluno : Alunos){
            System.out.println(aluno.getNome() + " : "+ aluno.getMatricula());
        } 
    }
    public void adicionar(Alunos aluno){
        Alunos.add(aluno);
    }

    // return>-1 achou o aluno   -----   return < 0 não achou 
    public int busca(String nome){
        for(Alunos aluno : Alunos){
            if(aluno.getNome().equals(nome)){
                return Alunos.indexOf(aluno);
            }
        }
        return -1;
    }

    public void remover(String nome){
        int busca = this.busca(nome);
        if (busca > -1) {
            Alunos.remove(Alunos.get(busca));
            System.out.println("Aluno removido com sucesso!");
            System.out.println("Alunos Restantes:");
            this.listar();
        }
        else{
            System.out.println("Aluno não cadastrado no sistema!");
        }
    }

    public void buscar(String nome){
        int busca = this.busca(nome);

        if (busca > -1) {
            System.out.println("Aluno encontrado!");
        }
        else{
            System.out.println("Aluno não cadastrado no sistema!");
        }
    }
}
