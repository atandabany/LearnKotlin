
fun main() {
    println(solution(mutableListOf("A", "B", "C", "D", "A")))
}

fun solution(strings: MutableList<String>): Set<String> {
    return strings.toSet()
}