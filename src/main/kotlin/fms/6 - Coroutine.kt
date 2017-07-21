package fms

import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) {
  val sequence: Sequence<Int> = buildSequence {
    var n = 0
    while (true) {
      yield(n++)
      Thread.sleep(500)
    }
  }

  sequence.takeWhile { it < 5 }.forEach(::println)
}
