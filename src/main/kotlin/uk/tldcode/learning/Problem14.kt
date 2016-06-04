package uk.tldcode.learning

import java.util.*


class Problem14 {
    fun collatzSequence(start: Long): LongArray {
        var result = LinkedList<Long>()
        result.add(start)
        var x = start
        while (x != 1L) {
            if (x % 2 == 0L) {
                x /= 2

            } else {
                x *= 3
                x++
            }
            result.add(x)
        }
        return result.toLongArray()

    }

    fun longestCollatSequence(max: Long): Long {
        var result = 0L
        var longest = 0
        for (i in 4..max) {
            var j = collatzSequence(i)
            if (j.size > longest) {
                longest = j.size
                result = i
            }
        }
        return result
    }
}