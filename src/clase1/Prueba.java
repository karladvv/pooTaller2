package clase1;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args){
        Scanner lectura=new Scanner(System.in);
        Animal guacamayo=new Animal();
        Movie titanic=new Movie();

        System.out.println("Ingrese el nombre del Animal");
        String nombre=lectura.nextLine();
        System.out.println("Ingrese la edad del Animal");
        int edad=lectura.nextInt();
        
        guacamayo.registrarAnimal(nombre, edad);//invocar
        guacamayo.mostrarAnimal();
    }
    
}
