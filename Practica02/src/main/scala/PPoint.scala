case class Point (x: Int, y: Int) {
  def +(newpt: Point) = Point(x+newpt.x, y+newpt.y)
  def -(newpt: Point) = Point(x-newpt.x, y-newpt.y)

  override def toString="Point (" + x + "," + y + ") "
}

object PPoint {
  def main (args: Array[String]): Unit = {
    val p1 = Point (3,4)
    val p2 = Point (7,2)
    val p3 = Point (-2,2)
    val p4 = p1+p2-p3
    println(p4)
  }
}

/*
1. Indica qué hace el programa y por qué se imprime el contenido de p4 sin ser un String
*   - Por el override que se hace en la clase Point
*
2. Indica cómo es posible que el programa anterior no dé errores de compilación siendo que no
están definidos en la clase Point las variables x e y, y sus métodos de acceso
*   - Están como variables de entrada
*/
