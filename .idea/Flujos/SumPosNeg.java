package Estructurabasica;

import java.util.ArrayList;

public class SumNegPos {
    public static void main(String[] args) {
        ArrayList<Integer>numeros=new ArrayList<>();
        numeros.add(20);
        numeros.add(-2);
        numeros.add(43);
        numeros.add(-5);
        System.out.println("Suma Positivos");
        System.out.println(sumpos(numeros));
        System.out.println("Suma Negativos");
        System.out.println(sumneg(numeros));
    }
    public static int sumpos(ArrayList<Integer>numeros){
        int sumpos=numeros.stream()
                .mapToInt(Integer::valueOf)
                .filter(num -> num >= 0)
                .sum();

        return sumpos;
    }
    public static int sumneg(ArrayList<Integer>numeros){
        int sumneg=numeros.stream()
                .mapToInt(Integer::valueOf)
                .filter(num-> num < 0)
                .sum();
        return sumneg;
    }
}
