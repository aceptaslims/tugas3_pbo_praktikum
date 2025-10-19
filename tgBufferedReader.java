package tugaspraktikumpbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tgBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan Nama BufferedReader: ");
        String nama = input.readLine();
        System.out.println("Halo, " + nama);
    }
}
