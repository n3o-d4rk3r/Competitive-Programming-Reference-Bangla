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
 
int main()
{
    ii t;
    cin>>t;
    while(t--){
    
        ii xA,yA,xB,yB,xF,yF;
        
        cin>>xA>>yA>>xB>>yB>>xF>>yF;
        
        ii ans = abs(xA-xB) + abs(yA-yB);
        
        if(xA!=xB && yA!=yB){
                 cout<<ans<<"\n";
        }
        else if(ans==(abs(xA-xF)+abs(yA-yF)+abs(xB-xF)+abs(yB-yF))){
            cout<<ans+2<<"\n";
        }
        else{
             cout<<ans<<"\n";
        }
    }
        return 0;
}