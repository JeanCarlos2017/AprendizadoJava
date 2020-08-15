
package Streams_Collections.StreamAPI;

import Streams_Collections.comparators.Aluno;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class exemploStreamAPI {
    public static void main (String arg[]){
        //criando e imprimindo uma lista de alunos 
        List<Aluno> listaAluno = Aluno.fabricaAlunos(12, "Jean");
        listaAluno.add(new Aluno(60, "Jean Carlos Almeida", 27));
        //Aluno.imprimeListaAlunos(listaAluno);
        
//        System.out.println("Contagem: "+listaAluno.stream().count());
//        
//        System.out.println("O aluno com o maior nome: "+
//                listaAluno.stream().max(Comparator.comparingInt((aluno) -> aluno.getNomeAluno().length()))
//        );
//        
//        System.out.println("O aluno que tem o nome mais curto:  "+
//                listaAluno.stream().min(Comparator.comparingInt((aluno) -> aluno.getNomeAluno().length()))
//        );
//        
//        System.out.println("Alunos menores de 18 anos: "+
//                listaAluno.stream().filter((aluno)-> aluno.getIdadeAluno() < 18).collect(Collectors.toList())
//        );
//        
        System.out.println("Alunos entre 18 e 25 anos "+
                listaAluno.stream().filter(
                        (aluno)-> aluno.getIdadeAluno() > 18 && aluno.getIdadeAluno() < 25)
                        .collect(Collectors.toList())
        );
        
        System.out.println("Nomes dos alunos sem os números: "+
                listaAluno.stream().map(aluno-> aluno.getNomeAluno().replaceAll("[0-9]", ""))
                        .collect(Collectors.toList())
        );
        
        System.out.println("Retorna o 5 primeiros elementos: "+
                listaAluno.stream().limit(4).collect(Collectors.toList()));
        
    }
}
