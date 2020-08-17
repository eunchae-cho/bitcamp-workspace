package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫번째 Node와 마지막 Node의 주소를 담을 field를 추가한다.
//      목록 크기를 저장할 field를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.
// 5) 목록에서 값을 조회하는 get() 메서드를 조회한다.
// 6) 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object) 메서드를 정의한다.
//      Node에 생성자를 추가한다.

public class MyLinkedList06 {

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

    public Node() {
    }

    public Node(Object value) {
      this.value = value;
    }
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



  public Object get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }



  public void add(int index, Object element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node node = new Node(element);
    size++;

    if (index == 0) {
      node.next = first;
      first = node;
      return;
    }

    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
        cursor = cursor.next;
      }

    node.next = cursor.next;
    cursor.next = node;

    if (node.next == null) {
      last = node;
    }
  }
}
