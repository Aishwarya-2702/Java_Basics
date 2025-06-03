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

//----------------------------------------------------------------------------

//Understating else-if condition

//Get the input for a number and check the given conditions
//if i score>35 - Video Game
//if i score>60 - iphone
//if i score>90 - MacBook Pro

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score: ");
        int score = sc.nextInt();

        if(score>=35 && score<60){
            System.out.println("Video Game");
        }

        else if(score>=60 && score<90){
            System.out.println("iphone");
        }

        else if(score>=90){
            System.out.println("MacBook Pro");
        }

        else{
            System.out.println("Below 35");
        }
    }
}

//---------------------------------------------------------------------------------

//understanding nested-if condition

//I will go only to KFC
//I will eat Only Chicken
//I will have only pepsi along with chicken

class challenge{
    public static void main(String[] args){
        boolean kfc = true;
        boolean chicken = true;
        boolean pepsi = true;

        if(kfc){
            System.out.println("Entered into KFC");
            if(chicken){
                System.out.println("Eating Chicken");
                if(pepsi){
                    System.out.println("Drinking Pepsi");
                }
            }
        }
        else{
            System.out.println("No Restarants");
        }
    }
}

//---------------------------------------------------------------------------------

//Question: What is the Score in a game?
// If the score is less than 50, print "you need to improve"
// If the score is between 50 and 70(inclusive), print "Great Job!"
// If the score is greater than 70, print "Excellent performance!"

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Score: ");
        int Score = sc.nextInt();

        if(Score<50){
            System.out.println("You need to improve");
        }
        else if(Score>=50 && Score<=70){
            System.out.println("Great Job!");
        }
        else{
            System.out.println("Excellent Performance!");
        }
    }
}

//-------------------------------------------------------------------------------------

//Get input for five subjects marks. Add all of it, and find average.
//If average mark is less than 35. print "Additional class is required"
//else Print "You are good to go".

import java.util.Scanner;

class challenge{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sub1 Mark: ");
        int sub1 = sc.nextInt();
        System.out.print("Sub2 Mark: ");
        int sub2 = sc.nextInt();
        System.out.print("Sub3 Mark: ");
        int sub3 = sc.nextInt();
        System.out.print("Sub4 Mark: ");
        int sub4 = sc.nextInt();
        System.out.print("Sub5 Mark: ");
        int sub5 = sc.nextInt();

        int Mark = sub1 + sub2 + sub3 + sub4 + sub5;
        int Average = Mark / 5;

        if(Average<35){
            System.out.println("Additional class is required");
        }
        else{
            System.out.println("You are good to go");
        }
    }
}

//--------------------------------------------------------------------------------------------

//What is the colour of the traffic light?
//if the answer is "red", print "stop"
//if the answer is "yellow", print "Get Ready"
//if the answer is "green", print "Go"

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the colour: ");
        String colour = sc.nextLine();

        if(colour.equals("red")){
            System.out.println("Stop");
        }
        else if(colour.equals("yellow")){
            System.out.println("Get Ready");
        }
        else if(colour.equals("green")){
            System.out.println("Go");
        }
    }
}

//----------------------------------------------------------------------------------------

//Get input for Salary and age
//If salary greater than or equal to 20000 or age less than or equal to 25
//get input for required loan amount. if not print you are not eligible for loan.
//if required loan amount is less than or equal to 50000 
//print you are eligible for loan.
//if it is greater than 50000 print maximum loan amount is 50000

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Salary: ");
        int Salary = sc.nextInt();
        System.out.print("Enter Your Age: ");
        int Age = sc.nextInt();

        if(Salary>=20000 || Age<=25){
            System.out.println("Eligible for Loan");
            System.out.print("Enter the Loan Amount: ");
            int Loan = sc.nextInt();
            if(Loan<=50000){
                System.out.println("You are eligible for Loan");
            }
            else{
                System.out.println("Maximum Loan amount is 50000");
            }
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}

//-------------------------------------------------------------------------------------

//Get input for two integer number and find which number is greater using ternary operatory

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();

        String number = num1>num2?"num1 is greater" : "num2 is greater";
        System.out.println(number);
    }
}

//---------------------------------------------------------------------------------------------------

//Lets say we want to print the name "Aishu" for 10 times.

class challenge{
    public static void main(String[] args){
        for(int i = 1; i<=10; i++){
            System.out.println("Aishu");
        }
    }
}

//---------------------------------------------------------------------------

//Write a program to print the number from 1 to 10.

class challenge{
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}

//--------------------------------------------------------------------------------

//Write a program to print reverse number from 1 to 10

class challenge{
    public static void main(String[] args){
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
    }
}

//---------------------------------------------------------------------------------

//Get input for variable a and b and print the number from a and b
//input - 5, 10
//Output - 5,6,7,8,9,10

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Starting Number: ");
        int a = sc.nextInt();
        System.out.print("Ending Number: ");
        int b = sc.nextInt();

        for(int i=a; i<=b; i++){
            System.out.println(i);
        }
    }
}

//-------------------------------------------------------------------------------------

//Print even number between 1 to 10 using for loop and if condition

class challenge{
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            if(i%2 == 0){
                System.out.println("Even Number: "+i);
            }
        }
    }
}

//-------------------------------------------------------------------------------------

//count the number of odd number from 1 to 10

class challenge{
    public static void main(String[] args){
        int oddcount = 0;
        for(int i=1; i<=10; i++){
            if(i%2 != 0){
                oddcount = oddcount+1;
            }
        }
        System.out.print("Count: "+oddcount);
    }
}

//-------------------------------------------------------------------------------------

//Count the number of even number from 1 to 10

class challenge{
    public static void main(String[] args){
        int evencount = 0;
        for(int i=1; i<=10; i++){
            if(i%2 == 0){
                evencount = evencount+1;
            }
        }
        System.out.print("Even Count: "+evencount);
    }
}

//---------------------------------------------------------------------------------------

//Print the number which are divisible by both 3 and 5 Range 1 to 100

class challenge{
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println(i);
            }
        }
    }
}

//---------------------------------------------------------------------------------------

//Create an integer array, Get input for 5 numbers and print their sum or total.

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        int[] num = new int[5];

        Scanner sc = new Scanner(System.in);
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();
        num[3] = sc.nextInt();
        num[4] = sc.nextInt();

        System.out.println(num[0]+num[1]+num[2]+num[3]+num[4]);
    }
}

//--------------------------------------------------------------------------------------------

//Get input for 5 Numbers using Array and for loop

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        for(int i=0;i<=4;i++){
            marks[i] = sc.nextInt();
        }
        for(int i=marks[0]; i<=marks[4]; i++){
            System.out.println(i);
        }
    }
}

//---------------------------------------------------------------------------------

//print 10 Numbers from an Array using For loop

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i=0; i<=9; i++){
            nums[i] = sc.nextInt();
        }
        for(int i=0; i<=9; i++){
            System.out.println(nums[i]);
        }
    }
}

//-----------------------------------------------------------------------------

//Print 2 table using for loop

class challenge{
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            System.out.println(i+ "x2=" +i*2);
        }
    }
}

//--------------------------------------------------------------------------------

//get one input which table to be print using for loop

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table: ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(i*num);
        }
    }
}

//---------------------------------------------------------------------------------

//Get input for size on array
//Get input for each element in an array
//Find and print middle element in an array

import java.util.Scanner;

class challenge{
    public static void main(String[] args){
        //Get input for size on array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int size = sc.nextInt();
        int[] marks = new int[size];

        //Get input for each element in an array
        for(int i=0; i<=size-1; i++){
            marks[i] = sc.nextInt();
        }

        //find and print middle element in an array

    }
}

//--------------------------------------------------------------------------------

//Print this output
//***
//***
//***

class challenge{
    public static void main(String[] args){
        for(int i=1; i<=3; i++){
            for(int count=1; count<=3; count++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//--------------------------------------------------------------------------------

//Print the output
//*
//**
//***

class challenge{
    public static void main(String[] args){
        for(int i=1;i<=3;i++){
            for(int count=1; count<=i;count++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

