//
//  main.cpp
//  Recursion
//
//  Created by Sridhar Venkat on 5/22/17.
//  Copyright © 2017 Sridhar Venkat. All rights reserved.
//

//  Sridhar

#include <iostream>
#include <string>
#include <math.h>

#define RECURSION 1
#define NORMAL 2

using namespace std;

long sum_recursion(long currentNumber, long sum) {
    if(currentNumber == 1) {
        return sum;
    } else {
        return sum_recursion(currentNumber - 1, sum+currentNumber);
    }
}

long sum_normal(long currentNumber) {
    long sum = 0;
    while(currentNumber >= 1) {
        sum = sum + currentNumber;
        currentNumber--;
    }
    return sum;
}

long sum(long number, int style) {
    if (style == RECURSION)
        return sum_recursion(number, 1);
    else
        return sum_normal(number);
}

int main(int argc, const char * argv[]) {
    cout << sum(10001, RECURSION) << endl;
    cout << sum(10001, NORMAL) << endl;
    return 0;
}
