#include <stdio.h>
#include <math.h>

int equal(char *str1, char *str2){
    for (; *str1 != '\0' || *str2 != '\0'; str1++, str2++) 
        if(*str1 != *str2) 
            return 0;
    return 1;
}

int main() {
    char str1[] = "abcde";
    char str2[] = "abcdef";
    printf("%d\n", equal(str1, str2));
    return 0;
}
