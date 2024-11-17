#include <bits/stdc++.h>
using namespace std;

int removeDuplicates(vector<int>& nums) {
    unordered_set<int> uniqueSet;
    int uniqueIndex = 0;

    for (int i = 0; i < nums.size(); i++) {
        if (uniqueSet.find(nums[i]) == uniqueSet.end()) {
            uniqueSet.insert(nums[i]);
            nums[uniqueIndex++] = nums[i];
        }
    }

    return uniqueIndex;
}

int main() {
    vector<int> nums = {1, 2, 2, 3, 4, 4, 4, 5, 5};
    int newSize = removeDuplicates(nums);
    for (int i = 0; i < newSize; i++) 
        cout << nums[i] << " ";
    return 0;
}
