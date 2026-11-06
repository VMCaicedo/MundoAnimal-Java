package mx.com.animales;

public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad ){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
    }
    public abstract void hacerSonido();
}

