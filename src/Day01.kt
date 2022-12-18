fun main() {
    fun part1(input: List<String>): Int {
        var number = 0
        var max = -1
        for (i in input.indices) {
            if (input[i].isNotEmpty()) {
                number += input[i].toInt()
                if (i == input.size -1 && number > max) {
                    max = number
                }

            } else {
                if (number > max) max = number
                number = 0
            }
        }
        return max
    }

    fun part2(input: List<String>): Int {
        var number = 0
        val totals = mutableListOf<Int>()
        for (i in input.indices) {
            if (input[i].isNotEmpty()) {
                number += input[i].toInt()
                if (i == input.size -1) {
                    totals.add(number)
                }

            } else {
                totals.add(number)
                number = 0
            }
        }
        totals.sortDescending()
        return totals[0] + totals[1] + totals[2]
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
