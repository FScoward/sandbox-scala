println("this is scala worksheet")

case class Phantom[A](value: Long)
case class Real(name: String)

val a = Phantom[Real](100L)
val b = Phantom[String](100L)
val c = Phantom[String](220L)

a == b
a == c

case class Unknown(p: Phantom[Real])
Unknown(a)

import org.scalatest._