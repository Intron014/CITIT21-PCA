object Ej5 extends App {
  def potencia (x: Double, n: Int): Double = {
    n match {
      case 0 => 1
      case n: Int if (n < 0) => 1 / potencia (x, -n) // 1 / (x^-n) = x^n
      case n: Int if (n % 2 != 0) => x * potencia (x, n - 1) // x^n = x * x^(n-1)
      case n: Int if (n % 2 == 0) => potencia (x, n / 2) * potencia (x, n / 2) // x^n = x^(n/2) * x^(n/2)
    }
  }

  println (" 4 elevado a -1: ", potencia (4, -1))
  println (" 4 elevado a 0: ", potencia (4, 0))
  println (" 4 elevado a 3: ", potencia (4, 3))
  println (" 4 elevado a 2: ", potencia (4, 2))
}
