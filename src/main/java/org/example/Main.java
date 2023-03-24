package org.example;
import org.example.Stack;

public class Main {
    public static void main(String[] args) {
        Stack abc = new Stack();
        abc.push("hello");
        abc.push("nothello");
        System.out.println(abc.getHello()[0]);
        System.out.println(abc.getHello()[1]);

        abc.pop();
        System.out.println(abc.pop());
    }
}