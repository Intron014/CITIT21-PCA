import de._
object ThreadsNonDeterminism extends App {
  val t = thread(log("New thread running."))
  log("...")
  log("...")
  t.join()
  log("New thread joined.")
}
