
package Streams_Collections.comparators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Aluno implements Comparable<Aluno>{
    private int idAluno;
    private String nomeAluno;
    private int idadeAluno;

    public Aluno(int idAluno, String NomeAluno, int idadeAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = NomeAluno;
        this.idadeAluno = idadeAluno;
    }
    public static List<Aluno> fabricaAlunos(int qntAlunosFabricados, String nome){
        //para evitar de ter que ficar criando objetos 
        List<Aluno> listaAlunosFabricados = new ArrayList<>();
        Random gerador = new Random();
        for (int i = 0; i < qntAlunosFabricados; i++){
            listaAlunosFabricados.add(
                    new Aluno(gerador.nextInt(50), gerador.nextInt(1000)+nome,13+gerador.nextInt(12))
            );
        }
        return listaAlunosFabricados;
    }
    public static void imprimeListaAlunos(List<Aluno> listaAluno){
        //imprimindo todos os alunos 
        listaAluno.forEach((a)->{
            System.out.println(a.toString());
        });
    }
    @Override
    public String toString(){
        return "Nome: "+this.nomeAluno+" <-> "+
                "Idade: "+this.idadeAluno+" <-> "+
                "Id Aluno: "+this.idAluno;
    }
    //getters 
    public int getIdAluno() {
        return idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    @Override
    public int compareTo(Aluno o) {
        return this.idAluno - o.idAluno;
    }
    
    
}
