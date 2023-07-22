#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

int find_min_abs_diff(int M, const vector<vector<int>>& price, int target_price, int current_category, int current_cost) {
    // Base case: If we have selected one item from each category,
    // calculate the absolute difference between the current cost and the target price.
    if (current_category == M) {
        return abs(current_cost - target_price);
    }

    int min_abs_diff = INT_MAX;
    // Explore all items in the current category to find the minimum absolute difference
    for (int item_price : price[current_category]) {
        // Recursive call to select one item from the current category and move to the next category
        int new_cost = current_cost + item_price;
        min_abs_diff = min(min_abs_diff, find_min_abs_diff(M, price, target_price, current_category + 1, new_cost));
    }

    return min_abs_diff;
}

int solution(int N, int M, int K, const vector<vector<int>>& price) {
    // Call the recursive function to find the minimum absolute difference
    int min_abs_diff = find_min_abs_diff(M, price, K, 0, 0);
    return min_abs_diff;
}

int main() {
    // Sample input
    int N = 3;
    int M = 1;
    int K = 100;
    vector<vector<int>> price = {
        {1},
        {2},
        {3}
    };

    // Call the solution function with the given input
    int output = solution(N, M, K, price);
    cout << output << endl;

    return 0;
}
