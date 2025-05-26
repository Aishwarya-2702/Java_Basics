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

//Understanding
