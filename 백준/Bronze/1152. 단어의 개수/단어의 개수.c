#include <stdio.h>
#include <string.h>

int main(void){
    char sentence[1000000];
    int count = 0;  // 공백 개수 카운트
    
    scanf("%[^\n]s", sentence);
    int len = strlen(sentence);  // 문자열 길이
    
    if (len == 1 && sentence[0] == ' '){  // 공백 하나만 입력받는 경우
        printf("%d", count);
        return 0;   
    }

    for(int i = 1; i < len-1; i++){  // 공백으로 시작하거나 끝나는 경우 위한 범주 설정
        if (sentence[i] == ' '){ 
            count++;
        }
    }

    printf("%d", count+1);  // 단어 개수 = 공백 개수 + 1

    return 0;
}