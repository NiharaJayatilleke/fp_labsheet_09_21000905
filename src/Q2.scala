class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  var num: Int = n
  var den: Int = d

  def sub(that: Rational): Rational = new Rational (
    num * that.den - that.num * den,
    den * that.den
  )

  override def toString: String = s"$n / $d"
}

object Q2 extends App{

  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  val result = x.sub(y).sub(z)

  println(s"x: $x")
  println(s"y: $y")
  println(s"z: $z")
  println(s"\nx - y - z: $result")
}
