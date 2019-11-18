
fun doNothingVeryFast() {
    for (i in 0..10) {
        val a = i*i
        val b = a + a
        val c = a * i / b
        val d = a - b - c
    }
}