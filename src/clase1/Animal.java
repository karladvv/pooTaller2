package clase1;
public class Animal {
    //Atributos
    private String nombre;
    public int edad;

    //Metodos
    public void registrarAnimal(String n,int e){
        //cuerpo metodo
        nombre=n;
        edad=e;
    }
    public void mostrarAnimal(){
        System.out.println("El nombre del animal es "+nombre+" y tiene "+edad+" años.");
    }
}
