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
    long long n, t, x;


    cin>>t;
    long long j = 1;
    while(t--){
        cin>>n;
        vector<long long> arr;
        for(long long i = 0; i < n; i++){
            cin>>x;
            arr.push_back(x);
        }

        if(n == 1){
            cout<<"Case "<<j<<": "<<arr[0] * arr[0]<<endl;
            j++;
            continue;
        }

        sort(arr.begin(), arr.end());


        cout<<"Case "<<j<<": "<<arr[0] * arr[n - 1]<<endl;
        j++;
    }

    return 0;
}
