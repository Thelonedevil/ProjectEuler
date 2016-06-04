package uk.tldcode.learning

import java.util.*


class Problem12 {

    fun divisibleTrianglarNumber(max: Long): Long {
        var value = 0L
        genTriangleNumbers { value = it;getFactors(it).size <= max }
        return value
    }

    fun genTriangleNumbers(callback: (Long) -> Boolean) {
        var x = 0L;
        var n = 1L
        var shouldContinue = true
        while (shouldContinue) {

            shouldContinue = callback(x)
            x=0L
            for (i in 0..n) {
                x += i
            }
            n++
        }
    }

    fun getFactors(num: Long): Array<Long> {
        val result = LinkedHashSet<Long>()
        var upperlimit = (Math.sqrt(num.toDouble()));
        var i = 0L
        while (i <= upperlimit) {
            i++
            if (num % i == 0L) {
                result.add(i);
                if (i != num / i) {
                    result.add(num / i);
                }
            }
        }
        return result.toTypedArray()
    }
}