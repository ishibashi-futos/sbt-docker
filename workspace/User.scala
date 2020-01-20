trait U {
  val id: Int
  val name: String
  val age: Int
  def print(): Unit = println(s"{id: ${id}, name: ${name}, age: ${age}}")
}

class User(val id: Int, val name: String, val age: Int) extends U {
}