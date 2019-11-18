
fun doNothingVeryFastie() {
    for (i in 0..5) {
        val a = i*i
        val b = a + a
        val c = a * i * b
        val d = a - b - c
    }
}