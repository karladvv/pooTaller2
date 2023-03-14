package clase1;

public class Ave extends Animal {
    //Atributos propios
    private String envergadura;

    //Metodo accesores
    public Ave(){
    }
    public Ave(String nombre,int edad,String envergadura){
        super(nombre,edad);
        this.envergadura = envergadura;
    }
    //getters y setters
    public String getEnvergadura(){
        return envergadura;
    }
    public void setEnvergadura(String envergadura){
        this.envergadura=envergadura;
    }
    //metodos propios
    public void mostrarAve() {
        System.out.println("El Nombre del animal es "+getNombre()+" tiene "+getEdad()+" Años y la Envergadura del ave es "+getEnvergadura());
    }
 
}
