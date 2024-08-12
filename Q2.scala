import scala.io.StdIn.{readLine,readInt}

object multiple_numbers{
    def main(args:Array[String]):Unit={
        
        val multiples_find : Int => Unit = (num =>{
            if (num % 3 == 0) {
                if(num % 5 == 0) {
                    println("Multiple of Both Three and Five.")
                } else {
                    println("Multiple of Three.")
                }
            }else {
                if(num % 5 == 0) {
                    println("Multiple of Five.")
                }else{
                    println("Not a Multiple of Three or Five")
                }
            }

    })

        print("Enter the number to find Multiples: ")
        val num_input = readInt()
        multiples_find(num_input)
}
}