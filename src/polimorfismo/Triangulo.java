package polimorfismo;

public class Triangulo extends Figura {

    public float base,altura;
    
    //get y set
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    //sobreescritura
    @Override
    public void calcularArea(){
        float area=(base*altura)/2;
        System.out.println("La base del Triaungulo es "+base+" con una altura de"+altura+"y  el area es "+area);
    }
    
}
