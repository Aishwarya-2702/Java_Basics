//first "Hello World" Program

class hello {
    public static void main(String args[])
    {
        System.out.println("Hello World");
    }
}

//-------------------------------------------------------------

//Variables and Datatypes
// Variables - Variables are the containers, That will help you to store your data.

class hello {
    public static void main(String arg[]){
        fish container = fish
        bird container = bird
        int container = 65;
        String letter = "Aishu";
        System.out.println(container);
        System.out.println(letter);
    }
}

//---------------------------------------------------------------

//Addition of 2 numbers

class hello {
    public static void main (String args[]){
        int a = 20;
        int b = 30;
        System.out.println(a+b);
    }
}

//----------------------------------------------------------------

//Addition of 3 numbers

class hello {
    public static void main (String args[]){
        int a = 10;
        int b = 20;
        int c = 30;
        int sum = a + b + c;
        System.out.println(sum);
    }
}

//-----------------------------------------------------------------

//How to get user input java

//Understand How System.out.print() works
//--> Your java program uses the 'java.lang' package implicitly.
//--> the 'System' class within 'java.lang' provides access to system resources.
//--> 'System.out' is a part of the 'System' class and represents the standard output stream, usually connected to the terminal.
//--> By using 'System.out.println()', you print text to the terminal.

import java.lang.System;

//How to get user input
//--> We are sending data from code to teminal using System.
//--> To send Data from Terminal to code we need Scanner.

import java.util.Scanner;

//--------------------------------------------------------------------

import java.lang.System;
import java.util.Scanner;

class hello {
    public static void main(String args[]){
        Scanner ai = new Scanner(System.in);
        int a = ai.nextInt();
        System.out.println(a);
    }
}

//--------------------------------------------------------------

import java.lang.System;
import java.util.Scanner;

class hello {
    public static void main(String args[])
    {
        Scanner ai = new Scanner(System.in);
        int a = ai.nextInt();
        int b = ai.nextInt();
        System.out.println(a+b);
    }
}

//------------------------------------------------------------------

import java.lang.System;
import java.util.Scanner;

class hello {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a);
    }
}

//-------------------------------------------------------------------

//Datatypes = Java is a statically typed language, meaning you must declare all variable types before they can be used. This helps catch errors at compile time.

//Primitive Data types - byte, short, int, long, float, double, boolean, char
//Reference/Data object types - String, Array, Class Objects

// Primitive Data Types

//1.Byte: minimum:-128(-2^7) to maximum:127(2^7-1)
//2.Short: minimum:-32,768(-2^15) to maximum:32,767(2^15 - 1)

//-------------------------------------------------------------------

//Understanding if else in java

class hello{
    public static void main(String[] args){
        scenario 1 : its going to rain
        scenario 2 : No rain
        System.out.println("Take an umbrella");
        System.out.println("Enjoy the sunlight");
       boolean rain = false;
       if(rain){
        System.out.println("Take an umbrella");
       }
       else{
        System.out.println("Enjoy the sunlight");
       }
    }
}

//comparison operator: Operator which is used to compare two values (5>4). Here > is a comparison operator here we are comparing two values.

import java.util.Scanner;

class hello{
    public static void main(String[] args){
        int num1 = 40;
        int num2 = 69;

//Find the Greatest number

        if(num1>num2){
            System.out.println("Number 1 is greater");
        }
        else{
            System.out.println("Number 2 is greater");
        }

//Check whether Number 1 and Number 2 is Equal or Not

        if(num1 == num2){
            System.out.println("Both are Equal");
        }
        else{
            System.out.println("Not Equal");
        }

//Get the input from the user and check whether Number 1 and Number 2 is Equal or not.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Number2: ");
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}

//How to compare Two Strings

//In java, when you compare two strings with '==', it checks for the references
// rather than comparing the actual content value inside them. So, if you want to compare 
// the content between two strings, always use the equals() function.

class hello{
    public static void main(String[] args){
        String f1 = new String("apple");
        String f2 = new String("apple");
        // String f1 = "apple";
        // String f2 = "apple";
        System.out.println(f1.equals(f2));
    }
}

//Logical operators

//In Java, Logical operators are symbols that connect two or more expressions of boolean 
//type (i.e., true or false) and return a boolean value as a result.

class hello{
    public static void main(String[] args){

//And Operator

        boolean hungry = true;
        boolean icecream = true;

        if(hungry && icecream){
            System.out.println("Eat");
        }
        else{
            System.out.print("Don't eat");
        }

//Or Operator
     
        boolean cricket = false;
        boolean football = false;

        if(cricket || football){
            System.out.println("Play");
        }
        else{
            System.out.println("Don't Play");
        }

//to find whether a Number is Divisible by 3 or not

        int num = 15;
        if(num%3 == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

//to find whether a Number id Divisible by 5 or not

        if(num%5 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

//divisible by 3 and divisible by 5

        int num = 12;
        if(num%3 == 0 && num%5 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

//Understanding else if and nested if

//else - if : In Java,'else-if' is used after an 'if' statement and before an
//'optional else' statement to test multiple conditions sequentially.

//nested-if : his nesting allows you to check for multiple conditions in a hierarchical manner,
//where the inner if statement is executed only if the condition of the outer if statement is true.
//It's a powerful feature for handling complex decision-making processes.

//Ternary Operator in Java

//Ternary operator in Jav is a shorthand for the if-else
// statement and is used to assign a value to a variable
// based on a condition. It is called "ternary" because it
// involves three parts:
// --> Condition: an expression that evaluates to true or false.
// --> First value (if true): The value assigned if the condition is true.
// --> Second value (if false): The value assigned if the condition is false.

class hello{
    public static void main(String[] args){
        System.out.println(false?"yes":"no");
    }
}

// variable = (condition) ? valueiftrue :valueifflase;

//For loop Explaination

//in Java, a for loop is used to repeatedly execute a block of statement
//for a specific number of times

//demonstarting for loop
//initialize, what is the starting point?
//check whether current print is on necessary limit.

class hello{
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            System.out.println("Aishu");
        }
    }
}

//Array in Java

// An array is like a row of boxes where each box can hold a 
// value, but all boxes must hold the same type of value. You
// can quickly find and change the contents of any box by 
// Knowing its position in the row.

//Array Playlist

class hello{
    public static void main(String[] args){
        String[] playlist = new String[3]; 
        String[] playlist ={"song1","song2","song3"};

        playlist[0] = "song1";
        System.out.println(playlist[0]);

        playlist[1] = "song2";
        System.out.println(playlist[1]);

        playlist[2] = "song3";
        System.out.println(playlist[2]);
    }
}

//Nested for loop

//In java, a nested loop is essentially a
// loop that runs inside another loop.
// each time the outer loop runs once,
// the inner loop runs completely from 
// start to finish.

class hello{
    public static void main(String[] args){
        for (int i=1; i<=2; i++){
            for(int count=1; count<=2; count++){
            System.out.println("aishu");
        }
        }

        for(int count=1; count<=2; count++){
            System.out.println("aishu");
        }
    }
}

class hello{
    public static void main(String[] args){
        for(int teacher=1;teacher<=3; teacher++){
            for(int count=1; count<=1; count++){
                System.out.println("AIshu");
            }
        }
    }
}

//While loop

//Understand this: 
//Anything which is achieved by while
//loop can also be achieved in for loop

//Why While Loop?
// while loops are typically used when the 
// number of iteration is not known before 
// the loop starts,

// for loops are used when the number of iterations is known.

// print number from 1 to 10 in for loop and in while loop

class hello{
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        int j=1;
        while(j<=10){
            System.out.println(j);
            j++;
        }
    }
}

//create a random number until the random number is 5

import java.util.Random;

class hello{
    public static void main(String[] args){
        Random rand = new Random();
        int newnum = 0;

        while (newnum != 5){
            newnum = rand.nextInt(10);
            System.out.println(newnum);
        }
    }
}

//do-while loop

// A do-while loop is a variant of the while 
// loop which guarantees that the loop's
// body will be executed at least once.

class hello{
    public static void main(String[] args){
        int count = 0;
        do{
            System.out.println("AIshu");
            count = count+1;
        }
        while(count<=1);
    }
}