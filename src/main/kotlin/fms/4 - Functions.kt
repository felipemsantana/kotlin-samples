package fms

import org.apache.commons.collections4.ListUtils

object BasicFunctions {
  fun sum(a: Int, b: Int): Int {
    return a + b
  }

  fun multiply(a: Int, b: Int) = a * b

  @JvmStatic
  fun main(args: Array<String>) {
    println(sum(3, 3))
    println(multiply(3, 3))
  }
}

object TailrecFunction {
  fun factorial(num: Int): Int {
    tailrec fun calc(acc: Int, x: Int): Int {
      if (x == 0) return acc
      return calc(acc * x, x - 1)
    }
    return calc(1, num)
  }

  @JvmStatic
  fun main(args: Array<String>) {
    println(factorial(5))
  }
}

object Default {
  fun sayMyName(name: String = "Heisenberg") {
    println("Your name is $name")
  }

  @JvmStatic
  fun main(args: Array<String>) {
    sayMyName()
    sayMyName("Felipe")
  }
}

object Extensions {
  val strings: List<String> = listOf("str1", "str2")

  infix fun Int.pow(x: Int): Int {
    return Math.pow(this.toDouble(), x.toDouble()).toInt()
  }

  fun List<Any>.isEqualList(list: List<Any>): Boolean {
    return ListUtils.isEqualList(this, list)
  }

  @JvmStatic
  fun main(args: Array<String>) {
    println(5 pow 2)
    println(strings.isEqualList(listOf("str1", "str2")))
  }
}
