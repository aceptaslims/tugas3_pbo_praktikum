package tugaspraktikumpbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HitungBuah {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukan Jumlah Mangga Yang Dibeli: ");
        int mangga = Integer.parseInt(br.readLine());
        System.out.print("Masukan Jumlah Jambu Per tetangga: ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Jumlah Tetangga: ");
        int jumlahTetangga = Integer.parseInt(br.readLine());
        System.out.print("Masukan Jumlah Masukan Busuk: ");
        int manggaBusuk = Integer.parseInt(br.readLine());
        
        int totalJambu = jambuPerTetangga * jumlahTetangga;
        int totalMangga = mangga - manggaBusuk;
        int totalBuah = totalJambu + totalMangga;
        
        System.out.println("Total Jambu     : " + totalJambu + " pcs");
        System.out.println("Total Mangga    : " + totalMangga + " pcs");
        System.out.println("Total Semua Buah: " + totalBuah + " pcs");
    }
}
