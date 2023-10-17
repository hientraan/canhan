public class TezContinueState1 {
    public static final int[] thisarray ={5, 1, 4, 2, 3};
    public static void main(String[] args){
        for (int x = 0; x < thisarray.length; ++x){
            if (x % 2 != 0){
                continue;
            }
            System.out.println("This array ["+x+"]=" +thisarray[x]);

        }
    }

}

