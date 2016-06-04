package uk.tldcode.learning.projecteuler.h0.t1


class Problem11 {

    fun largestProductGrid(grid: Array<IntArray>): Long {
        var result = 0L
        for (x in 0..grid.size - 1) {
            for (y in 0..grid[x].size - 1) {
                var r = getRight(grid, x, y)
                if (r > result) {
                    result = r
                }
                var d = getDown(grid, x, y)
                if (d > result) {
                    result = d
                }
                var diagDown = getDiagDown(grid, x, y)
                if (diagDown > result) {
                    result = diagDown
                }
                var diagUp = getDiagUp(grid, x, y)
                if (diagUp > result) {
                    result = diagUp
                }
            }
        }
        return result
    }

    fun getRight(grid: Array<IntArray>, x: Int, y: Int): Long {
        if (x + 3 > grid.size - 1) {
            return 0L
        }
        var result = 1L
        for (i in 0..3) {
            result *= grid[x + i][y]
        }
        return result
    }

    fun getDown(grid: Array<IntArray>, x: Int, y: Int): Long {
        if (y + 3 > grid[x].size - 1) {
            return 0L
        }
        var result = 1L
        for (i in 0..3) {
            result *= grid[x][y + i]
        }
        return result
    }

    fun getDiagDown(grid: Array<IntArray>, x: Int, y: Int): Long {
        if (x + 3 > grid.size - 1 || y + 3 > grid[x].size - 1) {
            return 0L
        }
        var result = 1L
        for (i in 0..3) {
            result *= grid[x + i][y + i]
        }
        return result
    }

    fun getDiagUp(grid: Array<IntArray>, x: Int, y: Int): Long {
        if (x + 3 > grid.size - 1 || y - 3 < 0) {
            return 0L
        }
        var result = 1L
        for (i in 0..3) {
            result *= grid[x + i][y - i]
        }
        return result
    }
}