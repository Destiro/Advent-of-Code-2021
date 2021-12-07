fun main() {
    fun part1(input: List<String>): Int {
        var decCount: Int = 0
        var prevLine: String = input.get(0)
        for (line in input){
            if(line > prevLine){
                decCount ++
            }
        }
        return decCount
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
