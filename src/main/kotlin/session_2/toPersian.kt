package session_2

fun Int.toPersian(): String {
    var output = ""
    val input = this.toString().split("")
    for (char in input) {
        val char2: String = when (char) {
            "0" -> ("۰")
            "1" -> ("۱")
            "2" -> ("۲")
            "3" -> ("۳")
            "4" -> ("۴")
            "5" -> ("۵")
            "6" -> ("۶")
            "7" -> ("۷")
            "8" -> ("۸")
            "9" -> ("۹")
            else -> {
                (char)
            }
        }
        output += char2
    }
    return (output)
}

fun String.toPersian(): String {
    var output = ""
    val input = this.split("")
    for (char in input) {
        val char2: String = when (char) {
            "0" -> ("۰")
            "1" -> ("۱")
            "2" -> ("۲")
            "3" -> ("۳")
            "4" -> ("۴")
            "5" -> ("۵")
            "6" -> ("۶")
            "7" -> ("۷")
            "8" -> ("۸")
            "9" -> ("۹")
            else -> {
                (char)
            }
        }
        output += char2
    }
    return (output)
}