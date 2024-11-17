#include <bits/stdc++.h>
using namespace std;

int findWays(const vector<int>& denominations, int count, int target) {
    if (target == 0) return 1;
    if (target < 0 || count == 0) return 0;
    return findWays(denominations, count, target - denominations[count - 1]) + 
           findWays(denominations, count - 1, target);
}

int main() {
    vector<int> denominations = {1, 2, 3};
    int target = 5;
    cout << findWays(denominations, denominations.size(), target);
    return 0;
}
