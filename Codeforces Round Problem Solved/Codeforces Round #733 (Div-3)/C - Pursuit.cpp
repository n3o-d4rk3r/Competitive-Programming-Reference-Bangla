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
 
typedef pair<int, int> pii;
 
typedef map<string, int> msi;
typedef map<string, string> mss;
 
typedef vector<int> vi;
typedef vector<ll> vll;
typedef vector<bool> vb;
typedef vector<string> vs;

typedef double dbl;

 
#define pb push_back

#define MAX  1e30
#define MAX1 10^9+7
#define MAX2 10^9+9
 

#define  pf                 printf
#define  sc                 scanf
 
#define  s1(n)              scanf("%d",&n)
#define  s2(n1,n2)          scanf("%d %d",&n1,&n2)
#define  s3(n1,n2,n3)       scanf("%d %d %d",&n1,&n2,&n3)
#define  s4(n1,n2,n3,n4)    scanf("%d %d %d %d",&n1,&n2,&n3,&n4)
 
#define  ss1(n)             scanf("%lld",&n)
#define  ss2(n1,n2)         scanf("%lld %lld",&n1,&n2)
#define  ss3(n1,n2,n3)      scanf("%lld %lld %lld",&n1,&n2,&n3)
#define  ss4(n1,n2,n3,n4)   scanf("%lld %lld %lld %lld",&n1,&n2,&n3,&n4)
 
#define  p1(x)              printf("%I64d",x)
#define  p2(x,y)            printf("%I64d %I64d",x,y)
#define  p3(x,y,z)          printf("%I64d %I64d %I64d",x,y,z)
 
#define  fi(i,a,b)          for(long long i=a;i<=b;i++)
#define  fm(i , a)          for(long long i=1;i<=a;i++)
#define  fd(i,a,b)          for(long long i=b;i>=a;i--)
 
#define FOR1(i,n)           for(int i=0; i<n; i++)
#define RFOR1(i,n)          for(int i=n-1; i>=0; i--)
 
#define OUT0(x)cout<<(x)<<" " 
#define OUT1(x)cout<<(x)<<endl 
#define OUT2(x,y)cout<<(x)<<" "<<(y)<<endl 
#define TRACE1(x)cout<<(#x)<<" "<<(x)<<endl
#define TRACE2(x,y)cout<<(#x)<<" "<<(x)<<", "<<(#y)<<" "<<(y)<<endl
#define TRACE3(x,y,z)cout<<(#x)<<" "<<(x)<<", "<<(#y)<<" "<<(y)<<", "<<(#z)<<" "<<(z)<<endl

#define IN1(x) cin>>(x)
#define IN2(x,y) cin>>(x)>>(y)
#define IN3(x,y,z) cin >>(x)>>(y)>>(z)
 
#define clr(x) memset(x,0,sizeof(x))
#define cln(x) memset(x,-1,sizeof(x))

#define HR cout<<"\n-------------------------\n"
#define NL cout<<"\n" 
 
template<typename T>void inpA(T arr[], int n){FOR1(i,n){ IN(arr[i]);}}
template<typename T>void inpV(vector<T>&vec, int n){vec.resize(n);for(int i=0; i<n; i++) cin>>vec[i];}
template<typename T>void outV(vector<T>&vec){for(int i=0; i<vec.size();i++)cout<<vec[i]<<" ";cout<<endl;}
template<typename T>void sortV(vector<T>&vec){ sort(vec.begin(),vec.end()) ; }
template<typename T>void rSortV(vector<T>&vec){ sort(vec.begin(),vec.end(), greater<T>());}
template<typename T>bool bSearchV(vector<T>&vec,T key){return binary_search(vec.begin(),vec.end(),key);}

int T,n,a[100003],b[100003];
    
vi v, g;
bool pre(int mid){

	v.clear();
	g.clear();
	
	for(int i=0;i<n;i++)v.pb(a[i]),g.pb(b[i]);
	for(int i=0;i<mid;i++)v.pb(100),g.pb(0);
	sort(v.begin(),v.end());
	sort(g.begin(),g.end());
	int count=0;
	for(int i=(n+mid)/4; i<(n+mid); i++)
	
		count=count+v[i]-g[i];
	return count >= 0;
}

int main(){
	cin>>T;
	while(T--){
		cin>>n;
		for(int i=0;i<n;i++)scanf("%d",a+i);
		for(int i=0;i<n;i++)scanf("%d",b+i);
		int ans=0,r=3*n,mid;
		while(ans != r){
			mid=(ans+r)/2;
			if(pre(mid))
				r=mid;
			else
				ans=mid+1;
		}
		cout<<ans<<"\n";
	}
}


