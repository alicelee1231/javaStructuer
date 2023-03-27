package org.example;

public class Element {

    //element는 linked-list의 작은 부분, ele가 모여서 linked_list가 만들어짐
    //ele들은 pre랑 next로 서로의 위치를 알 수 있음


    String value;
    Element prev_element;
    Element next_element;

    public Element getPrevElement(){
      return prev_element;
    };

    public Element getNextElement(){
        return next_element;
    }

    public void setPrevElement(Element prevElement){
        this.prev_element = prevElement;
    }

    public void setNextElement(Element nextElement){
        this.next_element = nextElement;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }
}
