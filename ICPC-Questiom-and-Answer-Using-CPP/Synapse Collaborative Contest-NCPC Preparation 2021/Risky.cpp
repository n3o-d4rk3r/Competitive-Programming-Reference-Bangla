#include<bits/stdc++.h>
using namespace std;

long long t, a, b, n;

int main() {

    int t;
    cin>>t;

    while(t--)

    {
        cin>>n>>a>>b;

        if(n%a == 0 || n%b == 0 || (n-1)%b == 0 || n == 1)cout<<"Yes"<<endl;

        else cout<<"No"<<endl;

    }
    return 0;
}
