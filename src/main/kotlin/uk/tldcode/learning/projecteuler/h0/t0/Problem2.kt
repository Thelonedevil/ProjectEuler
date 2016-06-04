package uk.tldcode.learning.projecteuler.h0.t0


class Problem2 {

    fun fib(callback: (Int) -> Boolean) {
        var x = 0;
        var y = 1;
        var shouldContinue = true
        while (shouldContinue) {
            shouldContinue = callback(x)
            val value = x + y
            x = y
            y = value
        }
    }

    fun sumEvenFib(): Int {
        var value = 0
        fib {
            if (it % 2 == 0) {
                value += it
            };value < 4000000
        }
        return value
    }
}