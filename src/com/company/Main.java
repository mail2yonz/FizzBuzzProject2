package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number,anotherNumber,number2;

       do {
           System.out.println ("Enter the number:" );
           Scanner scan= new Scanner (System.in);
           number=scan.nextInt ();
           scan.nextLine ();

           System.out.println("Enter the other number to compare to:");
           anotherNumber=scan.nextInt ();
           scan.nextLine ();

           int multipleof7=number%7,multipleof17=number%17,multipleof23=number%23;


           for(int i=1 ;i<number;i++)
           {
               if(i%5==0 && i%3==0)
               {
                   System.out.println ("Fizz Buzz" );
               }else if(i%5==0)
               {
                   System.out.println ("Buzz" );
               } else if(i%3==0)
               {
                   System.out.println ("Fizz" );
               }else{
                   System.out.println (i );
               }
           }
           if(multipleof7==0)
           {
               System.out.print ("Multiple of 7 are :"+multipleof7+ "  " );
           }
           if(multipleof17==0)
           {
               System.out.println ("Multiple of 17 are :"+multipleof17 + " " );
           }
           System.out.println ("Enter a number greater than 1" );
           number2=scan.nextInt ();
           scan.nextLine ();

       }while(number>1);





    }
}
