fun main() {
    print("Please enter the first name:")
    val firstName = readLine()!!
    print("Please enter the second name:")
    val secondName = readLine()!!
    print("Please enter the third name:")
    val thirdName = readLine()!!
    val namesList = listOf(firstName, secondName, thirdName)
    println("The names sorted in ascending order are:")
    namesList.sorted().forEach { println(it) }
}
