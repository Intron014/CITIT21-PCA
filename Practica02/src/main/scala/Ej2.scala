object Ej2 extends App {
  def obtenerSuma(args: Int *) : Int = {
    var suma : Int = 0
    for (num <- args) {
      suma += num
    }
    suma
  }

  def obtenerSumaFold(args: Int *) : Int = {
    args.foldLeft(0) (_+_)
  }

  def obtenerSumaSum(args: Int *) : Int = {
    args.sum
  }

  println("Suma obtenida " + obtenerSuma(1,2,3,4,5,6))
  println("Suma obtenida " + obtenerSumaFold(1,2,3,4,5,6))
  println("Suma obtenida " + obtenerSumaSum(1,2,3,4,5,6))
}