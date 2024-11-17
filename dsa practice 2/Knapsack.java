public class Knapsack{

    public static int knapsack(int[] weights, int[] values, int capacity, int n) {
        if (n==0 || capacity == 0){
            return 0;
        } 

        if (weights[n-1] > capacity) {
            return knapsack(weights,values,capacity,n - 1);
        } 
        else{
            int include= values[n - 1]+ knapsack(weights,values,capacity-weights[n-1],n-1);
            int exclude= knapsack(weights,values,capacity,n-1);
            return Math.max(include,exclude);
        }
    }

    public static void main(String[] args){
        int[] weights = {1, 2, 3};
        int[] values = {10, 15, 40};
        int capacity = 6;
        int n= weights.length;

        System.out.println(knapsack(weights, values, capacity, n));
    }
}
