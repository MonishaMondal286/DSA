class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int num = x;
        int reversed = 0;

        while (x > 0) {
            int rem = x % 10;
            reversed = reversed * 10 + rem;
            x = x / 10;
        }

        return reversed == num;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));   // Output: true
        System.out.println(isPalindrome(-121));  // Output: false
        System.out.println(isPalindrome(10));    // Output: false
    }
}
