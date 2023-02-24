fun main() {

    val weight = 132.27

    val height = 66.0

    val bmi = (weight * 703) / (height * height)

    if (bmi < 18.5) {
        println("You are underweight.")
    } else if (bmi > 25) {
        println("You are overweight.")
    } else {
        println("You have optimal weight")

        }

}
