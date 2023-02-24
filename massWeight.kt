fun main() {
    println("Enter the mass of the object in kilograms")
    val mass = 5.0
    
    val weight = mass!! * 9.8
    
    if (weight > 1000) {
        println("This object is too heavy.")
    } 
    else if (weight < 10) {
        println("This object is too light.")
    } 
    else {
        println("The object weighs $weight Newtons.")
    }
}
