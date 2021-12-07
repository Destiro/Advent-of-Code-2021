fun main() {
    fun part1(input: List<String>): Int {
        var incCount: Int = 0
        var prevLine: Int = input.get(0).toInt()
        for (line in input){
            if(line.toInt() > prevLine){
                incCount ++
            }
            prevLine = line.toInt()
        }
        return incCount
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    //val testInput = readInput("Day01_test")
    //check(part1(testInput) == 1)

    val input = readInput("data/input")
    println(part1(input))
    println(part2(input))
}
