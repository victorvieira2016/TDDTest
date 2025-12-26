import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculadoraTest {

    @Test
    public void somar() {
        // arrange
        double valor1 = 2;
        double valor2 = 2;

        // act
        double resultado = Calculadora.soma(valor1, valor2);

        // assert
        Assertions.assertEquals(4.0, resultado);
    }

    @Test
    public void subtrair() {
        // act
        double resultado = Calculadora.subtrai(10,5);

        // assert
        Assertions.assertEquals(5.0, resultado);
    }

    @Test
    public void multiplicar() {
        // act
        double resultado = Calculadora.multiplica(2,3);

        // assert
        Assertions.assertEquals(6, resultado);
    }

    @Test
    public void divisaoPorZeroPositiva() {
        // act
        double resultado = Calculadora.dividir(10,0);

        // assert
        Assertions.assertEquals(Double.POSITIVE_INFINITY, resultado);
    }

    @Test
    public void divisaoPorZeroNegativa() {
        // act
        double resultado = Calculadora.dividir(-10,0);

        // assert
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, resultado);
    }

    @Test
    public void divisao() {
        // act
        double resultado = Calculadora.dividir(10,2);

        // assert
        Assertions.assertEquals(5.0, resultado);
    }

    @Test
    public void divisaoZeroPorZero() {
        // act
        double resultado = Calculadora.dividir(0,0);

        // assert
        Assertions.assertEquals(Double.NaN, resultado);
    }
}