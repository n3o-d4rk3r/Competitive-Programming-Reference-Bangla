#include<bits/stdc++.h>
using namespace std;

/*
Team: SUB-SUBSequence
Aryan Kabir
*/

int main()
{
    int d, r, t, cndls = 0, crt = 0;
    cin>>d>>r>>t;
    for(int age=1;age<=2000;age++)
    {
        if(age >= 4)    cndls+=age,   crt += age;
        if(age-d >= 3)  cndls+=age-d;
        if(r+t == cndls) {

                cout<<r-crt;

            return 0;
        }
    }
}
