package org.example;

public class AreaPerimetro {
    public int area(int base, int altura){
        return base * altura;
    }

    public int perimetro(int base, int altura){
        return 2 * base + 2 * altura;
    }

    public boolean isTriangle(int a, int b, int c){
        if (a > b + c){
            return false;
        }
        if (b > a + c){
            return false;
        }
        if (c > b + a){
            return false;
        }
        return true;

    }
}
