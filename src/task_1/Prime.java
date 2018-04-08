package task_1;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        int n = 101;
        int m = 200;
        System.out.println(getPrimeList(n, m).size());
        System.out.println(getPrimeList(n, m));
    }

    private static List<Integer> getPrimeList(int n, int m) {

        List<Integer> res = new ArrayList<>();

        for(int i = n; i < m + 1; i++) {
            if (isPrime(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
