import scala.io.StdIn

object Q2 {
  def main(args: Array[String]): Unit = {
    val input = {
      if (args.length == 1) {
        args(0)
      } else {
        println("Please enter an integer:")
        StdIn.readLine()
      }
    }

    // Convert the input to an integer using try-catch to handle invalid inputs
    try {
      val number = input.trim.toInt
      // Lambda functions for checking multiples
      val isMultipleOfThree: Int => Boolean = _ % 3 == 0
      val isMultipleOfFive: Int => Boolean = _ % 5 == 0

      // Pattern matching to categorize the number
      val message = (number: Int) match {
        case _ if isMultipleOfThree(number) && isMultipleOfFive(number) => "Multiple of Both Three and Five"
        case _ if isMultipleOfThree(number) => "Multiple of Three"
        case _ if isMultipleOfFive(number) => "Multiple of Five"
        case _ => "Not a Multiple of Three or Five"
      }

      println(message)

    } catch {
      case e: NumberFormatException =>
        println("Invalid input. Please provide a valid integer.")
    }
  }
}
