//create a class, this class should have 2 variables
//a=10
//b=20
//create a function called sum which should add a&b and print the total output
//call the sum function from main method

public class challenge2{
    int a = 10;
    int b = 20;

    void sum(){
        int add = a+b;
        System.out.println(add);
    }

    public static void main(String[] args){
        challenge2 addition = new challenge2();
        addition.sum();
    }
}

//---------------------------------------------------------------------------------------

//Create a class, this class should have 2 variables
//apple_price = 20
//apple_count = 5
//Create a function called total_money which should count with price
//display the total amount

public class challenge2{
    int apple_price = 20;
    int apple_count = 5;

    void total_money(){
        int totals = apple_price*apple_count;
        System.out.println(totals);
    }
    public static void main(String[] args){
        challenge2 total = new challenge2();
        total.total_money();
    }
}

//-----------------------------------------------------------------------------------------------

//create a function called sum, send two 
// numbers from main functions and add these 
// numbers using function and print it.

// likewise create functions like sub, mul, div

public class challenge2{

    void sum(int a, int b){
        System.out.println(a+b);
    }

     void sub(int a, int b){
        System.out.println(a-b);
    }

     void mul(int a, int b){
        System.out.println(a*b);
    }

     void div(int a, int b){
        System.out.println(a/b);
    }
    public static void main(String[] args){
        challenge2 calc = new challenge2();
        calc.sum(10,2);
        calc.sub(10,2);
        calc.mul(10,2);
        calc.div(10,2);
    }
}

// ---------------------------------------------------------------------------------------------------------

// Create a function called getname(), which 
// should return your name,

// create a function called getphone(), which
// should return you the phone number.

public class challenge2{

    String getname(String name){
        return name;
    }

    int getphone(int num){
        return num;
    }

    public static void main(String[] args){
        challenge2 obj1 = new challenge2();
        String name = obj1.getname("Aishu");
        System.out.println(name);
        int number = obj1.getphone(123456789);
        System.out.print(number);
    }
}

//------------------------------------------------------------------------------------------------------

// Create a class called "Find" with main function
// Create a function called evenorodd with integer paramenter called int num
// Inside Main Function get integer input from user
// Pass that input to the evenorodd function and let the function decide
// whether the number is even or odd.

public class challenge2{
    int evenorodd(int num){
        if(num%2 == 0){
            System.out.println("It's an even number");
        }
        else{
            System.out.println("It's an odd number");
        }
        return num;
    }
    public static void main(String[] args){
        challenge2 obj1 = new challenge2();
        int number = obj1.evenorodd(12);
        System.out.println(number);
    }
}

//---------------------------------------------------------------------------------

// Create a class called "School" with main function
// Create a function called passorfail which should return the String "Pass/Fail"
// Inside Main function get integer input from user for total mark.
// Pass that input to the passorfail function and let the function
// decide where student is passorfail.

import java.util.Scanner;

public class challenge2{

    void passorfail(int result){
        if(result>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark: ");
        int result = sc.nextInt();
        challenge2 obj1 = new challenge2();
        obj1.passorfail(result);
    }
}

//------------------------------------------------------------------------------------------------------------


