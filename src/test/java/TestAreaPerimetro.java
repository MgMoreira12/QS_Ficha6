import org.example.AreaPerimetro;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAreaPerimetro {
    static AreaPerimetro obj;

    @BeforeAll
    public static void setUp(){
        obj = new AreaPerimetro();
    }

    @Test
    public void testArea(){

        int a = 3;
        int b = 5;
        int area = obj.area(a,b);
        int expectedResult = 15;
        assertEquals(area, expectedResult, "Erro no cálculo da área!");
    }

    @Test
    public void testPerimetro(){
        int a = 3;
        int b = 5;
        int area = obj.perimetro(a,b);
        int expectedResult = 16;
        assertEquals(area, expectedResult, "Erro no cálculo do perimetro!");
    }

    @Test
    public void testIsTriangle(){
        int a = 5;
        int b = 2;
        int c = 4;
        boolean triangle = obj.isTriangle(a,b,c);
        boolean expectedResult = true;
        assertEquals(triangle, expectedResult, "Resultado inesperado");
    }
}
