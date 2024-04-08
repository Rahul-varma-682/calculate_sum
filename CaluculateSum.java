public class CaluculateSum {
    
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;  
    }
    
    public static void main(String[] args) {
        // Example usage
        int result = calculateSum(6);
        System.out.println("Sum: " + result);
    }
}
