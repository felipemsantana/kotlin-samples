package fms

val char: Char = 'c'
val string: String = "string"
val bool: Boolean = true

val byte: Byte = 127
val short: Short = 1_000
val int: Int = 1_000_000_000
val long: Long = 1_000_000_000_000L
val float: Float = 1.23F
val double: Double = 1.23

val binary: Int = 0b11110000_00001111
val hexadecimal: Int = 0xAA_FF

val array: Array<String> = arrayOf("str1", "str2")

val longText: String = """
  Multiline text
  Multiline text
  Multiline text
"""

val longTextMargin: String = """
  |Multiline text
  |Multiline text
  |Multiline text
""".trimMargin()

val immutable = 1
var mutable = 1

val template: String = "mutable value is ${mutable}"
val templateLazy: String by lazy { "mutable value is ${mutable}" }

fun main(args: Array<String>) {
  println(longText)
  println(longTextMargin)

  mutable = 2
  println(template)
  println(templateLazy)
}
