object Q1 {
  def encrypt(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val shifted = (char - base + shift) % 26 // Calculates the new position of the character after applying the shift
        (base + shifted).toChar
      } else {
        char
      }
    }.mkString // Joins the transformed characters back into a single string
  }

  def decrypt(encryptedText: String, shift: Int): String = {
    encrypt(encryptedText, -shift)
  }

  def process(text: String, shift: Int, mode: String): String = {
    mode.toLowerCase match {
      case "encrypt" => encrypt(text, shift)
      case "decrypt" => decrypt(text, shift)
      case _ => throw new IllegalArgumentException("Mode must be either 'encrypt' or 'decrypt'")
    }
  }

  def main(args: Array[String]): Unit = {
    val plainText = "Scala"
    val shift = 3
    
    // Encrypt
    val encryptedText = process(plainText, shift, "encrypt")
    println(s"Encrypted: $encryptedText")
    
    // Decrypt
    val decryptedText = process(encryptedText, shift, "decrypt")
    println(s"Decrypted: $decryptedText")

    // Invalid mode handling
    try {
      val invalidText = process(encryptedText, shift, "Decry")
      println(s"Decrypted: $invalidText")
    } catch {
      case e: IllegalArgumentException => println(e.getMessage)
    }
  }
}
