package uk.tldcode.learning.projecteuler.h0.t2


class Problem22 {

    fun scoreNames(names: Array<String>): Long {
        var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        names.sort()
        return names.map { it.asSequence().map { alphabet.indexOf(it) + 1 }.sum()}.mapIndexed { i, j -> (i+1) * j.toLong() }.sum()
    }
}