#include<iostream>
using namespace std;

//insert element at the end

void insertAtEnd(int a[],int n, int element)
{
	int index=n-1;
	a[index]=element;
}

//insert element at index

void insertAtIndex(int a[], int n, int index, int element)
{
	for(int i=n-1;i>=index;i--)
	{
		a[i+1]=a[i];
	}
	a[index]=element;
}

//get element by index
int getElementByIndex(int a[],int n,int index)
{
	if(n>index)
	return a[index];
	else
	return -1;
}

//update array at index
int updateArray(int a[],int index,int element)
{
	a[index]=element;
}

//delete and shift element from array
int deletefromarray(int a[],int n,int index)
{
	for(int i=index;i<n-1;i++)
	{
		a[i]=a[i+1];
	}
	a[n-1]=0;
}

//count smaller than x

int smallerthanx(int a[],int n,int x)
{
	int cnt=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]<x)
		cnt++;
	}
	return cnt;
}

//count greater than X

int greaterThanX(int a[],int n,int x)
{
	int cnt=0;
	for(int i=0;i<n;i++)
	{
		if(a[i]>x)
		cnt++;
	}
	return cnt;
}

//immediate smaller than x
int immediatesmaller(int a[],int n,int x)
{
	int temp=-1;
	for(int i=0;i<n;i++)
	{
		if(a[i]<x)
		temp=max(temp,a[i]);
	}
	return temp;
}

//immidiate larger than x
int immidiatelarger(int a[],int n,int x)
{
	int temp=INT_MAX;
	for(int i=0;i<n;i++)
	{
		if(a[i]>x)
		temp=min(temp,a[i]);
	}
	if(temp==INT_MAX)
	return -1;
	return temp;
}

//majority element between two numbers in an array
int majoritywins(int arr[],int n,int x,int y)
{
	int cnt_x=0,cnt_y=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==x)
		cnt_x++;
		if(arr[i]==y)
		cnt_y++;
	}
	if(cnt_x>cnt_y)
	return x;
	else if(cnt_x<cnt_y)
	return y;
	
	else
	
	if(x>y)
	return y;
	else
	return x;
}

//maximam and miminum element in array
int minmax(int arr[],int n)
{
	int min=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]<=arr[min])
		min=i;
	}
	return arr[min];
	
	int max=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]>=arr[max])
		min=i;
	}
	return arr[max];
	
}

//reverse the array
int reverseArray(int arr[],int n)
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

int main()
{
	int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    cin>>arr[i];
	    
	    reverseArray(arr,n);
	    
	    for(int i=0;i<n;i++)
	    {
	        cout<<arr[i]<<" ";
	    }
	    
	    cout<<endl;
}
