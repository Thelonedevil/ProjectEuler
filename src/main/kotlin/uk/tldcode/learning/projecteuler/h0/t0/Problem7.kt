package uk.tldcode.learning.projecteuler.h0.t0

import java.util.*


class Problem7 {

    fun getNthPrime(n: Int): Long {
        val arr = ArrayList<Long>();
        arr.add(2);
        arr.add(3);
        var i = 4L;
        while (arr.size < n) {
            if (i % 2 != 0L && i % 3 != 0L) {
                var j = 4;
                while (j * j <= i) {
                    if (i % j == 0L)
                        break;
                    j++;
                }
                if (j * j > i) {
                    arr.add(i);
                }
            }
            i++;
        }
        return arr[n - 1]
    }
}