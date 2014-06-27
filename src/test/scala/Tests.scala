import org.scalatest.FunSuite
import Fibonacci._

class FibonacciTests extends FunSuite {
  test("fibonacci") { assert(Vector(1, 1, 2, 3, 5, 8) == (1 to 6).map(fibonacci)) }
  test("fibonacci2") { assert(Vector(1, 1, 2, 3, 5, 8) == (1 to 6).map(fibonacci2)) }
  test("fibonacci3") { assert(Vector(1, 1, 2, 3, 5, 8) == (1 to 6).map(fibonacci3)) }
}