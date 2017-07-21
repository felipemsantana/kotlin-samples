package fms

object EmptySingleton

class Empty

object SimpleSingleton {
  val prop1 = 123
}

object JavaSimpleSingleton {
  @JvmStatic
  val jvmStatic = 123
  @JvmField
  val jvmField = 123
}

class SimpleClass(var prop: String)

data class DataClass(val num: Int) {
  lateinit var late: String

  fun calledLater() {
    late = "foo"
  }

  fun accessLate() {
    println(late)
  }
}

class MyClass internal constructor(field: String) {
  companion object Builder {
    fun builder() = MyClassBuilder()
  }
}

class MyClassBuilder(var field: String = "") {
  fun withField(field: String): MyClassBuilder {
    this.field = field
    return this
  }

  fun build(): MyClass {
    return MyClass(field)
  }
}

abstract class AbstractClass {
  fun concreteMethod() {}
  abstract fun abstractMethod()
}

open class ImplClass : AbstractClass() {
  override fun abstractMethod() {}
}

interface Interface {
  fun interfaceMethod()
}

class SubClass : Interface, ImplClass() {
  override fun interfaceMethod() {}
}

fun main(args: Array<String>) {
  val dataClass = DataClass(42)
  dataClass.calledLater()
  dataClass.accessLate()

  val myClass: MyClass = MyClass.builder()
    .withField("Kotlin")
    .build()

  println(DataClass(1) == DataClass(1))
  println(DataClass(1) === DataClass(1))
}
