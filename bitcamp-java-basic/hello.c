
#include <stdlib.h> // function prototype이 여기 들어있음
#include <stdio.h>


// function prototype
void f1(int);
void f2(int*);


void f1(int a) {
 a = 100;
 }
 
 void f2(int* p) {
 *p = 100;
} 

int main(){
  int a = 200;
  
  f1(a);
  
  printf("a = %d\n",a);
  
  f2(&a);
  
  printf("a = %d\n",a);
  
  return 0;
}

