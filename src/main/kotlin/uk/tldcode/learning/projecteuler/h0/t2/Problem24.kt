package uk.tldcode.learning.projecteuler.h0.t2

import java.util.*

class Problem24 {
    infix fun <T: Any> T.addHeadTo(list: List<T>): List<T> {
        val copy = ArrayList(list)
        copy.add(0, this)
        return copy
    }
    fun <T : Any> List<T>.permutations() : Sequence<List<T>> = if (size == 1) sequenceOf(this) else {
        val iterator = iterator()
        var head = iterator.next()
        var permutations = (this - head).permutations().iterator()

        fun nextPermutation(): List<T>? = if (permutations.hasNext()) head addHeadTo permutations.next() else {
            if (iterator.hasNext()) {
                head = iterator.next()
                permutations = (this - head).permutations().iterator()
                nextPermutation()
            } else null
        }

        generateSequence { nextPermutation() }
    }

    fun lexographicPermutations(n: Int): Long {
        return listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9").permutations().elementAt(n - 1).joinToString("").toLong()
    }
}