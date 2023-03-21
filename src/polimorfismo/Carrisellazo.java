package polimorfismo;

import java.util.Scanner;

public class Carrisellazo implements Juego {

    private String nombre;
    private int eleccion;
    private int lanzamiento;
    Scanner lectura=new Scanner(System.in);
    @Override
    public void iniciar(){
        System.out.println("Ingrese Nomre del jugador");
        nombre=lectura.nextLine();
    }
    @Override
    public void jugar() {
        
    }
    @Override
    public void finalizar() {
        
    }

    
}
