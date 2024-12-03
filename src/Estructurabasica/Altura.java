package Estructurabasica;

import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        System.out.println(cantidadalumnos()+" alumnos");

    }
    public static int cantidadalumnos(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> alumnosaltura = new ArrayList<>();
        System.out.println("Dime la cantidad de alumnos que hay");
        int cantidad = sc.nextInt();

        return cantidad;
    }
}
