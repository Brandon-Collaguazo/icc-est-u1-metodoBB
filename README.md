
# **Práctica de Método de Busqueda Binaria**

## :pushpin: **Información general**

- **Título:** Práctica de metodo de busqueda binario.
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Brandon Collaguazo
- **Fecha:** 23/04/2025
- **Profesor:** Ing. Pablo Torres

------------

## :hammer_and_wrench: **Descripción**

Este proyecto implementa el algoritmo de búsqueda binaria en Java, diseñado para encontrar eficientemente un elemento en una lista ordenada por el método burbuja.

------------

## :rocket: **Ejecución**

Para este proyecto se implementó:
- **Paquete Models:** Con una clase Persona con sus respectivos atributos.


        private String name;
        private int edad;
        public Persona(String name, int edad) {
            this.name = name;
            this.edad = edad;
        }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getEdad() { return edad; }
        public void setEdad(int edad) { this.edad = edad; }
        @Override
        public String toString() {
            return "Persona [Nombre: " + name + ", Edad: " + edad + "]";
        }
	
- **Paquete Controllers:** Con las clases que contienen los métodos para buscar y ordenar el arreglo.

***Metodo Busqueda Binario***
	
    package controllers;
    import java.util.List;
    import models.Persona;
    import views.ShowConsole;
    public class MetodoBusqueda {
        public MetodoBusqueda(List<Persona> personas) {}
        public int findPersonByEdad(int edad) {}
        private void printAges() {}
        private void printAges(int bajo, int alto) {}
        public void showPersonByEdad() {}
    }
	
	
***Ordenar***

    package controllers;
    import java.util.List;
    import models.Persona;
    public class Ordenar {
        public void sortByAge(List<Persona> people) {}
    }
    

- **Views:** Con la clase que se encargará de recibir la edad a buscar y lo mensajes que se imprimirán en pantalla.
    
        package views;
        import java.util.Scanner;
        public class ShowConsole {
            public void showMenu() {}
            public int getEdad() {}
            public void showMessage(String message) {}
        }

- **App:** Clase main.
    
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;
        import controllers.MetodoBusqueda;
        import models.Persona;
        public class App {
            public static void main(String[] args) throws Exception {}
        }

------------

## :sunglasses: **Ejemplo de Entrada**
```
¿Cuantas personas desea ingresar? 9
Ingreso de datos de la persona N° 1
Ingrese el nombre: pablo 
Ingrese la edad: 4
Ingreso de datos de la persona N° 2
Ingrese el nombre: maria 
Ingrese la edad: 5
Ingreso de datos de la persona N° 3
Ingrese el nombre: juan 
Ingrese la edad: 18
Ingreso de datos de la persona N° 4
Ingrese el nombre: david 
Ingrese la edad: 60 
Ingreso de datos de la persona N° 5
Ingrese el nombre: mateo 
Ingrese la edad: 25
Ingreso de datos de la persona N° 6
Ingrese el nombre: diego 
Ingrese la edad: 12
Ingreso de datos de la persona N° 7
Ingrese el nombre: ana 
Ingrese la edad: 8
Ingreso de datos de la persona N° 8
Ingrese el nombre: alicia 
Ingrese la edad: 9
Ingreso de datos de la persona N° 9
Ingrese el nombre: jaime 
Ingrese la edad: 40 
Personas ingresadas
Persona [Nombre: Pablo, Edad: 4]
Persona [Nombre: Maria, Edad: 5]
Persona [Nombre: Juan, Edad: 18]
Persona [Nombre: David, Edad: 60]
Persona [Nombre: Mateo, Edad: 25]
Persona [Nombre: Diego, Edad: 12]
Persona [Nombre: Ana, Edad: 8]
Persona [Nombre: Alicia, Edad: 9]
Persona [Nombre: Jaime, Edad: 40]
Método busqueda binaria
Ingrese la edad a buscar: 18 
Edad ingresada -> 18
4 | 5 | 8 | 9 | 12 | 18 | 25 | 40 | 60 |
Bajo= 5 Alto= 8 Centro= 4 Valor centro= 12 --> DERECHA
18 | 25 | 40 | 60 |
Bajo= 5 Alto= 5 Centro= 6 Valor centro= 25 --> IZQUIERDA
18 |
Bajo= 5 Alto= 5 Centro= 5 Valor centro= 18 -->ENCONTRADO
Persona con edad 18 encontrada
Persona [Nombre: Juan, Edad: 18]
```
