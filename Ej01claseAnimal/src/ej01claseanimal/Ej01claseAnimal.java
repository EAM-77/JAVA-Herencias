package ej01claseanimal;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Ej01claseAnimal {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Stich", "Asado", 15, "Doberman");
        Animal perro2 = new Perro("Teddy", "Albondigas", 10, "Chihuahau");
        Animal gato1 = new Gato("Pelusa", "Atún", 15, "Siamés");
        Animal caballo1 = new Caballo("Spark", "Alfalfa", 25, "Fino");
        perro1.mostrarAlimento();
        perro2.mostrarAlimento();
        gato1.mostrarAlimento();
        caballo1.mostrarAlimento();
    }
    
}
