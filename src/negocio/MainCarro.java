package negocio;

public class MainCarro {
    public static void main(String[] args) {
        // 1. Creación de los objetos
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        // 2. Asignación de valores con setters
        c1.setPotencia(2);
        c1.setVelocidad(60);
        c2.setPotencia(-5);
        c2.setVelocidad(-100);

        // 3. Estado inicial
        System.out.println("La potencia del carro 1 es " + c1.getPotencia() +
                " y la velocidad es " + c1.getVelocidad());

        System.out.println("La potencia del carro 2 es " + c2.getPotencia() +
                " y la velocidad es " + c2.getVelocidad());

        // 4. Acelerar y frenar
        c1.acelerar();
        c1.acelerar();
        c1.frenar();

        // 5. Estado final tras las operaciones
        System.out.println("La potencia del carro 1 es " + c1.getPotencia() +
                " y la velocidad es " + c1.getVelocidad());

        System.out.println("La potencia del carro 2 es " + c2.getPotencia() +
                " y la velocidad es " + c2.getVelocidad());
    }
}
