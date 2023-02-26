fun main(args: Array<String>) {

        val joes = "Joe's Gourmet Burgers"
        val pizza = "Main Street Pizza Company"
        val cafe = "Corner Cafe"
        val italian = "Mama's Fine Italian"
        val chefs = "The Chef's Kitchen"

        println("Is anyone in your party a vegetarian? ")
        val isVegetarian = readLine()?.equals("yes", true) ?: false

        println("Is anyone in your party a vegan? ")
        val isVegan = readLine()?.equals("yes", true) ?: false

        println("Is anyone in your party gluten-free? ")
        val isGlutenFree = readLine()?.equals("yes", true) ?: false

        println("\nHere are your restaurant choices:")

        if (!isVegetarian && !isVegan && !isGlutenFree) {
            println("$joes\n$pizza\n$cafe\n$italian\n$chefs")
        } else if (!isVegetarian && !isVegan && isGlutenFree) {
            println("$pizza\n$cafe\n$chefs")
        } else if (!isVegetarian && isVegan && !isGlutenFree) {
            println("$cafe\n$chefs")
        } else if (!isVegetarian && isVegan && isGlutenFree) {
            println("$cafe\n$chefs")
        } else if (isVegetarian && !isVegan && !isGlutenFree) {
            println("$pizza\n$cafe\n$italian\n$chefs")
        } else if (isVegetarian && !isVegan && isGlutenFree) {
            println("$pizza\n$cafe\n$chefs")
        } else if (isVegetarian && isVegan && !isGlutenFree) {
            println("$cafe\n$chefs")
        } else if (isVegetarian && isVegan && isGlutenFree) {
            println("$cafe\n$chefs")
        }
    }
