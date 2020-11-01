fun main () {
    val numbers = listOf(4,7,6,3,2)
    val find = 6
    println("1- sum: "+sum(numbers))
    println("2- biggest: "+biggest(numbers))
    println("3- index of $find: "+finder(numbers,find))
    println("4- is it odd? "+isOdd(7))
    println("5- odd number "+odd(numbers))
}

fun sum(input: List<Int>):Int{
    var sum=0
    for (number in input) sum+=number
    return (sum)
}

fun biggest(input: List<Int>):Int{
    var biggest=0
    for (number in input){
        if (number> biggest) biggest=number
    }
    return (biggest)
}

fun isOdd(input: Int):Boolean{
    if (input%2==0)
        return (true)
return (false)
}

fun odd(input: List<Int>):List<Int>{
    var odd = mutableListOf<Int>()
    for (number in input){
        if (number%2==0)
            odd.add(number)
    }
    return odd
}

fun finder(input: List<Int>, locate: Int): Int{
    for ((index, number) in input.withIndex()){
        if (number== locate) return index
    }

return (-1)
}

