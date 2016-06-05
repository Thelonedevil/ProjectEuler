package uk.tldcode.learning.projecteuler.h0.t0


class Problem1 {
    fun sum(min: Int, max: Int): Long {
        var result = 0L
        for (j in min..max-1) {
            result += if (j % 3 == 0 || j % 5 == 0) j else 0
        }
        return result
    }
}