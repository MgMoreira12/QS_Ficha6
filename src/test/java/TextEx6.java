import org.example.Ex6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextEx6 {

    Ex6 test;
    @BeforeEach
    public void setUp(){
        test = new Ex6();
    }

    @Test
    public void testHowManyDigits(){
        int a = 123456789;
        int digits = test.howManyDigits(a);
        int expectedResults = 9;
        assertEquals(digits, expectedResults, "Resultado inesperado");
    }
}
