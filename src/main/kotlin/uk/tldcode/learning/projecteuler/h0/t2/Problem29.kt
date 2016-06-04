package uk.tldcode.learning.projecteuler.h0.t2

import java.math.BigInteger
import java.util.*


class Problem29 {

    fun distinctPowers(maxa: Int, maxb: Int):Int {
        var terms = HashSet<BigInteger>()
        for (i in 2..maxa) {
            var j = BigInteger.valueOf(i.toLong())
            for (k in 2..maxb) {
                terms.add(j.pow(k))
            }
        }
        return terms.size
    }

}