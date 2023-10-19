public class TezReturnState {
        public static final int[] thisarray = {5, 1, 4, 3, 2, 10, 12};
        public static void main(String[] args){
        int x = yeven(thisarray);
        if(x != -1){
                System.out.println("The first even number is as follows: " +x);
        }
        }
        public static int yeven(int ... thisarray){
                for (int a = 0; a <thisarray.length; ++a){
                        if(thisarray[a] % 2 == 0){
                                return a ;
                        }
                }
                return -1;
        }
}