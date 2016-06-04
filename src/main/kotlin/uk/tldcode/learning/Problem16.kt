package uk.tldcode.learning

import java.math.BigDecimal


class Problem16 {

    fun powerDigitSum(d: BigDecimal): Long {
        return d.toBigInteger().toString().asIterable().map { it.toString().toLong() }.sum()

    }
}