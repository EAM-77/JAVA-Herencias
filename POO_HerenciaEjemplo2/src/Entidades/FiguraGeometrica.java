package Entidades;
/*
Clase abstracta que no puede ser insanciada; es decir que no pueden crearse
objetos de esta clase; Sin embargo, permite que otras clases hereden de esta
sus atributos y métodos...
*/
public abstract class FiguraGeometrica {
    
    protected double valor1;

    public FiguraGeometrica(double valor1) {
        super();
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    /*
    Las siguientes sentencias, obliga a las clases que heredan, implementar los
    métodos getArea y getPerimetro...
    */
    public abstract double getArea();
    public abstract double getPerimetro();
}
