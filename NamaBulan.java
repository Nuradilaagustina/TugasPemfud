import java.util.Scanner;
class NamaBulan {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        String[] bulan = {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
        };

        int nomorBulan = input.nextInt();
        if ( nomorBulan >0 && nomorBulan <=12 ){
        System.out.println( "" + bulan[nomorBulan-1] );
          } else {
          System.out.println("Nomor tidak valid");  
          
          }
      }
  }
