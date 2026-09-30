package negocio;

public class Carro {
    public int potencia;
    public double velocidad;

    public void acelerar(){
        velocidad += potencia;
    }
    public void frenar() {
        velocidad /= 2;
    }
}
