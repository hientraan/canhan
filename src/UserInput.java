import java.util.Scanner;
class UserInput {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please input your name");
        String myUsername = myObj.nextLine();
        System.out.println("Please input your age");
        int myAge = myObj.nextInt();
        System.out.println("Please input your salary");
        double mySalary = myObj.nextDouble();
        System.out.println("The name of user is: " +myUsername);
        System.out.println("The age of user is: " +myAge);
        System.out.println("The salary of user is: "+ mySalary);
    }
}
