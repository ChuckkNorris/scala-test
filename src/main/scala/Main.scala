import scalaj.http.Http

object Main extends App {
  println("Hello, Amazing")
  val message = new CoolMessage("ya dumb idiot")
  message.Greet("John")
  val user1 = User("Hank", "password");
  val user2 = User("Hank", "password");
  val user3 = User("James", "password");
  if (user1 == user2) {
    println(user1, " is equal to ", user2)
  }
  if (user1 != user3) {
    println(user1, " is not equal to ", user3)
 
  }
  println(user1);
  message.getRestContent("http://google.com")
    
}

case class User(name: String, password: String)



   
class CoolMessage(response: String) {
  def Greet(name: String) {
    println("Hey there, " + name + ", " + response);
  }

   def getRestContent(url:String): String = {
     
    val resp = Http("http://foo.com/searc").param("q", "monkeys").asString
     "col"
  }
} 