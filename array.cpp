/*
#include<iostream>
#define MAX 10
using namespace std;
int main()
{
	int ex[MAX]={12,23,34,45,67};
	char word[MAX]={'S','M','I','L','E'};
	char mesg[]="Message of the day is :";
	cout<<mesg<<word<<endl;
	for(int i=0;i<MAX;i++)
	{
		cout<<endl<<ex[i];
	}
}
*/

/*
#include<iostream>
using namespace std;
int main()
{
	int i,a[10];
	for(i=0;i<10;i++)
	{
		cin>>a[i];
	}
	for(i=0;i<10;i++)
	{
		cout<<endl<<a[i];
	}
}
*/

/*
#include<iostream>
using namespace std;
int funarray(int[],int);
int funarray(int p[],int n)
{
	int s=0,i;
	for(i=0;i<=n-1;i++)
	{
		s=s+p[i];
	}
	return(s);
}
int main()
{
	int a[10],i,sum;
	for(i=0;i<10;i++)
	{
		cin>>a[i];
	}
	sum=funarray(a,10);
	cout<<sum;
	return 0;
}
*/ 

#include<iostream>
using namespace std;
int i,len,pos,num;
void insert(int a[],int,int,int);
int main()
{
	
	int a[100];
	cout<<"Enter integer to be read";
	cin>>len;
	for(i=0;i<len;i++)
	{
		cin>>a[i];
	}
	cout<<"Enter integer to be inserted";
	cin>>num;
	cout<<"Enter position in the array for insertion";
	cin>>pos;
	insert(a,len,pos,num);
}
void insert(int a[],int len,int pos, int num)
{
	for(i=len;i>=pos;i--)
	{
		a[i+1]=a[i];
	}
	a[pos]=num;
	if(pos>len)
	{
		cout<<"insertion outside array";
	}
	len++;
	cout<<"New array";
	for(i=0;i<len;i++)
	{
		cout<<endl<<a[i];
	}
}

#include<iostream>
using namespace std;

int main(){
	int a[3][3];
	int i,j;
	cin>>s;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++){
			cin>>s[i][j];
		}
	}
	
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			cout<<s[i][j]<<" ";
		}
		cout<<""<<endl;
	}
}
		
