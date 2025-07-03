import java.util.*;

class Pown_prime_jump {

    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Max score when reaching the last cell: "+pownJump(n, arr));

        sc.close();

    }

    public static int pownJump(int n, int[] arr) {
        ArrayList<Integer> primeStep = new ArrayList<>();

        for (int i = 2; i < n; i++)
            if (isPrime(i) && i % 10 == 3)
                primeStep.add(i);

        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = arr[0];

        for (int i = 0; i < n; i++) {
            if (dp[0] == Integer.MIN_VALUE) {
                continue;
            }

            if (i + 1 < n) {
                dp[i + 1] = Math.max(dp[i + 1], dp[i] + arr[i + 1]);
            }

            for (int p : primeStep) {
                if (i + p < n) {
                    dp[i + p] = Math.max(dp[i + p], dp[i] + arr[i + p]);
                }
            }
        }
        return dp[n - 1];
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}