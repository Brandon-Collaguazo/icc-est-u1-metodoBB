import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controllers.MetodoBusqueda;
import models.Persona;

public class App {

    public static void main(String[] args) throws Exception {
        List<Persona> personas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantas personas desea ingresar? ");
        int cpersonas = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < cpersonas; i++) {
            System.out.println("Ingreso de datos de la persona N° " + (i + 1));
            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            nombre = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1);
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            while(edad < 0) {
                System.out.print("La edad no puede ser negativa. Ingrese nuevamente: ");
                edad = sc.nextInt();
            }
            personas.add(new Persona(nombre, edad));
            sc.nextLine();
        }
        System.out.println("Personas ingresadas");
        for(Persona persona : personas) {
            System.out.println(persona.toString());
        }
        MetodoBusqueda mBB = new MetodoBusqueda(personas);
        mBB.showPersonByEdad();
        sc.close();
    }
}
