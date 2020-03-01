package com.epam5.Collections.Collection_List;

import java.util.*;
public class MyList {
    static void fetching(List<String>l)
    { 
    	
        System.out.println(l.get(1));
    }
    static void adding(List<String>l)
    {
        l.add("Namjoon");
        l.add("Seokjin");
        l.add("Yoongi");
        l.add("Hobi");
        l.add("Jimin");
        l.add("Taehyung");
        l.add("Jungkook");
        l.add("Jayashree");
        l.add("Taekook");
        l.add("BTS");
    }
    static void removing(List<String>l)
    {
        l.remove(7);
    }
    static void printing(List<String>l)
    {
         Iterator<String> i=l.iterator();
         while(i.hasNext())
         { 
             System.out.println(i.next());
         }
    }
    public static void main(String args[])
    {
        List<String>l=new ArrayList<String>();
        
        System.out.println("*****Values added******");
        adding(l);
        System.out.println("*****Fetching value*****");
        fetching(l);
        System.out.println("*****Removed value******");
        removing(l);
        System.out.println("******Final List******");
        printing(l);
    }
}