
package Streams_Collections.comparators;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparateTo {
    public static void main (String arg[]){
        //criando e imprimindo uma lista de alunos 
        List<Aluno> listaAluno = Aluno.fabricaAlunos(12, "Jean");
        //Aluno.imprimeListaAlunos(listaAluno);
        
        
        System.out.println("\n\n\nOrdenando por nome do aluno de forma crescente: ");
        listaAluno.sort((o1, o2)->{
            return o1.getNomeAluno().compareTo(o2.getNomeAluno());
        });
        Aluno.imprimeListaAlunos(listaAluno);
        
        System.out.println("\n\nOrdenando pelo idALuno");
        listaAluno.sort(Comparator.comparingInt(Aluno::getIdAluno));
        Aluno.imprimeListaAlunos(listaAluno);
        
        System.out.println("\n\nOrdenando pela idade do aluno de forma decrescente");
        listaAluno.sort(Comparator.comparingInt(Aluno::getIdadeAluno).reversed());
        Aluno.imprimeListaAlunos(listaAluno);
        
        //usando o collections 
         System.out.println("\n\nOrdenando pela id do aluno de forma crescente");
         Collections.sort(listaAluno);
         Aluno.imprimeListaAlunos(listaAluno);
    }
}
