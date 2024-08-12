
object caesar{
    def main(args:Array[String]): Unit = {
        var encrpt_str = ""
        def encryption(word:String,n:Int):String =n match {
                case n if n >=word.length => encrpt_str
                case _ => encrpt_str += (word(n)+1).toChar;
                        encryption(word,n+1); 
                       
        }

        var decrpt_str = ""
        def decryption(word2:String,n:Int):String =n match {
                case n if n >=word2.length => decrpt_str
                case _ =>decrpt_str += (word2(n)-1).toChar;
                            decryption(word2,n+1); 
                       
        }

    

        val word1 = "ABCD    Nimal"
        val encrpted_str = encryption(word1,0)


        println(s"The encrypted word is :$encrpted_str")


        val decrpted_str = decryption(encrpted_str,0)
        println(s"The decrypted word is :$decrpted_str");
        

    }
}