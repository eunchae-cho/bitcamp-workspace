package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫번째 Node와 마지막 Node의 주소를 담을 field를 추가한다.
//      목록 크기를 저장할 field를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.

public class MyLinkedList04 {

  // 값을 찾을 때는 첫번째 Node부터 따라간다.
  Node first;
  // 값을 추가할 때는 마지막 Node에 연결한다.
  Node last;
  // 목록 크기를 보관
  int size;

  // 용도
  // - Node클래스는 목록에서 각 항목의 값을 보관하는 객체로 역할을 수행한다.
  static class Node {
    Object value;
    Node next;
  }

  public boolean add(Object e) {
    Node node = new Node();
    node.value = e;
    if (first == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;
    size++;
    return true;
  }
}
