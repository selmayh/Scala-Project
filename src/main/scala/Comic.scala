class Comic (
  title: String,
  author: String,
  year: Int,
  val seriesVolume: String
) extends Document (title, author, year) {

  override def description(): String = {
    if(isBorrowed){
      s"Type: ${this.getClass.getSimpleName} | Title: $title | Author: $author | Year: $year | Series Volume: $seriesVolume | Status: Unavailable."
    }
    else {
      s"Type: ${this.getClass.getSimpleName} | Title: $title | Author: $author | Year: $year | Series Volume: $seriesVolume | Status: Available."
    }
  }

}
