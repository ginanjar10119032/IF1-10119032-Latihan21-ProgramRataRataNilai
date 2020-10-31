package if1.pkg10119032.latihan21.programrataratanilai;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * rata-rata nilai mahasiswa
 */
public class IF110119032Latihan21ProgramRataRataNilai {

    public static void main(String[] args) {
      System.out.print("Masukkan Banyaknya Mahasiswa : ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int myArray[] = new int [size];
      double sum = 0;

      for(int i=0; i<size; i++){
        System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
        myArray[i] = s.nextInt();
        sum = sum + myArray[i];
      }
      
      double rataRata = sum/size;
      System.out.println("\n Maka, Rata-rata nilainya adalah : " + rataRata);
        System.out.println("Developed by : Ginanjar Tubagus Gumilar");
        
    }
    
}
