fun main() {
    var a = arrayOf(1,1,17,1,5)
    for (i in 0..a.size -2) {
        if (a[i] < a[i + 1])
            println("${a[i]} < ${a[i + 1]}")
        else
            println("${a[i]} >= ${a[i + 1]}")
    }
}


