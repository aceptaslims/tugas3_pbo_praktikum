package tugaspraktikumpbo;

import java.util.Scanner;

public class CetakanNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan jumlah novel yang dicetak: ");
        int jumlahNovel = input.nextInt();
        System.out.print("Masukan jumlah lembar per novel: ");
        int lembarNovel = input.nextInt();
        
        int totalDetik = jumlahNovel * lembarNovel;
        
        int hari = totalDetik / 86400;
        int sisa = totalDetik / 86400;
        int jam = sisa / 3600;
        sisa %= 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;
        
        System.out.println("Total waktu: " + hari + " hari " + jam + " jam " + menit + " menit " + detik + " detik ");
    }
}
