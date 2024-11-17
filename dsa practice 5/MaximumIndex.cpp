#include <bits/stdc++.h>
using namespace std;

int findMaxIndexDifference(int nums[], int size) {
    int maxDifference = -1;

    for (int start = 0; start < size; ++start) {
        for (int end = size - 1; end > start; --end) {
            if (nums[end] >= nums[start] && maxDifference < (end - start))
                maxDifference = end - start;
        }
    }

    return maxDifference;
}

int main() {
    int nums[] = {1, 1, 1, 1, 1};
    int size = sizeof(nums) / sizeof(nums[0]);
    int maxDifference = findMaxIndexDifference(nums, size);
    cout << "\n" << maxDifference;
    return 0;
}
