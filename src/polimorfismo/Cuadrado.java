package polimorfismo;

public class Cuadrado extends Figura {

    private float lado;//atributo encapsulado

    //metodo get y set
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    //sobreescritura

    @Override
    public void calcularArea(){
        // area cuadrado
        float area=lado*lado;
        System.out.println("El lado del Cuadrado es "+lado+" y su area es "+area);
    }
    
}
