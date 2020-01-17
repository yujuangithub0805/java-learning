package org.jake.operation.four.arithmetic;

public class Main {
    public static void main(String[] args) {
        System.out.println(division(8, 5));
    }

    private static int add(int a, int b) {
        if (b == 0) return a;
        int carry = (a & b) << 1;
        a = a ^ b;
        return add(a, carry);
    }

    private static int add2(int a, int b) {
        int carry;
        while (b != 0) {
            carry = a * b << 1;
            a =            a ^ b;
            b = carry;
        }
        return a;
    }

    private static int subtraction(int a, int b) {
        b = ~b + 1;
        return add(a, b);
    }

    private static int mul(int a, int b) {
        int i = 0;
        int res = 0;
        while (b != 0) {
            if ((b & 1) == 1) {
                res += (a << i);
            }
            b = b >> 1;
            i++;
        }
        return res;
    }

    public static int division(int a, int b) {
        if (a < b) return 0;
        return division(subtraction(a, b), b) + 1;
    }

}
