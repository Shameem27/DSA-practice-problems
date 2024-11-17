#include<bits/stdc++.h>
using namespace std;
void findFirstAndLast(int arr[], int n,int x){
    int first_index=-1;
    int last_index=-1;
    for(int i=0;i<n;i++){
        if (arr[i]==x){
            if (first_index == -1) first_index=i;
            last_index=i;
        }
            
    }
    cout<<"First Ocuurence: "<<first_index<<endl;
    cout<<"Last Ocuurence: "<<last_index<<endl;
}
int main()
{
    int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
    int n = sizeof(arr) / sizeof(int);
    int x = 8;
    findFirstAndLast(arr, n, x);
    return 0;
}