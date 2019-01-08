package Samouczek_programisty.Loops_n_if;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayFactory {

    private int x;

    public static void main(String[] args) {

        ArrayFactory arr = new ArrayFactory(1897);
//        arr.writeInt();
//        System.out.println(arr.revString("Marek"));
//        System.out.println(arr.palindrom("cos"));
//        System.out.println(arr.palindrom("kajak"));
//        System.out.println(arr.palindrom("kajaK"));
        System.out.println(Arrays.deepToString(arr.matrix(4)));
    }

    public ArrayFactory(int x){
        this.x = Math.abs(x);
    }

    public int[] oneDimension(){
        return new int[x];
    }

    public int[][] twoDimension(){
        return new int[x][x];
    }

    public void writeInt(){
        String signs = String.valueOf(x);

        for (int i=signs.length(); i>0; i--) {
            System.out.println(signs.charAt(i-1));
        }
    }

    public String revString(String word){
        String rev = "";
        for (int i=word.length(); i>0; i--){
            rev += word.charAt(i-1);
        } return rev;
    }

    public boolean palindrom(String word){
        String rev = "";
        for (int i=word.length(); i>0; i--){
            rev += word.charAt(i-1);
        }

        if (rev.toLowerCase().equals(word.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public int[][] matrix(int number){
        int[][] unitArr = new int[number][number];
        for (int i=0; i<number; i++){
            for(int j=0; j<number; j++){
                if (i == j){
                    unitArr[i][j] = 1;
                } else {
                    unitArr[i][j] = 0;
                }
            }
        }
        return unitArr;
    }
}