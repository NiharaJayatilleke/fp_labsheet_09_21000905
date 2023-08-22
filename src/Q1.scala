class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  var num: Int = n
  var den: Int = d

  def neg: Rational = {

    if (n > 0 && d > 0) { num = -n }
    else if (n < 0 && d > 0) { num = -n }
    else if(n > 0 && d < 0){ den = -d }
    else { num = n; den = -d }

    new Rational(num, den)
  }

  override def toString: String = s"$n / $d"
}

object Q1 extends App {
  val Values: List[(Int, Int)] = List((2, 3), (-2, 3), (2, -3), (-2,-3))

  Values.foreach { case (n, d) =>
    val x = new Rational(n, d)
    val negX = x.neg

    println(s"x: $x")
    println(s"Negative x: $negX \n")
  }
}
