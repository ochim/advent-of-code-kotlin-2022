fun main() {
    fun part1(input: List<String>): Int {
        var score = 0
        input.forEach {
            val (opponent, you) = it.split(" ")
            when (opponent) {
                "A" -> {
                    when (you) {
                        "X" -> { score += 1 + 3 }
                        "Y" -> { score += 2 + 6 }
                        "Z" -> { score += 3 }
                    }
                }
                "B" -> {
                    when (you) {
                        "X" -> { score += 1 }
                        "Y" -> { score += 2 + 3 }
                        "Z" -> { score += 3 + 6 }
                    }
                }
                "C" -> {
                    when (you) {
                        "X" -> { score += 1 + 6 }
                        "Y" -> { score += 2 }
                        "Z" -> { score += 3 + 3 }
                    }
                }
            }
        }
        return score
    }

    fun part2(input: List<String>): Int {
        var score = 0
        input.forEach {
            val (opponent, you) = it.split(" ")
            when (opponent) {
                "A" -> {
                    when (you) {
                        "X" -> { score += 3 }
                        "Y" -> { score += 1 + 3 }
                        "Z" -> { score += 2 + 6 }
                    }
                }
                "B" -> {
                    when (you) {
                        "X" -> { score += 1 }
                        "Y" -> { score += 2 + 3 }
                        "Z" -> { score += 3 + 6 }
                    }
                }
                "C" -> {
                    when (you) {
                        "X" -> { score += 2 }
                        "Y" -> { score += 3 + 3 }
                        "Z" -> { score += 1 + 6 }
                    }
                }
            }
        }
        return score
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 15)
    check(part2(testInput) == 12)

    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}
