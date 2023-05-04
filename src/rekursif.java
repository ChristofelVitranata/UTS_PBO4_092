import java.util.Scanner;

public class rekursif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = scanner.nextInt();
        scanner.close();
        
        if (n < 0) {
            System.out.println("Invalid input");
        } else {
            long faktorial = HitungFaktorial.hitung(n);
            System.out.println("Faktorial dari " + n + " adalah " + faktorial);
        }
    }
}

class HitungFaktorial {
    public static long hitung(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * hitung(n - 1);
    }
}