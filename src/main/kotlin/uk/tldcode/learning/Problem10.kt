package uk.tldcode.learning

import java.util.*


class Problem10 {
    fun sumPrimes(max: Int): Long {
        val arr = ArrayList<Long>();
        arr.add(2);
        arr.add(3);
        for (i in 4L..max) {
            if (i % 2L != 0L && i % 3L != 0L) {
                var j = 4L;
                while (j * j <= i) {
                    if (i % j == 0L)
                        break;
                    j++;
                }
                if (j * j > i) {
                    arr.add(i);
                }
            }
        }
        return arr.sum()
    }
}