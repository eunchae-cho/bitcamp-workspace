
#include <stdlib.h>
#include <stdio.h>

int main(){
    int age; 
    age = 20;
    printf("age = %d\n",age);

    int *pAge = malloc(4); // 반드시 메모리를 확보해야 함. pointer
    *pAge = 200;
    printf("pAge = %d\n",*pAge);
    return 0;
}