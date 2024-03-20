import java.util.Scanner;

public class CasosDePrueba {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    for (int i = 0; i < count; i++) {
      String line = in.nextLine();
      String[] strs = line.split(" ");
      for (String string : strs) {
        System.out.println(string);
      }
    }

    in.close();
  }
}
