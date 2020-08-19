package Threads;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsAfazeres {
    private static final ExecutorService thread_pool = Executors.newFixedThreadPool(3);
    private List<String> afazeresList = new ArrayList<>();

    public List<String> getAfazeresList (){
        return listaDeTarefas();
    }

    public List<String> listaDeTarefas(){
        afazeresList.add(this.estudar());
        afazeresList.add(this.lavarCarro());
        afazeresList.add(this.fazerComida());
        afazeresList.add(this.varrerCasa());
        return afazeresList;
    }
    public  String lavarCarro(){
       return ("Lavando carro");
    }

    public  String estudar(){
        return ("estudar");
    }

    public  String fazerComida(){
        return "fazerComida";
    }

    public  String varrerCasa(){
        return "varrer a casa";
    }


    public static void main(String[] args){
        ThreadsAfazeres threadsAfazeres = new ThreadsAfazeres();
        //sem retorno e nao pode lançar excessões
        threadsAfazeres.getAfazeresList().forEach(afazer->thread_pool.execute(()->System.out.println(afazer)));
        thread_pool.shutdown();

    }
}
