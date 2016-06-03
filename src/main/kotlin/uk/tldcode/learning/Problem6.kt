package uk.tldcode.learning


class Problem6 {

    fun sumSquareDiff(max: Int): Int {
        var sum = 0
        var square = 0
        for (i in 1..max) {
            sum += i * i
            square += i
        }
        square *= square
        return square - sum
    }
}