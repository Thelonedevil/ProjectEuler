package uk.tldcode.learning.projecteuler.h0.t0


class Problem9 {

    fun specialPythagoreanTriplet(target: Double): Long {
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
                    return (a * b * c()).toLong()
                }
            }

        }
        return (a * b * c()).toLong()


    }
}