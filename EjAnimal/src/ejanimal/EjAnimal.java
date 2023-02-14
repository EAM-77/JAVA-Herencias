package ejanimal;

import Entity.Animal;
import Entity.Gato;
import Entity.Perro;
import java.util.ArrayList;

public class EjAnimal {

    public static void main(String[] args) {
        
        // Creamos el ArrayList de animales...
        
        ArrayList<Animal> Animal = new ArrayList();
        
        
        // Creamos los animales...
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        // Agregamos a la lista los animales creados...
        Animal.add(a);
        Animal.add(b);
        Animal.add(c);
        
        // Recorremos la lista, llamando al método en cada ítem,
        // utilizando la variable auxiliar para ejecutar el método...
        
        for (Animal aux : Animal) {
            aux.hacerRuido();
        }
    }
}
    