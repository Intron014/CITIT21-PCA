object Ej8 extends App{
  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
    var l = 0
    var t = 0
    var g = 0
    for (i <- values) {
      if (i < v) l += 1
      else if (i == v) t += 1
      else g += 1
    }
    (l, t, g)
  }

  val valores = Array (2, -1, 3, 4, -5)
  val valor = 3
  val res = lteqgt(valores, valor)
  println(res.toString())
}
