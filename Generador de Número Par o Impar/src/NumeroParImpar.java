import java.util.Random;
import clases.ParImparException;

public class NumeroParImpar {
    public static void main(String[] args) {
        try {
            int numeroAleatorio = generarNumeroAleatorio();
            System.out.println("El número aleatorio es: " + numeroAleatorio);
            determinarParidad(numeroAleatorio);
        } catch (ParImparException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public static void determinarParidad(int num) throws ParImparException {
        if (num % 2 == 0) {
            throw new ParImparException("El número es par");
        } else {
            throw new ParImparException("El número es impar");
        }
    }
}
