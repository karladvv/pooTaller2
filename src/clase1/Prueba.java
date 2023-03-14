package clase1;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args){

        Scanner lectura=new Scanner(System.in);
        Movie titanic=new Movie();
        Animal guacamayo=new Animal();
        Animal panda=new Animal("Bambu", 10);
        Movie up=new Movie();
        Movie laNocheDelDemonio=new Movie();

        guacamayo.setNombre("Pancho");
        guacamayo.setEdad(8);

        guacamayo.mostrarAnimal();
        panda.mostrarAnimal();

        System.out.println("El nombre del guacamayo es "+guacamayo.getNombre()+" y su Edad es "+guacamayo.getEdad());

        /*System.out.println("Ingrese el nombre del Animal");
        String nombre=lectura.nextLine();
        System.out.println("Ingrese la edad del Animal");
        int edad=lectura.nextInt();
        
        guacamayo.registrarAnimal(nombre, edad);//invocar
        guacamayo.mostrarAnimal();
        /* */

        lectura.close();
    }
    
}
