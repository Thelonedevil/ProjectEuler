package uk.tldcode.learning.projecteuler.h0.t0


class Problem6 {

    fun sumSquareDiff(max: Int): Long {
        var sum = 0L
        var square = 0L
        for (i in 1..max) {
            sum += i * i
            square += i
        }
        square *= square
        return square - sum
    }
}