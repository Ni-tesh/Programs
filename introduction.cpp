/*
Array

Arrays store in contiguos memory
Arrays are cache friendly.

Arrays can be classified into two categories:
fixed size arrays = arr[100], *arr[]=new arr[], arr[]={23,56}
dynamic sized arrays = vector, arraylist, list,
*/




#include<iostream>
using namespace std;

int search(int arr[],int n,int x)
{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			return i;
		}
		return -1;
}

int insert(int arr[],int n,int x, int pos,int cap)
{
	if(n==cap)
	return n;
	
	int index=pos-1;
	for(int i=n-1;i>=index;i--)
	{
		arr[i+1]=arr[i];
	}
	arr[index]=x;
	return(n+1);
}
 
int del(int arr[],int n,int x)
{
	int i;
	for(i=0;i<n;i++)
	{
		if(arr[i]==x)
		break;
	}
	
	if(i==n)
	return n;
	
	for(int j=i;j>n-1;j++)
	{
		arr[j]=arr[j+1];
	}
	return (n-1);
}

int get_largest(int arr[],int n)
{
	for(int i=0;i<n;i++)
	{
		bool flag=true;
		for(int j=0;j<n;j++)
		{
			if(arr[j]>arr[i])
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		return i;
	}
}
//	return -1;

int get_largest_fast(int arr[],int n)
{
	int res;
	for(int i=1;i<n;i++)
	{
		if(arr[i]>arr[res])
		return i;
	}
	return res;
}

bool check_sorted(int arr[],int n)
{
	for(int i=1;i<n;i++)
	{
		if(arr[i]<arr[i-1])
		return false;
    }
    return true;
}

int second_largest(int arr[],int n)
{
	int res=-1; int largest=0;
	for(int i=1;i<n;i++)
	{
		if(arr[i]>arr[largest])
		{
		res=largest;
		largest=i;
	    }
		else if(arr[i]!=arr[largest])
		{
		if(res==-1||arr[i]>arr[res])
		res=i;
	    }
	}
	return res;
}

int reverse(int arr[],int n)
{
	int low=0,high=n-1;
	while(low<high)
	{
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		low++;
		high--;
	}
}

int printarray(int arr[],int n)
{
	for(int i=0;i<n;i++)
	{
		cout<<arr[i];
	}
}

int duplicate(int arr[],int n)
{
	int res=1;
	for(int i=1;i<n;i++)
	{
		if(arr[i]!=arr[res-1])
		arr[res]=arr[i];
		res++;
	}
	return res;
}

int main()
{
	int arr[10],n,i; cin>>n;
	for(i=0;i<n;i++)
	{
		cin>>arr[i];
	}

 
}
