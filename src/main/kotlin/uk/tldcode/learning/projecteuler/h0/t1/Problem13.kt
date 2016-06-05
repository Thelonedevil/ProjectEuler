package uk.tldcode.learning.projecteuler.h0.t1


class Problem13 {
    fun largeSum(nums:DoubleArray):Long{
        return nums.sum().toString().substring(0,11).replace(".","").toLong()
    }
}