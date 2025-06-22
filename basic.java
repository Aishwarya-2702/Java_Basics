//classes and objects

public class basic{

    int coffee = 20;
    int tea = 10;

    public static void main(String[] args){
        //creating an object
        basic server1 = new basic();
        System.out.println(server1.coffee);
        
        basic server2 = new basic();
        System.out.println(server2.tea);
    }
}

//The class represents the "blueprint" or "template"
//Objects are instances of a class

public class basic{
    String name = "";
    String proc = "";
    int ram = 0;
    int price = 0;

    public static void main(String[] args){
        basic lap1 = new basic();

        lap1.name="hp";
        lap1.proc ="i5";
        lap1.ram = 8;
        lap1.price=10000;

        basic lap2 = new basic();

        lap2.name="lenovo";
        lap2.proc ="i7";
        lap2.ram = 16;
        lap2.price=100000;

        System.out.println(lap2.price);
    }
}

//Functions in Java

//What are functions?

//Syntax
void function_name(){
    void apple(){
        print("This is apple phone");
    }
}

public class basic{
    void greeting(){
        System.out.println("vanakam");
        dummy();
    }

    void dummy(){
        System.out.println("Dummy");
    }

    public static void main(String[] args){
        basic obj1 = new basic();
        obj1.greeting();
        obj1.dummy();
    }
}

public class basic{
    void iphone(){
        System.out.println("This is iphone");
    }
    
    void samsung(){
        System.out.println("This is samsung");
    }

    void oppo(){
        System.out.println("THis is oppo");
    }

    void realme(){
        System.out.println("This is realme");
    }

    public static void main(String[] args){
        basic phone = new basic();
        phone.iphone();
        phone.samsung();
        phone.oppo();
        phone.realme();
    }
}

//Functions with parameters
//A parameterized function is a afunction that accepts input values(parameters)
// to perform its task or computation

public class basic{

    void getSoap(int money){
        System.out.println(money);
        System.out.println("Soap purchased");
    }

    void getChocolate(int money){
        System.out.println(money);
        System.out.println("Chocolate purchased");
    }

    void getPowder(int money){
        System.out.println(money);
        System.out.println("Powder Purchased");
    }

    public static void main(String[] args){
        basic obj1 = new basic();
        obj1.getSoap(20);
        obj1.getChocolate(100);
        obj1.getPowder(149);
    }
}

// Return Keyword in Java
// In Java, the 'return' keyword is used to exit
// a method and optionally return a value
// back to the caller of the method

public class basic{
    int getSoap(int money){
        int soap_price = 18;
        int remainder = money - 18;
        return remainder;
    }
    public static void main(String[] args){
        basic obj1 = new basic();
        int rem = obj1.getSoap(20);
        System.out.println(rem);
    }
}

public class basic{
    int sum(int a, int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args){
        basic obj1 = new basic();
        int sum = obj1.sum(10,2);
        System.out.println(sum);
    }
}

// Method Parameters
// Method Overloading or functional overloading - same functional , parameters are different

public class basic{

    void display(int a, int b){
        System.out.println(a+b);
    }

    void display(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args){
        basic obj1 = new basic();
        obj1.display(12,10);
        obj1.display(12,10,10);
    }
}

// For each loop in java
// Enhanced for loop
// for each loop
// The enhanced for loop in java, also known as the 
// "for-each" loop, simplifies iterating over arrays and
// collections by automatically handling the iteration
// process without needing explicit index control,
// offering cleaner syntax and reducing potential errors.

public class basic{
    public static void main(String[] args){

        int num[] = {12,13,14,15};

        for(int i = 0; i<4; i++){
            System.out.println(num[i]);
        }

        //Enhanced for loop
        for(int var:num){
            System.out.println(var);
        }
    }
}

