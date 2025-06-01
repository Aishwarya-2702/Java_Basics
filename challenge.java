// Get input for variable: Name and Age. print it

import java.lang.System;
import java.util.Scanner;

class challenge {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();        
        int Age = sc.nextInt();
        System.out.println("My Name is : "+Name);
        System.out.print("My Age is : "+Age);
    }
}

//--------------------------------------------------------

//Get input variable: Name, Age and Address. Print it.

import java.lang.System;
import java.util.Scanner;

class challenge {
    public static void main(String args[])
    {
        Scanner ar = new Scanner(System.in);
        String Name = ar.nextLine();
        int Age = ar.nextInt();
        ar.nextLine();
        String Address = ar.nextLine();
        System.out.println("My Name is: "+Name);
        System.out.println("My Age is: "+Age);
        System.out.print("My Address is: "+Address);
    }
}

//-------------------------------------------------------------------

//Get input for 3 integer variables: a, b and c. Now multiply all variables and store it in d. Now add all variables and store it in e.

import java.lang.System;
import java.util.Scanner;

class challenge {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = a * b * c;
        int e = a + b + c;
        int div = d/e;
        System.out.println(div);
    }
}

//-------------------------------------------------------------------

// Get Input for 3 variables: Name, Score, department. Let the user enter the score for 100 Marks, you convert it for 10 and print it.

import java.lang.System;
import java.util.Scanner;

class challenge {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        double Score = scan.nextDouble();
        scan.nextLine();
        String Department = scan.nextLine();
        System.out.println("My name is: "+Name);
        System.out.println("My score is: "+Score/10 +"/10");
        System.out.print("My department is: "+Department);
    }
}

//---------------------------------------------------------------------

//Find the output

class challenge{
    public static void main(String[] args){
        String a = "one";
        String b = "one";
        String c = b;
        System.out.println(a==c);

        String a = "one";
        String b = new String("one");
        String c = b;
        System.out.println(a==c);
    }
}

//---------------------------------------------------------------------

//Get a input from user, for the variable called RCB.
//If RCB == Win Print("Ee sala cup Namdhey")
//If RCB == Loose print("cup illa")

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("RCB Result: ");
        String RCB = scan.nextLine();

        if(RCB.equals("wins")){
            System.out.println("Ee sala cup Namdhey");
        }
        else{
            System.out.println("cup illa");
        }
    }
}

//----------------------------------------------------------------------------

//Get a input from user, for the variable called meghana.
//If meghana is "dead" print("Surya meets Ramya")
//else print("surya weds meghana")

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Meghana's Condition: ");
        String Meghana = scan.nextLine();

        if(Meghana.equals("dead")){
            System.out.println("Surya meets Ramya");
        }
        else{
            System.out.println("Surys weds Meghana");
        }
    }
}

//---------------------------------------------------------------------

//Get input for Variable Mark. If Mark > 35 print pass, else print fail.

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Mark: ");
        int Mark = sc.nextInt();

        if(Mark >= 35){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}

//----------------------------------------------------------------------------

//Get input for Variable income. if income is greater than 7000 Scholarship is available.Else not eligible for Scholarship.

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount: ");
        int Income = sc.nextInt();

        if(Income>=7000){
            System.out.println("Scholarship is Available");
        }
        else{
            System.out.println("Not eligible for Scholarship");
        }
    }
}

//----------------------------------------------------------------------------

//Get input for a number and check whether it is divisible by both 3 and 5 or not.
//If yes then print, the number is divisible by 3 and 5 
//Else print the number is not divisible by 3 and 5

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int Number = sc.nextInt();

        if(Number%3 == 0 && Number%5 == 0){
            System.out.println("The Number is Divisible by 3 and 5");
        }
        else{
            System.out.println("The Number is not Divisible by 3 and 5");
        }
    }
}

//------------------------------------------------------------------------------

//Get Input for a number and find it is even or odd number

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int Num = sc.nextInt();

        if(Num%2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}

