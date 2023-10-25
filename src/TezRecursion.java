public class TezRecursion {
    /* EXP Recursion
    public static void main(String[] args){
        int thisInt = summing(10);
        System.out.println("this is result: "+ thisInt);
    }
    public static int summing(int a){
        if(a > 0){
            System.out.println("This is item : "+a);
            return a + summing(a - 2);
        }else {
            return 0;
        }
    } */
    //EXP Halting Condition
    public static void main(String[] args){
        int theInt = summingUp (10, 20);
        System.out.println("This is result: "+ theInt);
    }
    public static int summingUp(int thestart, int theend){

        if (theend > thestart){
            System.out.println("This is item: "+ theend);
            return theend + summingUp(thestart,theend-1);
        }
        return theend;
    }
}
