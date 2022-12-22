fun main() {
    fun getScore(c: Char) = if (c.isLowerCase()) {
        c.code - 'a'.code + 1
    } else {
        c.code - 'A'.code + 27
    }

    fun part1(input: List<String>): Int {
        return input.sumOf { line ->
            val comp1 = line.substring(0, line.length / 2)
            val comp2 = line.substring(line.length / 2)
            getScore(comp1.first { it in comp2 })
        }
    }

    fun part2(input: List<String>): Int {
        val groups = input.chunked(3)
        return groups.sumOf { (a, b, c) ->
            getScore(a.first { it in b && it in c })
        }
    }

    val testInput = readInput("Day03_test")
    check(part1(testInput) == 157)
    check(part2(testInput) == 70)

    val input = readInput("Day03")
    part1(input).println()
    part2(input).println()
}
