#include <stdio.h>

int main(void){
    int firstOn, firstOff, secondOn, secondOff, thirdOn, thirdOff, fourthOn, fourthOff;
    scanf("%d %d", &firstOff, &firstOn);
    int firstNum = firstOn;

    scanf("%d %d", &secondOff, &secondOn);
    int secondNum = firstNum + secondOn -secondOff;

    scanf("%d %d", &thirdOff, &thirdOn);
    int thirdNum = secondNum + thirdOn - thirdOff;

    scanf("%d %d", &fourthOff, &fourthOn);
    int fourthNum = thirdNum - fourthOff;
    
    int arr[4] = {firstNum, secondNum, thirdNum, fourthNum};
    
    int max = 0;
    for(int i = 0; i < 4; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    
    printf("%d", max);
    return 0;
}