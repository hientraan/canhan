public class Test {
    public static final int[] thisarry ={5, 1, 4, 2, 3};
    public static void main(String[] args){
        for (int x = 0; x < 4; ++x){
            TIM: for(int y = 0; y < 2;++y){
            for (int z = 0; z < 2; ++z){
                System.out.println("(x variable, y variable, z variable) = ("+x+","+y+","+z+")");
                if(x==y && y==z){
                    break TIM;
                }
            }
            }
        }
    }
}
