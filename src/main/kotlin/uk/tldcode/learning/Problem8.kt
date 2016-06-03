package uk.tldcode.learning


class Problem8 {

    fun largestProductInSeries(series: String): Long {
        var result = 0L
        for (i in 0..(999-12)) {
            var j = series.subSequence(i..(i + 12))
            var k = 1L
            j.forEach { k *= it.toString().toInt() }
            if(k>result){
                result=k
            }
        }
        return result
    }
}