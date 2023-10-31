import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(500) + 1;
        int intentos = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                intentos++;
                System.out.print("Adivina el número: ");
                int entradaUsuario = scanner.nextInt();
    
                if (entradaUsuario < numeroAdivinar) {
                    System.out.println("El número que tienes que adivinar es mayor.");
                } else if (entradaUsuario > numeroAdivinar) {
                    System.out.println("El número que tienes que adivinar es menor.");
                } else {
                    System.out.println("¡Correcto! Has adivinado el número en " + intentos + " intentos.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Debes introducir un número válido");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}

