public class TezMeth {

    /*exp1
    static void thisMeth(){
        System.out.println("The pirates have plundered plundered the ship!");
    }
    public static void main(String[] args){
        thisMeth();
        thisMeth();
        thisMeth();
    }*/
    /*Exp2
    static void thisMeth(String name){
        System.out.println(name + " is building my house with the architect Rhodes");
    }
    public static void main(String[] args){
        thisMeth("John");
        thisMeth("Seema");
        thisMeth("Kane");
    }
    */
    /* exp3
    static void thisMeth(String name, int age){
        System.out.println(name + " is building my house with the architect Rhodes. He is "+ age+ ".");
    }
    public static void main(String[] args){
        thisMeth("Jonh", 45);
        thisMeth("Seema", 19);
        thisMeth("Kane",22);
    }
     */
    static int thisMeth(int a, int b){
        return b + a;
    }
    public static void main(String[] args){
        int c = thisMeth(5000, 50);
        System.out.println(c);
    }
}
