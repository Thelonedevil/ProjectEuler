package uk.tldcode.learning.projecteuler.h0.t2

import java.math.BigInteger


class Problem20 {

    fun factorialDigitSum(num: Long): Long {
        var result = BigInteger.valueOf(num)
        for (i in (num - 1)downTo 1) {
            result = result.multiply(BigInteger.valueOf(i))
        }
        return result.toString().asSequence().map { it.toString().toLong() }.sum()
    }
}