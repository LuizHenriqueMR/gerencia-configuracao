package br.com.tsi.construcao;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class CalculadoraTest {
 private final Calculadora c=new Calculadora();
 @Test void soma(){assertEquals(5,c.somar(2,3));}
 @Test void multiplicacao(){assertEquals(20,c.multiplicar(4,5));}
}
