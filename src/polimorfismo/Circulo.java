package polimorfismo;

public class Circulo extends Figura {

    public double radio;

    //get y set
    public double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    //sobreescritura

    @Override
    public  void calcularArea(){
    
         double area=Math.pow(radio, 2)*Math.PI;
         System.out.println("El Radio del Circulo es "+radio+" y su area es "+area);
    }
    
    
}

