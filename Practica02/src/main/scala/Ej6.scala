object Ej6 extends App {
  def eliminaNegativos (a: Array[Int]) : Array[Int] = {
    a.filter( _ >= 0)
  }
  val b = Array (2,-3,2,4,-1)
  val res = eliminaNegativos(b)
  println(res.mkString(","))
}
