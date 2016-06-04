package uk.tldcode.learning.projecteuler.h0.t0

class Problem8 {
    fun largestProductInSeries(series: String, length: Int): Long {
        var result = 0L
        for (i in 0..(series.length - length)) {
            var j = series.subSequence(i..(i + length - 1))
            var k = 1L
            j.forEach { k *= it.toString().toInt() }
            if (k > result) {
                result = k
            }
        }
        return result
    }
}