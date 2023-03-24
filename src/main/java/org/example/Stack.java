package org.example;

public class Stack {
    public String[] a;

    String hello;

    public void push(String bnbn) {
        String[] c;
        if( a != null ){
        c = new String[this.a.length + 1];
            for(int i = 0; i < a.length; i++) {
                c[i] = this.a[i];
            }
            c[c.length-1] = bnbn;
            this.a = c;
        }else{
            a = new String[1];
            a[0] = bnbn;
        }
    }
    public String pop(){
       String[] b;
       String f;
       if( a != null){
           b = new String[this.a.length - 1];
           f = a[a.length-1];
           for(int i =0; i < a.length-1; i++) {
               b[i] = this.a[i];
           }
         } else {
           return null ;
       } return f;
    }

    public int size(){
        return a.length;
    }

    public boolean isEmpty(){

        if(size() == 0 ){
            return true;
        }else{
            return false;
        }

    }
    public String[] getHello(){
        return this.a;
    }

    public String[] setHello(){
        return this.a;
    }


}

