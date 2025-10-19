package tugaspraktikumpbo;

import java.util.Scanner;

public class tgScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Scanner: ");
        String nama = input.nextLine();
        System.out.println("Hai, " + nama);
    }
}
