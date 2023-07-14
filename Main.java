/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        String data[] = {"apple", "boy", "cat"};
        Scanner input = new Scanner(System.in);
        String q=input.nextLine();
        boolean found=false;
        for(int i=0;i<data.length;i++){
            if(q.equals(data[i])){
                found=true;
                System.out.println("String found at "+ i);

            }
        }
        if(!found){
            System.out.println("String not found in this array ");
        }

    }
}
