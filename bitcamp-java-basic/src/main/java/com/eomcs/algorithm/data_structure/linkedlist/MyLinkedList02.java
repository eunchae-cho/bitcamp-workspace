package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.

public class MyLinkedList02 {
  // 여러 개의 MyLinkedList 객체가 공유하는 클래스이기 때문에
  // 스태틱으로 Node 클래스로 설계한다.
  static class Node {
    Object value;
    Node next;
  }
}
