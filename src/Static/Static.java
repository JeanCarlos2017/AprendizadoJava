
package Static;

/**
 *
 * @author Jean
 */
public class Static {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //vendo como funciona atributos estáicos 
         StaticTest teste = new StaticTest();
         StaticTest teste2 = new StaticTest();
        
         System.out.println(teste.atributoStatico);
         System.out.println(teste2.atributoStatico);
        
         teste2.atributoStatico = "novo valor";
         System.out.println(teste.atributoStatico);
         System.out.println(teste2.atributoStatico);
         
    }
    
}
