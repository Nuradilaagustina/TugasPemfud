import java.util.Locale;
import java.util.Scanner;
class AngkaRibuan{
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     Locale bahasa = new Locale("id");
     int harga = input.nextInt();
      System.out.printf(bahasa, "Rp%,d,-", harga);
  }
}