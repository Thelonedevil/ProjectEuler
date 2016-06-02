package uk.tldcode.learning


class Problem4 {

    fun largestPalindromeProduct():Int{
        var largest = 0
        for(i in 999 downTo 0){
            for(j in 999 downTo 0){
                var k = i*j
                if(k.toString().reversed().equals(k.toString())){
                    if(k>largest){
                        largest = k
                    }
                }
            }
        }
        return largest
    }
}