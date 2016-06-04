package uk.tldcode.learning.projecteuler.h0.t0

import java.util.*


class Problem7 {

    fun getNthPrime(n:Int):Int{
        val arr = ArrayList<Int>();
        arr.add(2);
        arr.add(3);
        var i = 4;
        while(arr.size < n) {
            if(i % 2 != 0 && i%3 != 0) {
                var j = 4;
                while(j*j <= i) {
                    if(i % j == 0)
                        break;
                    j ++;
                }
                if(j*j > i) {
                    arr.add(i);
                }
            }
            i++;
        }
        return arr[n-1]
    }
}