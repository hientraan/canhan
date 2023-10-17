public class TezContinueState2 {
    public static final int[] thisarray ={5, 1, 4, 2, 3};
    public static void main(String[] args){
        for (int x = 0; x < 3; ++x){
            TIM: for(int y = 0; y < 3;++y){
                for (int z = 0; z < 3; ++z){
                    if(z==1){
                        continue TIM;
                    }
                    System.out.println("(x variable, y variable, z variable) = ("+x+","+y+","+z+")");
                }
            }
        }
    }
}
