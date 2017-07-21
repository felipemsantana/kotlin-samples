package fms

object Singleton {
  fun amISingleton() {
    println("Yes I am")
  }
}

class Empty

class SimpleClass(val prop: String)

data class DataClass(val num: Int)

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
  Singleton.amISingleton()
  val myClass: MyClass = MyClass.builder()
    .withField("Kotlin")
    .build()

  println(DataClass(1) == DataClass(1))
  println(DataClass(1) === DataClass(1))
}
