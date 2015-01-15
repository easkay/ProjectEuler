#define TRUE 1
#define FALSE 0
#include <math.h>
#include <stdio.h>
int checkPrime(long number)
{
    int i;
    for(i = 2; i <= sqrt(number); i++)
    {
        if(number % i == 0)
        {
            return FALSE;
        }
    }
    return TRUE;
}

long nextPrime(long number)
{
    if(number % 2 == 0)
        number++;
    else
        number += 2;
    if(checkPrime(number) && number > 2)
        return number;
    else
        return nextPrime(number);
}

int main(int argc, char *argv[])
{
    long test = 2L;
    long candidate = 600851475143;
    long lastPrime;
    while(candidate > 1)
    {
        if(candidate % test == 0)
        {
            candidate = candidate / test;
            lastPrime = test;
        }
        else
        {
            test = nextPrime(test);
        }
    }
    printf("Last prime: %ld", lastPrime);
    return 0;
}