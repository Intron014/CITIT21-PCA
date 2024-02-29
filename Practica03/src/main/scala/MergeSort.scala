import de._
object MergeSort extends App {
  def msort[T](less: (T, T) => Boolean)(xs: List[T]): List[T] = {
    def merge(xs: List[T], ys: List[T]): List[T] = {
      (xs, ys) match {
        case (Nil, _) => ys
        case (_, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (less(x, y)) x :: merge(xs1, ys) else y :: merge(xs, ys1)
      }
    }

    var sortFirstHalf: List[T] = Nil
    var sortSecondHalf: List[T] = Nil

    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (ys, zs) = xs splitAt n

      val t1 = thread {
        sortFirstHalf = msort(less)(ys)
      }

      val t2 = thread {
        sortSecondHalf = msort(less)(zs)
      }

      t1.join()
      t2.join()

      merge(sortFirstHalf, sortSecondHalf)

    }
  }

  val r = msort ((x:Int, y:Int)=> x > y)(List(5,7,1,3))
  println (r)
}