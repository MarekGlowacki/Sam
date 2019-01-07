package Samouczek_programisty.Loops_n_if;

public class ArrayFactory {

    private int x;

    public static void main(String[] args) {
        ArrayFactory arr = new ArrayFactory(1897);
        arr.writeInt();
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


}