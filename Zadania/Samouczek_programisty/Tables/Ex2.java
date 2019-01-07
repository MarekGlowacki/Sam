package Samouczek_programisty.Tables;

public class Ex2 {

    public static void main(String[] args) {
        int[] tab = {4, 8, 9};
        System.out.println(tab);
        rev(tab);
    }

    public static int[] rev(int[] tab){
        int[] rtab = new int[3];
        for (int i=2; i>-1; i--){
            rtab[i] = tab[tab.length-1-i];
            System.out.printf("R %d, i: %d%n", rtab[i], i);
            System.out.printf("T %d, i: %d%n", tab[i], i);
        }


        return rtab;
    }

}
