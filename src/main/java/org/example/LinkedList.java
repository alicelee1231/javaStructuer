package org.example;



public class LinkedList {

  //first와 last모두 linked_list의 처음 ele와 마지막 ele임/ ele가 모여서 list가 되는거임

  int size;
  Element first;
  Element last;


  public void add(String x) {
    Element el = new Element();
    el.setValue(x);
    el.setPrevElement(el.prev_element);
    el.setNextElement(el.next_element);
    if(first != null) {
      //list는 서로 앞의 마지막 값을 알고 뒤의 처음 값을 안다...
      //그럼 먼저 어떤 값이 있는지 가져오고..
      //연결을 해야할듯..?
      el.getValue();
      el.getPrevElement();
      el.getNextElement();
    }else {
      this.first = el;
      this.last = el;
    }
  }
}