package clase1;
import java.util.Scanner;
public class Animal {
    //Atributos
    private String nombre;
    public int edad;

    Scanner lectura=new Scanner(System.in);

    //Metodos
    public void registrarAnimal(){

        //cuerpo metodo
        System.out.println("Ingrese el nombre del Animal");
        nombre=lectura.nextLine();

        System.out.println("Ingrese la edad del Animal");
        edad=lectura.nextInt();
    }
    public void mostrarAnimal(){
        System.out.println("El nombre del animal es "+nombre+" y los "+edad+" años.");
    }
}
