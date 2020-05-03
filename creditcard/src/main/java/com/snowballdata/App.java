package com.snowballdata;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Person p1 = new Person("Alison", 23);
        Person p2 = new Person("Brian", 56);
        Person p3 = new Person("Chelsea", 46);
        Person p4 = new Person("David", 28);
        Person p5 = new Person("Erica", 37);
        Person p6 = new Person("Francisco", 18);

        List<Person> people = Arrays.asList(p1,p2,p3,p4,p5,p6);

        System.out.println("Hello, world");

    }
}
