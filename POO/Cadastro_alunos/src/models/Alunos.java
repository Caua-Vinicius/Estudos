package models;

import exceptions.*;;

public class Alunos{

    private String nome;
    private String matricula;

    // SETTERS E GETTERS

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void check_matricula(String matricula) throws MatriculainvalidadExeception{
        String teste_matricula = matricula;
         if(teste_matricula.length()<10){
            throw new MatriculainvalidadExeception("Matricula invalida!");
         }
    }

    // CONSTRUTOR
    public Alunos(String nome, String matricula){
        try {
            check_matricula(matricula);
            setMatricula(matricula);
            setNome(nome);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}