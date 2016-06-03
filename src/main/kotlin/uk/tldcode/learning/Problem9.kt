package uk.tldcode.learning


class Problem9 {

    fun specialPythagoreanTriplet(target: Double): Int {
        var a = 0
        var b = 0
        var c = fun(): Double {
            return Math.sqrt(((a * a) + (b * b)).toDouble())
        }
        while (a < target) {
            a++
            b=0
            while (b < target) {
                b++
                if(a+b+c() == target){
                    return (a * b * c()).toInt()
                }
            }

        }
        return (a * b * c()).toInt()


    }
}