package Testes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTest {
    @Test
    public void testeSomar(){
        Calculadora calculadora = new Calculadora(3, 5);
        assertEquals (8, calculadora.soma());
    }

    @Test
    public void testarSomaMockito(){
        Calculadora calculadora = mock (Calculadora.class);
        when(calculadora.somaParametro(3,3)).thenReturn(10);

        int resultado = calculadora.somaParametro(3,3);
        System.out.println(resultado);
        assertEquals(10, resultado);
    }
}
