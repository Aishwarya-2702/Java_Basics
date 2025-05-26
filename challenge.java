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