/*
----------------------------------------------------
---------In the name of ALLAH ----------------------
----------------------------------------------------
* Tried by Aryan Kabir
* CSE, SUB, BD
*
*/

#include<bits/stdc++.h>
using namespace std;

typedef unsigned long long int ull;
typedef long long int ll;
typedef long int li;
typedef int ii;
 
typedef pair<int, int> pii;
 
typedef map<string, int> msi;
typedef map<string, string> mss;
 
typedef vector<int> vi;
typedef vector<ll> vll;
typedef vector<bool> vb;
typedef vector<string> vs;
 
#define pb push_back
 
#define MAX1 10^9+7
#define MAX2 10^9+9
 
#define FOR1(i,n) for(int i=0; i<n; i++)
#define RFOR1(i,n) for(int i=n-1; i>=0; i--)
 
#define OUT0(x)cout<<(x)<<" " 
#define OUT1(x)cout<<(x)<<endl 
#define OUT2(x,y)cout<<(x)<<" "<<(y)<<endl 
#define TRACE1(x)cout<<(#x)<<" "<<(x)<<endl
#define TRACE2(x,y)cout<<(#x)<<" "<<(x)<<", "<<(#y)<<" "<<(y)<<endl
#define TRACE3(x,y,z)cout<<(#x)<<" "<<(x)<<", "<<(#y)<<" "<<(y)<<", "<<(#z)<<" "<<(z)<<endl
 
#define IN1(x) cin>>(x)
#define IN2(x,y) cin>>(x)>>(y)
#define IN3(x,y,z) cin >>(x)>>(y)>>(z)
 
#define HR cout<<"\n-------------------------\n"
#define NL cout<<"\n" 
 
 
typedef vector<int> vi;
typedef vector<string> vs;
 
template<typename T> void inpA(T arr[], int n){FOR1(i,n){ IN(arr[i]);}}
template<typename T> void inpV(vector<T> &vec, int n){vec.resize(n);for(int i=0; i<n; i++) cin>>vec[i];}
template<typename T>void outV(vector<T>&vec){for(int i=0; i<vec.size();i++)cout<<vec[i]<<" ";cout<<endl;}
template<typename T> void sortV(vector<T>&vec){ sort(vec.begin(),vec.end()) ; }
template<typename T> void rSortV(vector<T>&vec){ sort(vec.begin(),vec.end(), greater<T>());}
template<typename T> bool bSearchV(vector<T>&vec,T key){return binary_search(vec.begin(),vec.end(),key);}


void pre(){
 
}
int main(){
 
    ll t;
    string ans;
    
    string s;
    char chars[26] ;
 
    FOR1(i,26){
        chars[i] = 'a' + i ;
    }
    
    cin>>t ;
    while(t--){
        cin >> s ;
        ii n = s.size() ;
 
        vector<bool>contains(26, 0) ;
        ans = "YES" ;
        
        for(char c : s){
            contains[c-'a'] = 1;
        }
 
        for(ii i=0 ; i<n; i++){
            if(contains[i] != 1){
                ans = "NO" ; 
            }
        }
        for(ii i=1; i<n-1; i++){
            if(s[i] > s[i-1] && s[i] > s[i+1]){
                ans = "NO" ;
            }
        }
        cout << ans << endl ;
    }
 
 
    return 0 ;
 
}