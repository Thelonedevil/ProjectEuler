package uk.tldcode.learning.projecteuler.h0.t2

import java.util.*


class Problem21 {

    fun sumAmicableNumbers(max: Long): Long {
        var result = 0L
        for (a in 2..max) {
            var b = d(a)
            var c = d(b)
            if (a != b && c == a) {
                result += a
            }

        }
        return result
    }

    fun d(n: Long): Long {
        return getFactors(n).sum() - n
    }

    fun getFactors(num: Long): Array<Long> {
        val result = LinkedHashSet<Long>()
        var upperlimit = (Math.sqrt(num.toDouble()));
        var i = 0L
        while (i <= upperlimit) {
            i++
            if (num % i == 0L) {
                result.add(i);
                if (i != num / i) {
                    result.add(num / i);
                }
            }
        }
        return result.toTypedArray()
    }
}