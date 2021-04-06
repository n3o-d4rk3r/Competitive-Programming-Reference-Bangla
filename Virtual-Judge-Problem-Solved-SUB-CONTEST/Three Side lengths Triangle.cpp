#include<bits/stdc++.h>
using namespace std;

/*
*   SUB-Subsequence
*   Team Member:
*   Aryan Kabir
*   Nymul Islam Moon
*   Majharul Islam
*
*/
int main()
{
    int sidea, sideb, sidec;

    cin>>sidea>>sideb>>sidec;

    if(sidea==sideb && sideb==sidec)
    {
        cout<<"Equilateral Triangle"<<endl;
    }
    else if(sidea==sideb || sidea==sidec || sideb==sidec)
    {
        cout<<"Isosceles Triangle"<<endl;
    }
    else
    {
        cout<<"Bad Triangle"<<endl;
    }

    return 0;
}
