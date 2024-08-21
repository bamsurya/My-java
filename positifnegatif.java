import java.util.Scanner;

public class positifnegatif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        if (bilangan > 0) {
            System.out.println("Bilangan " + bilangan + " adalah Positif.");
        } else if (bilangan < 0) {
            System.out.println("Bilangan " + bilangan + " adalah Negatif.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah Nol.");
        }
    }
}
