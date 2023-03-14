package clase1;
public class Animal {
    //Atributos
    private String nombre;
    public int edad;

    //Metodo Constructor
    public Animal() {//constructor vacio
    } 

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Animal(String nombre,String tipo){

    }
    //Metodo accesores
    public int getEdad(){//Metodos get o getters
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
