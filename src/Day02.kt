fun main() {
    val baseScores = mapOf(
        'X' to 1, //Rock
        'Y' to 2, //Paper
        'Z' to 3  //Scissors
    )

    val roundScores = mapOf(
        "A X" to 3,
        "A Y" to 6,
        "A Z" to 0,
        "B X" to 0,
        "B Y" to 3,
        "B Z" to 6,
        "C X" to 6,
        "C Y" to 0,
        "C Z" to 3,
    )

    fun part1(input: List<String>): Int {
        return input.sumOf { str ->
            val me = str[2]
            baseScores[me]!! + roundScores[str]!!
        }
    }

    fun part2(input: List<String>): Int {
        return input.sumOf { str ->
            val op = str[0]

            val roundScore: Int = when (str[2]) {
                'X' -> 0
                'Y' -> 3
                'Z' -> 6
                else -> throw IllegalArgumentException()
            }

            val item = roundScores.firstNotNullOf { (key, value) -> if (key[0] == op && value == roundScore) key else null }
            roundScore + baseScores[item[2]]!!
        }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 15)
    check(part2(testInput) == 12)

    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}
