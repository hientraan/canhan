import java.util.ArrayList;
public class TezReturnState {
    public static final int[] thisarray = {5, 1, 4, 3, 2, 10, 12};

    public static void main(String[] args) {
        ArrayList<Integer> x = yeven(thisarray);
        if(x!= null) {
            System.out.println("The position of even number in array: " + x);
        }
    }
    public static ArrayList<Integer> yeven(int... thisarray) {
        ArrayList<Integer> TheList = new ArrayList<Integer>();
        for (int a = 0; a < thisarray.length; ++a) {
            if (thisarray[a] % 2 == 0) {
                TheList.add(a);
                return TheList;
            }
        }
        return null;
    }
}