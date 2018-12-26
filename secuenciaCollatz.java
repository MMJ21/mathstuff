import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class secuenciaCollatz {

    static Scanner t = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {

        boolean parar = false;
        do {
            boolean elegido = false;
            int num = 0;
            int p = -1;
            System.out.println("Introduzca un número. ");
            try {
                num = t.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número. ");
                t.next();
            }
            Collatz(num);
            do {
                System.out.println("¿Continuar?" + "\t" + "0: SI    1: NO");
                try {
                    p = t.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("¿Continuar?" + "\t" + "0: SI    1: NO");
                    t.next();
                }
                switch (p) {
                    case 0:
                        elegido = true;
                        break;

                    case 1:
                        elegido = true;
                        parar = true;
                        break;
                    default:
                        break;
                }
            } while (!elegido);
        } while (!parar);
    }

    public static void Collatz(int n) {

        int i = 0;
        int t = 0;
        System.out.print(n + ",");
        do {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.print(n + ", ");
                i++;
            }
            else {
                n = 3*n + 1;
                System.out.print(n + ", ");
                t++;
                i++;
            }
            if (n == 1)
                System.out.print(n);
        } while (n > 1);

        System.out.println("\n" + "Número de iteraciones necesarias: " + i);

    }

}

