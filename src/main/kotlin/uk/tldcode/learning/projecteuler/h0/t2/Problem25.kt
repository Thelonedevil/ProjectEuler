package uk.tldcode.learning.projecteuler.h0.t2

import java.math.BigInteger


class Problem25 {
    fun firstFibByDigits(amount: Int):Long {
        var value = 0L
        fib { value++; it.toString().length < amount }
        return value
    }

    fun fib(callback: (BigInteger) -> Boolean) {
        var x = BigInteger.ONE;
        var y = BigInteger.ONE;
        var shouldContinue = true
        while (shouldContinue) {
            shouldContinue = callback(x)
            val value = x + y
            x = y
            y = value
        }
    }
}