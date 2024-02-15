object Ej7 extends App {
  def positiveAndThenNegative (a: Array[Int]) : Array[Int] = {
    a.filter( _ >= 0) ++ a.filter( _ < 0)
  }
  val c = Array(0, -1, 2, -3, -4)
  val res = positiveAndThenNegative(c)
  println(res.mkString(","))
}
