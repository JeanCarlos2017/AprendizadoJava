
package Optional;


import java.util.Optional;



public class UsandoOptional {
   public static void main(String[] args) {
	Optional<String> optionalString = Optional.of("Valor presente");
	System.out.println("Valor optional está presente");
	         
	//se tiver presente imprimo o objeto do contrário imprimo que está ausente 
	optionalString.ifPresentOrElse(System.out::println, ()->System.out.println("ausente"));
	         
	System.out.println("Valor optional está presente");
	Optional<String> optionalNull = Optional.ofNullable(null); //informa que pode ser nulo, assim nao lancará um erro 
	optionalNull.ifPresentOrElse(System.out::println, ()->System.out.println("null -- ausente"));
	         
	         
	System.out.println("Valor optional está presente");
	Optional<String> optionalEmpty = Optional.empty(); //informa que pode ser vazio 
	optionalEmpty.ifPresentOrElse(System.out::println, ()->System.out.println("empty -- ausente"));
	
   }

}
