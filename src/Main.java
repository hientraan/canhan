class Main {
    //protected String fname = "John";
    protected String lname = "Doe";
    protected String email = "john@doe.com";
    protected int age = 24;
}
class Firstname {
    protected String fname = "Jon";
}
class Student extends Main {
    private int graduationYear = 2018;
    public static void main(String[] args) {
        Student myObj = new Student();
        Firstname myObj2 = new Firstname();
        System.out.println("Name: " + myObj2.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}

