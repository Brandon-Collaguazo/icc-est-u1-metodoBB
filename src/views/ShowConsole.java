package views;

import java.util.Scanner;

public class ShowConsole {
    Scanner sc = new Scanner(System.in);
    int edad = 0;
    public void showMenu() {
        System.out.println("Ingrese los datos de las personas");
    }
    public int getEdad() {
        System.out.print("Ingrese la edad a buscar: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Edad ingresada -> " + edad);
        return edad;
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
}
