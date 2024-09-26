import java.util.Scanner;
public class Trabajo5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Escribe el 1er numer");
        int num1 = scn.nextInt();
        System.out.println("Escribe el 1er numer");
        int num2 = scn.nextInt();
        System.out.println("Escribe el 1er numer");
        int num3 = scn.nextInt();
        int suma = num1 + num2 + num3;
        System.out.println("La suma de " + num1 + "+" + num2 + "+" + num3 + " es " + suma);
    }

}
