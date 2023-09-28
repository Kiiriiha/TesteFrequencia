

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidaNotaFrequenciaTeste {

    ValidaNotaFrequencia validaNotaFrequencia = new ValidaNotaFrequencia();

    @Test
    void deveRetornarReprovadoSeAFrequenciaForMenorQue70() {
        assertEquals("Reprovado", validaNotaFrequencia.validar(5, 60));
    }

    @Test
    void deveRetornarReprovadoSeANotaForMenorQue6() {
        assertEquals("Reprovado", validaNotaFrequencia.validar(5, 80));

    }

    @Test
    void deveRetornarAprovadoSeANotaForMaiorQue6EFrequenciaMaiorOuIgualA70() {
        assertEquals("Aprovado", validaNotaFrequencia.validar(7, 70));
    }

    @Test
    void NotaEFrequenciaForNegativaDeveLancarUmaExcecao() {
        assertThrows(IllegalArgumentException.class, () ->
                validaNotaFrequencia.validar(-1,-1));
    }
}
