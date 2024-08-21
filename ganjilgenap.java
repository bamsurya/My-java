import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        if (bilangan == 0) {
            System.out.println("Bilangan " + bilangan + " adalah Nol.");
        } else if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah Genap.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah Ganjil.");
        }
    }
}

