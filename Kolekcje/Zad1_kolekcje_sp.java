
import java.util.*;

public class Zad1_kolekcje_sp {

    public static void main(String[] args) {

        Set<String> imiona = new HashSet<>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imiona:");

        while (true) {
            String linia = scanner.nextLine();
            if (linia.equals("-")) {
                break;
            }
            imiona.add(linia);

        }

        System.out.println(imiona);



    }
}
