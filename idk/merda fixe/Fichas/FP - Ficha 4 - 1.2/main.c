#include <stdio.h>
#include <stdlib.h>

int main() {
    int i = 0;
    char array[26];
    char letra = 65;
    char new_array[26];
    for(i = 0; i < 26; i++){
        array[i] = letra + i;
        printf("%c",array[i]);
    }
    puts("\n");
    
    for(i = 0; i < 26; i++){
        new_array[i] = array[i] + 4;
        if(i >= 22) new_array[i] = array[i-22];
    }

    printf("%s", new_array);
    return 0;
}

