package Estructurabasica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
//        Map<String, ArrayList<String>>frecuencia=new HashMap<>();
//        String[]numeros={"uno","dos","uno","uno","dos","tres"};
        ArrayList<String>numerosarray=new ArrayList<>();
        numerosarray.add("uno");
        numerosarray.add("dos");
        numerosarray.add("uno");
        System.out.println(frecuencias(numerosarray));
    }
    public static Map<String,Integer> frecuencias(ArrayList<String>numerosarray){
        Map<String,Integer>frec=new HashMap<>();
        for(String num:numerosarray){
            frec.put(num,frec.getOrDefault(num,0)+1);
        }
        return frec;
    }
}
