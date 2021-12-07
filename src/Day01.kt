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
        var pointer: Int = 0
        var prevSum: Int = 0
        var incCount: Int = 0

        while(pointer < input.size-3)
        {
            var currSum: Int = input[pointer].toInt() + input[pointer+1].toInt() + input[pointer+2].toInt()
            if(currSum > prevSum){
                incCount++
            }

            prevSum = currSum
            pointer++
        }

        return incCount
    }

    // test if implementation meets criteria from the description, like:
    //val testInput = readInput("Day01_test")
    //check(part1(testInput) == 1)

    val input = readInput("data/input")
    println(part1(input))
    println(part2(input))
}
