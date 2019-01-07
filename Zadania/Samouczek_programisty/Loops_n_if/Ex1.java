package Samouczek_programisty.Loops_n_if;

public class Ex1 {

    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        ex.showOrderedNum(50);
    }

    public void showOrderedNum(int x){
        int i = 0;

        while (i<=x) {
            System.out.printf(" %d", i);
            i++;
        }

    }

}
