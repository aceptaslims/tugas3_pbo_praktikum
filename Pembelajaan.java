package tugaspraktikumpbo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Pembelajaan {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream (System.in);
        DataOutputStream out = new DataOutputStream (System.out);
        
        System.out.print("Nama : ");
        String nama = in.readLine();
        System.out.print("Total Belanja : ");
        double totalBelanja = Double.parseDouble(in.readLine());
        System.out.print("Diskon (%): ");
        double diskon = Double.parseDouble(in.readLine());
        
        double total = totalBelanja - (totalBelanja * diskon/100);
        
        System.out.print("Bayar: ");
        double bayar = Double.parseDouble(in.readLine());
        
        double kembalian = bayar - total;
        
        out.writeBytes("Nama\t\t: " + nama + "\n");
        out.writeBytes("Total Belanja\t: " + totalBelanja + "\n");
        out.writeBytes("Diskon\t\t: " + diskon + "%\n");
        out.writeBytes("Total Setelah Diskon: Rp " + total + "\n");
        out.writeBytes("Bayar\t\t: " + bayar + "\n");
        out.writeBytes("Kembalian\t: " + kembalian + "\n");
        
        
        
    }
}
