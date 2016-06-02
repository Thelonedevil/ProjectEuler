package uk.tldcode.learning

class Problem5 {

    fun smallestMultiple(min: Int, max: Int): Long {
        var i = 0L
        while (i <= Long.MAX_VALUE) {
            i++
            var result = true;
            for (j in min..max) {
                result = result && i % j == 0L
            }
            if (result) {
                return i
            }
        }
        return 0
    }
}