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
        } ;
    }
    public String pop(){
       String[] b;
       String f;
       if( a != null && a.length > 0){ // 계속 -1을하니까 값이 -1일 나와서 값을 가져올 때 애러가 발생, 그래서 &&연산자 사용
           b = new String[this.a.length - 1 ];
           f = a[a.length-1];
           for(int i =0; i < a.length-1; i++) {
               b[i] = this.a[i];
           }
           this.a = b; // 항상 변경되는 값을 왼쪽에 써준다. 이 상황은 b의 라벨을 a상자에 붙이는거
         } else {
           return null ;
       } return f;
    }

    public int size(){
        return a.length;
    }

    public boolean isEmpty() {

        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }
        public String peek(){
            String last;
        if( a.length > 0) {
            last = a[a.length -1];
            return last;
        } else {
            return null;
        }
    }
}

