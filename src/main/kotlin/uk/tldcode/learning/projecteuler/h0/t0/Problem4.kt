package uk.tldcode.learning.projecteuler.h0.t0


class Problem4 {

    fun largestPalindromeProduct():Long{
        var largest = 0L
        for(i in 999 downTo 0){
            for(j in 999 downTo 0){
                var k = i*j
                if(k.toString().reversed().equals(k.toString())){
                    if(k>largest){
                        largest = k.toLong()
                    }
                }
            }
        }
        return largest
    }
}