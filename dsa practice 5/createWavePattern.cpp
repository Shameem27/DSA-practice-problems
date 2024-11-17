#include <bits/stdc++.h>
using namespace std;

void createWavePattern(int nums[], int size) {
    sort(nums, nums + size);

    for (int i = 0; i < size - 1; i += 2) {
        swap(nums[i], nums[i + 1]);
    }
}

int main() {
    int nums[] = {10, 90, 49, 2, 1, 5, 23};
    int size = sizeof(nums) / sizeof(nums[0]);
    createWavePattern(nums, size);
    for (int i = 0; i < size; i++)
        cout << nums[i] << " ";
    return 0;
}
