package uk.tldcode.learning.projecteuler.h0.t1

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month

class Problem19 {

    fun countDay(startYear: Int, endYear: Int): Long {
        var start = LocalDate.of(startYear, Month.JANUARY, 1).toEpochDay()
        var end = LocalDate.of(endYear, Month.DECEMBER, 31).toEpochDay()
        return (start..end).count { LocalDate.ofEpochDay(it).dayOfWeek == DayOfWeek.SUNDAY && LocalDate.ofEpochDay(it).dayOfMonth == 1 }.toLong()
    }

}