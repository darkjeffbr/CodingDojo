package com.darkjeff.coding.dojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static String findFizzBuzz (int num){
        if(num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }

    public static List<String> getList (){
        ArrayList l = new ArrayList<String>();
        for(int i = 0 ; i < 100 ; i++){
            l.add("");
        }
        return  l;
    }
}
