package Salud;
import java.util.Scanner;

public class Persona {
    //Atributos: tipoDoc, documento, nombre, apellido, peso, estatura,edad, sexo.
    String tipoDoc,nombre,apellido,sexo;
    int documento,edad,peso,estatura;

    Scanner lectura=new Scanner(System.in);

    //Metodo
    public void pedirDatos(){
        System.out.println("Ingrese el Tipo de Documento");
        tipoDoc=lectura.nextLine();
        System.out.println("Ingrese el numero de Documento");
        documento=lectura.nextInt();
        System.out.println("Ingrese Nombre");
        nombre=lectura.nextLine();
        System.out.println("Ingrese Apellido");
        apellido=lectura.nextLine();
        System.out.println("Ingrese Peso");
        peso=lectura.nextInt();
        System.out.println("Ingrese Estatura");
        estatura=lectura.nextInt();
        System.out.println("Ingrese Edad");
        edad=lectura.nextInt();
        System.out.println("Ingrese el Sexo");
        sexo=lectura.nextLine();
    }
    public void mostrarPersona(){
        System.out.println("Los datos ingresados son Nombre "+nombre+apellido+" tipo de documento y numero "+tipoDoc+documento+" peso, "+peso+" estatura, "+estatura+" edad "+edad+" y sexo "+sexo);
    }
    public void calcularImc(){

    }
}
