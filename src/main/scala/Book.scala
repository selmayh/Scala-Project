class Book(
  title: String,
  author: String,
  year: Int,
  val genre: String
) extends Document(title, author, year)  {

  override def description(): String = {
    if(isBorrowed){
      s"Type: ${this.getClass.getSimpleName} | Title: $title | Author: $author | Year: $year | Genre: $genre | Status: Unavailable."
    }
    else {
      s"Type: ${this.getClass.getSimpleName} | Title: $title | Author: $author | Year: $year | Genre: $genre | Status: Available."
    }
  }

}