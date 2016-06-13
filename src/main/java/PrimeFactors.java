import java.util.ArrayList;
import java.util.List;

class PrimeFactors {
    List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<Integer>();
        if (n != 1) {
            for (int i = 2; i <= n; i++) {
                while (n != i) {
                    if (n % i != 0) {
                        break;
                    }
                    list.add(i);
                    n = n / i;
                }

            }
            list.add(n);
        }
        return list;
    }


}
