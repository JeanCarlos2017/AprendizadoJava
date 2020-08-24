package Testes;



public class Calculadora {
    private int a,b;

    //public Calculadora(){}
    public Calculadora(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int somaParametro (int num, int num2){
        return num+num2;
    }
    public int soma (){
        return a+b;
    }

    public int subtracao(){
        return a-b;
    }

    public int multiplicacao(){
        return a*b;
    }

    public Object divisao(){
       try{
           return a/b;
       }catch (ArithmeticException e){
           System.out.println("Erro ao dividir por zero  ");
           throw e;
       }
    }


    public static void main(String[] args) {

    }
}
