package uk.tldcode.learning


class Problem1 {
    fun sum(min: Int, max: Int): Int {
        var result: Int = 0
        for (j in min..max-1) {
            result += if (j % 3 == 0 || j % 5 == 0) j else 0
        }
        return result
    }
}