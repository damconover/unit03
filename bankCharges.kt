fun main(args: Array<String>) {

        val baseFee = 10.0
        var checkFee = 0.0

        print("Enter the number of checks written this month: ")
        val numChecks = readLine()?.toInt() ?: 0

        if (numChecks < 20) {
            checkFee = numChecks * 0.1
        } else if (numChecks in 20..39) {
            checkFee = numChecks * 0.08
        } else if (numChecks in 40..59) {
            checkFee = numChecks * 0.06
        } else if (numChecks >= 60) {
            checkFee = numChecks * 0.04
        }
        val totalFee = baseFee + checkFee

        println("The bank's service fees for the month are: \$$totalFee")
    }
