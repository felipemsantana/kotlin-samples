package fms

object NullSafety {
  fun alwaysNull(): Int? = null

  fun maybeNull(): String? {
    if (System.currentTimeMillis() % 2 == 0L) {
      return "foo"
    }
    return null
  }

  fun length() = maybeNull()?.length ?: 0

  @JvmStatic
  fun main(args: Array<String>) {
    alwaysNull()?.toString()

    maybeNull()?.let {
      println("works sometimes")
    }

    // For those who like NPE:
    // maybeNull()!!.length

    (1..10).forEach { println(length()) }

    val listNullableTypes: List<Int?> = listOf(1, 2, null, 4)
    val list: List<Int> = listNullableTypes.filterNotNull()
  }
}

object ExceptionHandling {
  fun count(): Int {
    throw NotImplementedError()
  }

  fun getResults(): Int {
    val result: Int? = try {
      count()
    } catch (ex: Exception) {
      // log error
      null
    }

    return result ?: 0
  }

  @JvmStatic
  fun main(args: Array<String>) {
    val results = getResults()
    println(results)
  }
}
