
public class Test{
  public static int sum(int a, int b){
      if (b > a){
          System.out.println("This is a: " + a);
          System.out.println("This is b:" +b);
          return a + sum(a, b-1 );
      }else{
          return a;
      }
  }
  public static void main(String[] args){
      int result = sum( 5,10);
      System.out.println(result);
  }
}
