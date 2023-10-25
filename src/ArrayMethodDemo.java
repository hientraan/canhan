package arraymethoddemo;
import java.util.Arrays;
class ThisClass{
    public void printingtheFirstElement(int[] x){
        System.out.println("The first element in the array wil be " +x[0]);
    }
    public int[] returningtheArray(){
        int[] x = new int[3];
        for (int y = 0; y<x.length; y++){
            x[y] = y*2;
        }
        return x;
    }
}
public class ArrayMethodDemo {
    public static void main(String[] args){
        ThisClass amd = new ThisClass();
        int[] ThisArray2 =amd.returningtheArray();
    }
}
