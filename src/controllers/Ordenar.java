package controllers;

import java.util.List;

import models.Persona;

public class Ordenar {
    public void sortByAge(List<Persona> people) {
        for (int i = 0; i < people.size() - 1; i++) {
            for (int j = 0; j < people.size() - 1 - i; j++) {
                if (people.get(j).getEdad() > people.get(j + 1).getEdad()) {
                    Persona temp = people.get(j);
                    people.set(j, people.get(j + 1));
                    people.set(j + 1, temp);
                }
            }
        }
    }
}
