package task2.sequenceGenerator;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class SequenceGeneratorImpl implements SequenceGenerator{
    @Override
    public void a(int n) {
        int tmp = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            tmp+=2;
            stringBuilder.append(tmp).append(", ");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 2));
    }

    @Override
    public void b(int n) {
        int tmp = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            tmp+=2;
            stringBuilder.append(tmp).append(", ");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 2));
    }

    @Override
    public void c(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(i*i).append(", ");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 2));
    }

    @Override
    public void d(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(i*i*i).append(", ");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 2));
    }

    @Override
    public void e(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(i % 2 == 0 ? 1 : -1).append(", ");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 2));
    }

    @Override
    public void f(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(i % 2 == 1 ? i : -i).append(", ");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 2));
    }

    @Override
    public void g(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(i % 2 == 1 ? i*i : -i*i).append(", ");
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length() - 2));
    }

    @Override
    public void h(int n) {
        Integer[] seq = new Integer[n];

        for (int i = 0, j = 1; i < n; i += 2, j++) {
            seq[i] = j;
            seq[i + 1] = 0;
        }

        System.out.println(Arrays.toString(seq).replace("[", "").replace("]", ""));
    }

    @Override
    public void i(int n) {
        BigInteger[] factorial = new BigInteger[n];
        factorial[0] = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            factorial[i - 1] = factorial[i - 2].multiply(BigInteger.valueOf(i));
        }
        System.out.println(Arrays.toString(factorial).replace("[", "").replace("]", ""));
    }

    @Override
    public void j(int n) {
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(Arrays.toString(fib).replace("[", "").replace("]", ""));
    }
}
