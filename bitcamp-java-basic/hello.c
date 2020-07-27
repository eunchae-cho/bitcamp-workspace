
#include <stdlib.h>
#include <stdio.h>

int main(){
    int i[3];
    i[0] = 100;
    i[1] = 200;
    i[2] = 300;
    
    printf("%d, %d, %d\n",i[0],i[1],i[2]);
    
    int* p;
    
    //p = &i[0];
    p = i;
    printf("%d\n",*(p+2));
    
    
    int* p2 = (int*)malloc(sizeof(int)*3);
    * p2 = 110;
    *(p2+1) = 220;
    *(p2+2) = 330;
    printf("%d, %d, %d\n",*(p2+0),*(p2+1),*(p2+2));
    printf("%d, %d, %d\n",p2[0],p2[1],p2[2]);
    
    printf("%d\n",*(p2+3));
    printf("%d\n",p[3]);
    
    
    free(p2);               //메모리를 비워줘야 한다.
    
    printf("%d, %d, %d\n",*(p2+0),*(p2+1),*(p2+2));
    
    int* x1;
    x1 = (int*) malloc(12); // 100번지 주소
    x1 = (int*) malloc(120); // 200번지 주소
    // 100번지 주소는 잃어버렸다.
    // dangling object = garbage
    
    free(x1); //메모리 해제. 200번지 주소는 무효된다.
    x1[0] =34; // x1은 무효한 주소를 갖고 있다.
    // 무효한 주소는 dangling pointer라고 부른다.
  
    return 0;
}