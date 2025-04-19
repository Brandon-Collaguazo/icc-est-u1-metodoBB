package controllers;

import java.util.List;

import models.Persona;
import views.ShowConsole;

public class MetodoBusqueda {
    private List<Persona> people;
    private ShowConsole view;
    Ordenar ordenar = new Ordenar();
    public MetodoBusqueda(List<Persona> personas) {
        this.people = personas;
        this.view = new ShowConsole();
        view.showMessage("Método busqueda binaria");
    }
    public int findPersonByEdad(int edad) {
        int bajo = 0;
        int alto = people.size() - 1;
        ordenar.sortByAge(people);
        printAges();
        while(bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            int vcentral = people.get(central).getEdad();
            if(vcentral == edad) {
                System.out.println("Bajo= " + bajo + " Alto= " + alto + " Centro= " + central 
                + " Valor centro= " + vcentral + " -->ENCONTRADO");
                return central;
            } if(vcentral < edad) {
                bajo = central + 1;
                System.out.println("Bajo= " + bajo + " Alto= " + alto + " Centro= " + central 
                + " Valor centro= " + vcentral + " --> DERECHA");
                printAges(bajo, alto);
                
            } else {
                alto = central - 1;
                System.out.println("Bajo= " + bajo + " Alto= " + alto + " Centro= " + central 
                + " Valor centro= " + vcentral + " --> IZQUIERDA");
                printAges(bajo, alto);
            }
        }
        return -1;
    }
    private void printAges() {
        for (Persona persona : people) {
            System.out.print(persona.getEdad() + " | ");
        }
        System.out.println();
    }

    private void printAges(int bajo, int alto) {
        for (int i = bajo; i <= alto; i++) {
            System.out.print(people.get(i).getEdad() + " | ");
        }
        System.out.println();
    }
    public void showPersonByEdad() {
        int edadToFinde = view.getEdad();
        int indexPerson = findPersonByEdad(edadToFinde);
        if(indexPerson == -1) {
            view.showMessage("Persona no encontrada");
        } else {
            view.showMessage("Persona con edad " + edadToFinde + " encontrada");
            view.showMessage(people.get(indexPerson).toString());
        }
    }
}
