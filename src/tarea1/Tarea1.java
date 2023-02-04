package tarea1;

import java.util.Scanner;

public class Tarea1 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        int opcion;

        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Seleccione una opercion de desea realizar");
            System.out.println("Opcion 1 Sumar");
            System.out.println("Opcion 2 Restar");
            System.out.println("Opcion 3 Mutiplicar");
            System.out.println("Opcion 4 Dividir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1 ->
                    suma();
                case 2 ->
                    resta();
                case 3 ->
                    multiplicacion();
                case 4 ->
                    division();
                default ->
                    throw new AssertionError();
            }

        } while (opcion != 4);         
    

    }

    public static void suma() {
        int num1, num2, total;
        System.out.println("Digite el primer numero que desea sumar");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();

        Scanner e = new Scanner(System.in);
        System.out.println("Digite el segundo numero que desea sumar");
        num2 = e.nextInt();
        total = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " es de " + total);
    }

    public static void multiplicacion() {
        int num1, num2, total;
        System.out.println("Digite el primer numero que desea multiplicar");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();

        Scanner e = new Scanner(System.in);
        System.out.println("Digite el segundo numero que desea multiplicar");
        num2 = e.nextInt();
        total = num1 * num2;
        System.out.println("La multiplicacion de " + num1 + " X " + num2 + " es de " + total);

    }

    public static void resta() {
        int num1, num2, total;
        System.out.println("Digite el primer numero que desea restar");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();

        Scanner e = new Scanner(System.in);
        System.out.println("Digite el segundo numero que desea restar");
        num2 = e.nextInt();
        total = num1 - num2;
        System.out.println("La resta de " + num1 + " menos " + num2 + " es de " + total);

    }

    public static void division() {
        int num1, num2, total;
        System.out.println("Digite el primer numero que desea  dividir");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();

        Scanner e = new Scanner(System.in);
        System.out.println("Digite el segundo numero que desea  dividir");
        num2 = e.nextInt();
        total = num1 / num2;
        System.out.println("La  division de " + num1 + " entre " + num2 + " es de " + total);
    }

}
