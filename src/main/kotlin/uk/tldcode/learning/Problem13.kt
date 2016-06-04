package uk.tldcode.learning


class Problem13 {
    fun largeSum(nums:DoubleArray):String{
        return nums.sum().toString().substring(0,11).replace(".","")
    }
}