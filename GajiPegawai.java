package tugaspraktikumpbo;

import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nomor Induk Karyawan : ");
        String nik = input.nextLine();
        System.out.print("Nama Karyawan : ");
        String nama = input.nextLine();
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Jabatan : ");
        String jabatan = input.nextLine();
        
        System.out.print("Gaji Pokok (1): ");
        double p1 = input.nextDouble();
        System.out.print("Tunjangan Jabatan (2): ");
        double p2 = input.nextDouble();
        System.out.print("Tunjangan Istri (3): ");
        double p3 = input.nextDouble();
        System.out.print("Tunjangan Anak (4): ");
        double p4 = input.nextDouble();
        
        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;
        
        System.out.println("NIK\t\t: " + nik);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Jabatan\t\t: " + jabatan);
        System.out.println("Total Gaji\t: " + totalGaji);
        System.out.println("Pajak (10)\t: " + pajak);
        System.out.println("Gaji Bersih\t: " + gajiBersih);
        
    }
    
}
