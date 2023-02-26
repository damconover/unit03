fun main(args: Array<String>) {
    val times: MutableList<Double> = mutableListOf()
    val names: MutableList<String> = mutableListOf()
    println("Please enter three names and the amount of time it took them to finish the race in minutes: ")
    for (i in 0..2) {
        print("Name: ")
        names.add(i, readLine()!!)
        print("Time in Minutes: ")
        times.add(i, readLine()!!.toDouble())
    }
    times.sort()
}
