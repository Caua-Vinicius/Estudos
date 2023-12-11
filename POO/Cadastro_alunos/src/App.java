import models.Alunos;
import contracts.Interface;
import repositories.IAlunoRepository;

public class App {
    public static void main(String[] args) {

        // Instanciando os alunos
        
        Alunos aluno1 = new Alunos("João", "0000000001");
        Alunos aluno2 = new Alunos("Maria", "0000000002");
        Alunos aluno3 = new Alunos("Jose", "0000000003");
        Alunos aluno4 = new Alunos("Perisvaldo", "0000000004");
        Alunos aluno5 = new Alunos("Catapimbas", "0000000005");

        IAlunoRepository repositorio = new IAlunoRepository();

        // Adicionando os alunos no repositorio

        repositorio.adicionar(aluno1);
        repositorio.adicionar(aluno2);
        repositorio.adicionar(aluno3);
        repositorio.adicionar(aluno4);
        repositorio.adicionar(aluno5);

        // Testando os metodos na interface
        // Deixando bem claro que para organização do sistema, os metodos foram testados individualmente
        // e estão sendo deixados abaixo apenas para organização de atividade

        repositorio.buscar("Jose");
        // repositorio.listar();
        // repositorio.remover("Maria");

    }
}
