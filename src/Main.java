import mx.com.animales.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Roque", 3);
        Gato gato = new Gato("Nube", 2);
        Vaca vaca = new Vaca("Sra. Calloway", 5);

        Animal[] animales = {perro,gato,vaca};

        for(Animal animal : animales){
            animal.mostrarInformacion();
            animal.hacerSonido();

            Movible movimiento = (Movible) animal;
            movimiento.moverse();

            System.out.println("---------");
        }


    }
}