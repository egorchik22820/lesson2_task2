fun main() {
    val input = readln()
    var result = ""
    var count = 0

    result += input[0]

    for (i in 1 until input.length) {

        if (input[i] !in result) {
            result += input[i]
        }
    }

    var newRes = ""

    for (lat in result) {
        for (i in 0 until input.length) {
            if (lat in input) {
                count = input.count {it == lat}

            }
        }
        newRes += lat + " - " + count + "\n"
    }

    print(newRes)


}