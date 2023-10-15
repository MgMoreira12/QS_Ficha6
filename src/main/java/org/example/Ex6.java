package org.example;

public class Ex6 {
    int count = 0;
    public int howManyDigits(int a){
       int temp = 1;
       while (temp <= a){
           count++;
           temp*=10;
       }
       return count;
    }
}
