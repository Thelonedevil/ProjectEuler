package uk.tldcode.learning.projecteuler.h0.t1

import java.math.BigDecimal


class Problem16 {

    fun powerDigitSum(d: BigDecimal): Long {
        return d.toBigInteger().toString().asIterable().map { it.toString().toLong() }.sum()

    }
}