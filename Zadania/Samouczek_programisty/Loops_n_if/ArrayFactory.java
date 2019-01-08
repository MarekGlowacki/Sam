package Samouczek_programisty.Loops_n_if;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayFactory {

    private int x;

    public static void main(String[] args) {

        ArrayFactory arr = new ArrayFactory(1897);
        int [] arrayTest = {3, 6, 90, 34, 4, 35, 2};
//        arr.writeInt();
//        System.out.println(arr.revString("Marek"));
//        System.out.println(arr.palindrom("cos"));
//        System.out.println(arr.palindrom("kajak"));
//        System.out.println(arr.palindrom("kajaK"));
//        System.out.println(Arrays.deepToString(arr.matrix(4)));
        arr.bubbleSort(arrayTest);
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

    public void showArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public void bubbleSort(int[] array){
        int count = 0;

        int[] sortedArray = array;
        while (count < array.length -2) {

            count = 0;

            for (int i = 0; i < array.length-1; i++) {
                int arrgArrray;

                    if (sortedArray[i] > sortedArray[i + 1]) {
                        arrgArrray = array[i + 1];
                        sortedArray[i + 1] = array[i];
                        sortedArray[i] = arrgArrray;
                        count -= 1;
                    } else {
                        count += 1;
                    }
            }

        }
        System.out.println(Arrays.toString(sortedArray));
    }
}