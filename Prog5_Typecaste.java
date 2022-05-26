//In Java, there are two types of casting
/*(1)Widening Casting (automatically):- converting a smaller type to a larger type size
(2)Narrowing Casting (manually): - converting a larger type to a smaller size type*/
package com.company;

public class Prog5_Typecaste {
    public static  void main(String[] args)
    {
        //(1) (Widening Casting):-
        int no1=45;
        double no2=no1;
        System.out.println(no1);
        System.out.println(no2);

        //(2)(Narrowing Casting):-
        double n1=451.3435;
        System.out.println((int)n1);
    }
}
