package session_2

fun main() {
    //val customer1 = customer("SHahab", "Hashemi", 10)
    //val customer2 = customer("mamad", "khordadaina")
    //customer1.info()
    //customer2.info()
    val date = "2020-11-12"
    val data2 = 1234567890
    //println(date.getMonth())
    println(data2.toPersian())
    println(date.toPersian())


}


class customer {
    val name: String
    val lastname: String
    var age: Int = 0


    constructor(name: String, lastname: String) {
        this.name = name
        this.lastname = lastname
    }


    constructor(name: String, lastname: String, age: Int) {
        this.name = name
        this.lastname = lastname
        this.age = age
    }

    fun totoalpayment() {
        println("to many")
    }

    fun info() {
        println("First name: $name")
        println("Last name: $lastname")
        if (age > 0) println("age : $age")

    }
}

fun String.getMonth(): String {
    val input = this.split("-")
    return input[1]

}



