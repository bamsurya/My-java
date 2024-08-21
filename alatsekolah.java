import java.util.Scanner;

public class alatsekolah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih alat keperluan sekolah:");
        System.out.println("1. Pensil");
        System.out.println("2. Pulpen");
        System.out.println("3. Penghapus");
        System.out.println("4. Penggaris");
        System.out.println("5. Buku Tulis");

        System.out.print("Masukkan angka pilihan (1-5): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Pilihan Anda: Pensil");
                break;
            case 2:
                System.out.println("Pilihan Anda: Pulpen");
                break;
            case 3:
                System.out.println("Pilihan Anda: Penghapus");
                break;
            case 4:
                System.out.println("Pilihan Anda: Penggaris");
                break;
            case 5:
                System.out.println("Pilihan Anda: Buku Tulis");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}

