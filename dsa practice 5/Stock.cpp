#include<bits/stdc++.h>
using namespace std;
int maximumprofit(vector<int>prices){
    int lmin=prices[0];
    int lmax=prices[0];
    int n=prices.size();
    int res=0;
    int i=0;
    while(i < n-1){
        while(i<n-1 && prices[i]>=prices[i+1]){i++;}
        lmin=prices[i];
        while(i<n-1 && prices[i]<=prices[i+1]){i++;}
        lmax=prices[i];

        res=res+lmax-lmin;
    }
    return res;

}
int main() {
    vector<int> prices = {100, 180, 260, 310, 40, 535, 695};
    cout << maximumprofit(prices);
    return 0;
}