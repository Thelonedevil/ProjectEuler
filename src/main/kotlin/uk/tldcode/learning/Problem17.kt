package uk.tldcode.learning

import java.util.*


class Problem17 {
    val map = HashMap<String, String>(9)

    init {
        map.put("1", "one")
        map.put("2", "two")
        map.put("3", "three")
        map.put("4", "four")
        map.put("5", "five")
        map.put("6", "six")
        map.put("7", "seven")
        map.put("8", "eight")
        map.put("9", "nine")
        map.put("10", "ten")
        map.put("11", "eleven")
        map.put("12", "twelve")
        map.put("13", "thirteen")
        map.put("14", "fourteen")
        map.put("15", "fifteen")
        map.put("16", "sixteen")
        map.put("17", "seventeen")
        map.put("18", "eighteen")
        map.put("19", "nineteen")
        map.put("20", "twenty")
        map.put("30", "thirty")
        map.put("40", "forty")
        map.put("50", "fifty")
        map.put("60", "sixty")
        map.put("70", "seventy")
        map.put("80", "eighty")
        map.put("90", "ninety")
    }

    fun Int.toWords(): String {
        if (this.toString().length == 1) {
            return map[this.toString()].orEmpty()
        } else if (this.toString().length == 2) {
            return twostr(this)
        } else if (this.toString().length == 3) {
            return threestr(this)
        } else if (this.toString().length == 4) {
            return fourstr(this)
        }

        return this.toString()
    }

    fun fourstr(num: Int): String {
        if (num.toString().substring(1).toInt() > 0) {
            return map[num.toString().substring(0, 1)] + " thousand " + threestr(num.toString().substring(1).toInt())
        } else {
            return map[num.toString().substring(0, 1)] + " thousand"
        }
    }

    fun threestr(num: Int): String {
        if (num.toString().substring(1).toInt() > 0) {
            return map[num.toString().substring(0, 1)].orEmpty() + " hundred and " + twostr(num.toString().substring(1).toInt())
        } else {
            return map[num.toString().substring(0, 1)].orEmpty() + " hundred"
        }
    }

    fun twostr(num: Int): String {
        if (num < 10) {
            return map[num.toString()].orEmpty()
        } else if (num > 10 && num < 20) {
            return map[num.toString()].orEmpty()
        } else if (num.toString().substring(1).toInt() > 0) {
            return map[num.toString().substring(0, 1) + "0"].orEmpty() + "-" + map[num.toString().substring(1)].orEmpty()
        } else {
            return map[num.toString().substring(0, 1) + "0"].orEmpty()
        }
    }

    fun letterCounts(max: Int): Int {
        var result = 0
        for (num in 1..max) {
            result += num.toWords().asSequence().count { !(it.equals(' ') || it.equals('-')) }
        }
        return result
    }
}