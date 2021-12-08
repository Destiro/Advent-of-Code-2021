fun main() {
    fun part1(input: List<String>): Int {
        var depth: Int = 0
        var horizPos: Int = 0

        for (line in input){
            var stuff = line.split(" ")

            when(stuff[0]){
                "forward" -> horizPos += stuff[1].toInt()
                "up" -> depth -= stuff[1].toInt()
                "down" -> depth += stuff[1].toInt()
            }
        }

        return depth * horizPos
    }

    fun part2(input: List<String>): Int {
        var depth: Int = 0
        var horizPos: Int = 0
        var aim: Int = 0

        for (line in input){
            var stuff = line.split(" ")

            when(stuff[0]){
                "forward" -> {
                    horizPos += stuff[1].toInt()
                    depth += aim*stuff[1].toInt()
                }
                "up" -> aim -= stuff[1].toInt()
                "down" -> aim += stuff[1].toInt()
            }
        }

        return depth * horizPos
    }

    val input = readInput("data/input2")
    println(part1(input))
    println(part2(input))
}