package org.example;

public class Main {
    public static void main(String[] args) {
        Stack abc = new Stack();
        abc.push("hello");
        abc.push("nothello");
        System.out.println(abc.pop());
        System.out.println(abc.pop());
        System.out.println(abc.pop());
        System.out.println(abc.size());
        System.out.println(abc.isEmpty());
        abc.push("hello1");
        abc.push("hello2");
        System.out.println(abc.size());
        System.out.println(abc.isEmpty());
        System.out.println(abc.peek());
        System.out.println(abc.pop());
        System.out.println(abc.peek());
    }
}