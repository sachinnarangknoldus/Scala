package com.knoldus

class Cliparser extends App {
  def driver_Func(flagString: List[String]): Unit = {
    var name = ""
    var ch = '$'
    for (i <- 0 until flagString.length) {
      val flag = flagString(i)
      if (flag(0) != '-') name = flag else if (flag(0) == '-' && flag.length == 2) ch = check_Flag(flag) else if (flag == "--help") {
        val mapIm = help_Flag;
        for ((k, v) <- mapIm) println(s"$k this flags return this ->  $v")
      }
    }
    if(ch!='^') {
      for (output <- name) {
        output match {
          case 'a' | 'A' => a(ch)
          case 'b' | 'B' => b(ch)
          case 'c' | 'C' => c(ch)
          case 'd' | 'D' => d(ch)
          case 'e' | 'E' => e(ch)
          case 'f' | 'F' => f(ch)
          case 'g' | 'G' => g(ch)
          case 'h' | 'H' => h(ch)
          case 'i' | 'I' => i(ch)
          case 'j' | 'J' => j(ch)
          case 'k' | 'K' => k(ch)
          case 'l' | 'L' => l(ch)
          case 'm' | 'M' => m(ch)
          case 'n' | 'N' => n(ch)
          case 'o' | 'O' => o(ch)
          case 'p' | 'P' => p(ch)
          case 'q' | 'Q' => q(ch)
          case 'r' | 'R' => r(ch)
          case 's' | 'S' => s(ch)
          case 't' | 'T' => t(ch)
          case 'u' | 'U' => u(ch)
          case 'v' | 'V' => v(ch)
          case 'w' | 'W' => w(ch)
          case 'x' | 'X' => x(ch)
          case 'y' | 'Y' => y(ch)
          case 'z' | 'Z' => z(ch)
          // catch the default with a variable so you can print it
          case _ => println("Invalid Character")
        }
      }
    }
    else print("Terminated Due to wrong flag")
  }

  def help_Flag: Map[String, String] = {
    val ImMap = Map("-a" -> "This flag returns @", "-s" -> "This flag returns $", ("-i", "This flag returns !"), ("-k", "This flag returns *"))
    ImMap
  }

  def check_Flag(flag: String): Char = {
    val mapIm = Map("-a" -> '@', "-s" -> '$', "-i" -> '!', "-k" -> '*')

    try {
      mapIm(flag)
    }catch{
      case i:NoSuchElementException =>{println("Exception: No Such flag Exists");'^'}
      case _=>{println("Exception Caught");'^'}
    }
  }


  def a(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (a <- 0 until 8) {
        if (i == 0 && (a == 0 || a == 7)) printf(" ")
        else if (a < 2 || a > 5) printf("%c", ch)
        else if (i < 2 || (i > 3 && i < 5)) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  def b(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 9) {
      printf(" %c%c", ch, ch)
      for (r <- 0 until 6) {
        if (i == 0 && r < 5) printf("%c", ch)
        else if (i == 1) printf("%c", ch)
        else if (i < 4 && i > 0 && r > 3) printf("%c", ch)
        else if (i == 4 && r < 5) printf("%c", ch)
        else if (i > 4 && i < 7 && r > 3) printf("%c", ch)
        else if (i == 7) printf("%c", ch)
        else if (i == 8 && r < 5) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }


  def c(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (o <- 0 until 8) {
        if (i == 0 && (o <= 1)) printf(" ")
        else if (i == 1 && (o == 0 || o == 8 - i || (o > 1))) printf(" ")
        else if (i == 2 && (o == 1 || o == 8 - i || (o > 1))) printf(" ")
        else if ((i == 3 || i == 4 || i == 5) && (o > 0)) printf(" ")
        else if (i == 6 && (o == 0 || o == 8 + 5 - i || (o > 1))) printf(" ")
        else if (i == 7 && (o <= 1)) printf(" ")
        else printf("%c", ch)
      }
      printf("\n")
    }
  }

  def d(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" %c", ch)

      for (o <- 0 until 8) {
        if (i == 0 && (o >= 6 - i)) printf(" ")
        else if (i == 1 && (o == 0 || o == 8 - i || (o < 6))) printf(" ")
        else if (i == 2 && (o == 1 || o == 8 - i || (o < 6))) printf(" ")
        else if ((i == 3 || i == 4 || i == 5) && (o < 7)) printf(" ")
        else if (i == 6 && (o == 0 || o == 8 + 5 - i || (o < 6))) printf(" ")
        else if (i == 7 && (o >= 6 - i + 7)) printf(" ")
        else printf("%c", ch)
      }
      printf("\n")
    }
  }

  def e(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (j <- 0 until 7) {
        if (i == 0) printf("%c", ch)
        else if (i > 0 && i < 3 && j < 2) printf("%c", ch)
        else if (i == 3 && j < 6) printf("%c", ch)
        else if (i > 3 && i < 6 && j < 2) printf("%c", ch)
        else if (i == 6) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  def f(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (j <- 0 until 7) {
        if (i == 0) printf("%c", ch)
        else if (i > 0 && i < 3 && j < 2) printf("%c", ch)
        else if (i == 3 && j < 6) printf("%c", ch)
        else if (i > 3 && i < 7 && j < 2) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }


  def g(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (o <- 0 until 8) {
        if (i == 4 && o > 3 || (o == 4 || o == 7) && i > 4) printf("%c", ch)
        else if (i == 0 && (o <= 1)) printf(" ")
        else if (i == 1 && (o == 0 || o == 8 - i || (o > 1))) printf(" ")
        else if (i == 2 && (o == 1 || o == 8 - i || (o > 1))) printf(" ")
        else if ((i == 3 || i == 4 || i == 5) && (o > 0)) printf(" ")
        else if (i == 6 && (o == 0 || (o > 1))) printf(" ")
        else if (i == 7 && (o <= 1 || o == 5 || o == 6)) printf(" ")
        else printf("%c", ch)
      }
      printf("\n")
    }
  }

  def h(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (h <- 0 until 8) {
        if (h < 2 || h > 5) printf("%c", ch)
        else if (i > 2 && i < 5) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter I
  def i(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (t <- 0 until 8) {
        if ((i < 1 || i > 6) && t < 8) printf("%c", ch)
        else if (i > 0 && t < 3) printf(" ")
        else if (i > 0 && t > 2 && t < 5) printf("%c", ch)
        else if (i > 0 && t > 4) printf(" ")
        else {
        }
      }
      printf("\n")
    }
  }

  // Function to print the letter J
  def j(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (h <- 0 until 8) {
        if (i < 1) printf("%c", ch)
        else if (i == 5 && h < 1) printf("%c", ch)
        else if (i < 7 && h > 5) printf("%c", ch)
        else if (i == 7 && (h == 0 || h == 7)) printf(" ")
        else if (i > 5) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter K
  def k(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (k1 <- 0 until 7) {
        if (k1 < 2) printf("%c", ch)
        else if ((k1 >= 5 - i) && (k1 <= 6 - i)) printf("%c", ch)
        else if (i >= 4) if (k1 == i - 2 || k1 == i - 1) printf("%c", ch)
        else printf(" ")
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter L
  def l(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      printf("%c%c", ch, ch)

      if (i == 6) {
        printf("%c%c", ch, ch)

        printf("%c%c", ch, ch)

        printf("%c%c", ch, ch)
      }
      if (i == 7) {
        printf("%c%c", ch, ch)

        printf("%c%c", ch, ch)

        printf("%c%c", ch, ch)
      }
      printf("\n")
    }
  }

  // Function to print the letter M
  def m(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (j <- 0 until 8) {
        if (j == 0 || j == 7) printf("%c", ch)
        else if (i < 4 && (j == 7 - i || j == i)) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter N
  def n(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (n <- 0 until 8) {
        if (n < 2 || n > 5) printf("%c", ch)
        else if (i == n - 1 || i == n + 1 || i == n) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter O
  def o(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (o <- 0 until 8) {
        if (i == 0 && (o <= 1 || o >= 6 - i)) printf(" ")
        else if (i == 1 && (o == 0 || o == 8 - i || (o < 6 && o > 1))) printf(" ")
        else if (i == 2 && (o == 1 || o == 8 - i || (o < 6 && o > 1))) printf(" ")
        else if ((i == 3 || i == 4 || i == 5) && (o > 0 && o < 7)) printf(" ")
        else if (i == 6 && (o == 0 || o == 8 + 5 - i || (o < 6 && o > 1))) printf(" ")
        else if (i == 7 && (o <= 1 || o >= 6 - i + 7)) printf(" ")
        else printf("%c", ch)
      }
      printf("\n")
    }
  }

  // Function to print the letter P
  def p(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      printf("%c%c", ch, ch)

      for (r <- 0 until 6) {
        if (i == 0 && r < 5) printf("%c", ch)
        else if (i == 1) printf("%c", ch)
        else if (i < 4 && i > 0 && r > 3) printf("%c", ch)
        else if (i == 4 && r < 5) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter Q
  def q(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (o <- 0 until 8) {
        if (o == i) printf("%c", ch)
        else if (i == 0 && (o <= 1 || o >= 6 - i)) printf(" ")
        else if (i == 1 && (o == 0 || o == 8 - i || (o < 6 && o > 1))) printf(" ")
        else if (i == 2 && (o == 1 || o == 8 - i || (o < 6 && o > 1))) printf(" ")
        else if ((i == 3 || i == 4 || i == 5) && (o > 0 && o < 7)) printf(" ")
        else if (i == 6 && (o == 0 || o == 8 + 5 - i || (o < 6 && o > 1))) printf(" ")
        else if (i == 7 && (o <= 1 || o >= 6 - i + 7)) printf(" ")
        else printf("%c", ch)
      }
      printf("\n")
    }
  }

  // Function to print the letter R
  def r(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      printf("%c%c", ch, ch)

      for (r <- 0 until 6) {
        if (i == 0 && r < 5) printf("%c", ch)
        else if (i == 1) printf("%c", ch)
        else if (i < 4 && i > 0 && r > 3) printf("%c", ch)
        else if (i >= 4) if (i == 4 && (r == 3 || r == 4)) printf("%c", ch)
        else if (r == i - 2 || r == i - 3) printf("%c", ch)
        else printf(" ")
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter S
  def s(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (j <- 0 until 7) {
        if (i == 0 && j > 0) printf("%c", ch)
        else if (i > 0 && i < 3 && j < 2) printf("%c", ch)
        else if (i == 3 && j > 0 && j < 6) printf("%c", ch)
        else if (i > 3 && i < 6 && j > 4) printf("%c", ch)
        else if (i == 6 && j < 6) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter T
  def t(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (t <- 0 until 8) {
        if (i < 2 && t < 8) printf("%c", ch)
        if (i > 1 && t < 3) printf(" ")
        if (i > 1 && t > 2 && t < 5) printf("%c", ch)
        if (i > 1 && t > 4) printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter U
  def u(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (h <- 0 until 8) {
        if (i < 7 && (h < 2 || h > 5)) printf("%c", ch)
        else if (i == 7 && (h == 0 || h == 7)) printf(" ")
        else if (i > 5) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter V
  def v(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (v <- 0 until 8) {
        if ((v == 0 || v == 7) && i < 4) printf("%c", ch)
        else if ((v == i - 4 || v == 11 - i) && i >= 4) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter W
  def w(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (j <- 0 until 8) {
        if (j == 0 || j == 7) printf("%c", ch)
        else if (i > 3 && (j == 7 - i || j == i)) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter X
  def x(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (m <- 0 until 8) {
        if (i == m || m == 7 - i) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter Y
  def y(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (y <- 0 until 8) {
        if (i < 4) if (y == i || y == i + 1 || y == 6 - i || y == 7 - i) printf("%c", ch)
        else printf(" ")
        else if (y == 3 || y == 4) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }

  // Function to print the letter Z
  def z(ch: Char): Unit = {
    printf("\n")
    for (i <- 0 until 8) {
      printf(" ")
      for (j <- 0 until 8) {
        if (i == 0 || i == 7) printf("%c", ch)
        else if (j == 7 - i) printf("%c", ch)
        else printf(" ")
      }
      printf("\n")
    }
  }
}
