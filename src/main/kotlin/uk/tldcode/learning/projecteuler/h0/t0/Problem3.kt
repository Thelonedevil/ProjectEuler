package uk.tldcode.learning.projecteuler.h0.t0

import java.util.*


class Problem3 {

    fun largestPrimeFactor(num: Long): Long {
        val result = LinkedList<Long>()
        var number = num
        var count:Long
        var i = 2L
        while (i <= number) {
            i++
            count = 0
            while (number % i == 0L) {
                number /= i
                count++
            }
            if (count != 0L) {
                result.add(i)
            }
        }
        return result.last
    }
}