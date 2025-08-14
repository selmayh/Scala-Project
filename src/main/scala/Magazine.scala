class Magazine (
  title: String,
  author: String,
  year: Int,
  val editionNumber: String
) extends Document (title, author, year) {

  override def description(): String = {
    if(isBorrowed){
      s"Type: ${this.getClass.getSimpleName} | Title: $title | Author: $author | Year: $year | Edition Number: $editionNumber | Status: Unavailable."
    }
    else {
      s"Type: ${this.getClass.getSimpleName} | Title: $title | Author: $author | Year: $year | Edition Number: $editionNumber | Status: Available."
    }
  }

}
