error id: file:///C:/Users/SelmaYAHIOUNE/Documents/TP2SCALA/tp2-scala/src/main/scala/Main.scala:
file:///C:/Users/SelmaYAHIOUNE/Documents/TP2SCALA/tp2-scala/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -returnDocument.
	 -returnDocument#
	 -returnDocument().
	 -scala/Predef.returnDocument.
	 -scala/Predef.returnDocument#
	 -scala/Predef.returnDocument().
offset: 1376
uri: file:///C:/Users/SelmaYAHIOUNE/Documents/TP2SCALA/tp2-scala/src/main/scala/Main.scala
text:
```scala
trait Borrowable {
  def borrow(): Boolean
  def returnItem(): Boolean
}

abstract class Document(
  val title : String,
  val author : String,
  val year : Int, 
  var isBorrowed : Boolean = false
  ) extends Borrowable {

  def description(): String
  override def borrow(): Boolean = (!isBorrowed)
  override def returnItem(): Boolean = isBorrowed
}

class Book(
  title: String,
  author: String,
  year: Int,
  val genre: String
) extends Document(title, author, year)  {
  override def description(): String = {
    s"Type: Book | Title: $title | Author: $author | Genre: $genre"
  }

}

class Magazine (
  title: String,
  author: String,
  year: Int,
  val editionNumber: String
) extends Document (title, author, year) {
  override def description(): String = {
    s"Type: Magazine | Title: $title | Author: $author | Edition Number: $editionNumber"
  }
}

class Comic (
  title: String,
  author: String,
  year: Int,
  val seriesVolume: String
) extends Document (title, author, year) {
  override def description(): String = {
    s"Type: Comic | Title: $title | Author: $author | Series Volume: $seriesVolume"
  }
}

class User(
  val name : String,
  var borrowedDocs : List[Document] 
) {
  def borrowDocument : Boolean : -> pour emprunter un
document (utiliser la méthode borrow du document).
2. return@@Document : Boolean -> pour retourner un
document (utiliser la méthode returnItem du document).
3. listBorrowedDocuments : Boolean -> afficher la liste des
documents empruntés.
}


object Library extends App {

  val book = new Book("1984", "George Orwell", 1949, "Dystopian")

  println(book.description())
  println(book.borrow())
  println(book.description())
  println(book.returnItem())
  println(book.description())
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 