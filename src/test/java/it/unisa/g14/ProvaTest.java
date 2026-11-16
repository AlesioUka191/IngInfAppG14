package it.unisa.g14;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProvaTest {

    @Test
    void sommaDeveDare3() {
        assertEquals(3, Prova.somma(1, 2));
    }
}