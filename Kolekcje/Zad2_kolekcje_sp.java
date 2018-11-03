package exam;

import java.util.*;

public class Zad2_kolekcje_sp {

    public static void main(String[] args) {


        Map<String, String> pary = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imiona par:");

        while (true) {

            String podanie = scan.nextLine();


            if (podanie.equals("-")) {
                break;
            } else {

                try{
                    StringTokenizer wyr = new StringTokenizer(podanie);

                    String imie1 = wyr.nextToken();
                    String imie2 = wyr.nextToken();


                    pary.put(imie1, imie2);

                } catch (Exception e) {
                    System.out.println("podaj dwa wyrazy oddzielone spacją.");
                }
            }
        }


        System.out.println("podaj jedno z wcześniej wprowadzonych imion:");
        String imieu = scan.nextLine();

        if (pary.containsKey(imieu)){
            String value = pary.get(imieu);
            System.out.print(imieu + " jest w parze z: " + value + " ");
        }


        if (pary.containsValue(imieu)){
            Set<String> keys = pary.keySet();

            for(String key : keys){
                String name = pary.get(key);
                if(name.equals(imieu))

                    System.out.print(key + " ");
            }
        }

    }
}
