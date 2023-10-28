public class AccessMethod {
    public void fullTrottle(){
        System.out.println("The car is going as fast it can!");
    }
    public void speed(int maxspeed){
        System.out.println("The max speed is: " + maxspeed);
    }
    public static void main(String[] args){
        AccessMethod myCar = new AccessMethod();
        myCar.fullTrottle();
        myCar.speed(200);
    }
}
