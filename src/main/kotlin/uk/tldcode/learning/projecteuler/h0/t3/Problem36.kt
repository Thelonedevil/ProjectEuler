package uk.tldcode.learning.projecteuler.h0.t3

import java.math.BigInteger


class Problem36 {

    fun doubleBasePalindromes(): Long {
        var result = 0L
        for (i in 1..1000000) {
            if (i.toString().startsWith('0') || i.toString().endsWith('0')) {
                continue
            }
            var b = BigInteger.valueOf(i.toLong()).toString(2)
            if (b.equals(b.reversed()) && i.toString().equals(i.toString().reversed())) {
                result += i
            }
        }
        return result
    }
}