
package Streams_Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        Map<Integer, String>  hashMap = new HashMap<>();
        
        //inserções 
         hashMap.put(0, "Jean");
         hashMap.put(1, "Samuel");
         
         hashMap.put(3, "Bruno");
         hashMap.put(4, "Renato");
         hashMap.put(5, "Leonardo");
         hashMap.put(6, "Israel");
         hashMap.put(7, "Willian");
         hashMap.put(null, "Teste");
         hashMap.put(2, "Leandro");
         System.out.println("inserções: "+hashMap);
         
        //atualziando o valor para a chave 6
        hashMap.put(6, "Israel Cursinho");
        System.out.println("alteração israel: "+hashMap);
        
        //retornando o Bruno
        System.out.println("retornando a posição 3: "+hashMap.get(3));
        
        //verificando se existe o 6 
        System.out.println("verifica se existe a posiçao 6: "+hashMap.containsKey(6));
        
        //remove o 6 e verifica se ele existe 
        hashMap.remove(6);
        System.out.println("verifica se existe a posiçao 6 depois de te-lo removido: "+hashMap.containsKey(6));
        
        //verifica se o Istrael Cursinho existe 
        System.out.println("Verifica se existe o valor Israel Cursinho: "+hashMap.containsValue("Istrael Cursinho"));
        
        //navegando pelos registros do set
        hashMap.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() +"---"+ entry.getValue());
        });
        
        //deletando os registro de hashMap e fazendo a iteração
        hashMap.clear();
        hashMap.entrySet().forEach((entry)-> {
            System.out.println(entry.getKey() +"---"+ entry.getValue());
        });
    }
}
