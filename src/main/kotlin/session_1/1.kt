package session_1

fun main() {
    val numbers = listOf(4, 7, 6, 3, 2)
    //val number2 = arrayOf(4,7,6,3,2)
    val find = 7
    /*println("1- section1.sum: "+section1.sum(numbers))
    println("2- section1.biggest: "+section1.biggest(numbers))
    println("3- index of $find: "+section1.finder(numbers,find))
    println("4- is it section1.odd? "+section1.isOdd(7))
    println("5- section1.odd number "+section1.odd(numbers))

     */
    println("1- section1.sum: " + sum2(numbers))
    println("2- section1.biggest: " + big2(numbers))
    println("3- index of $find: " + finder2(numbers, find))
    println("4- is it section1.odd? " + isOdd2(find))
    println("5- section1.odd number " + odd2(numbers))

}

fun sum(input: List<Int>): Int {
    var sum = 0
    for (number in input) sum += number
    return (sum)
}

fun sum2(input: List<Int>): Int {
    return input.sum()
}

fun biggest(input: List<Int>): Int {
    var biggest = 0
    for (number in input) {
        if (number > biggest) biggest = number
    }
    return (biggest)
}

fun big2(input: List<Int>): Int? {
    return input.maxOrNull()
}


fun isOdd(input: Int): Boolean {
    if (input % 2 == 0)
        return (true)
    return (false)
}

fun isOdd2(input: Int): Boolean {
    return input % 2 == 0
}

fun odd(input: List<Int>): List<Int> {
    val odd = mutableListOf<Int>()
    for (number in input) {
        if (number % 2 == 0)
            odd.add(number)
    }
    return odd
}

fun odd2(input: List<Int>): List<Int> {
    return input.filter { it % 2 == 0 }
}

fun finder(input: List<Int>, locate: Int): Int {
    for ((index, number) in input.withIndex()) {
        if (number == locate) return index
    }

    return (-1)
}

fun finder2(input: List<Int>, number: Int): Int {
    return input.indexOf(number)
}

