abstract class Document(
  val title : String,
  val author : String,
  val year : Int, 
  var isBorrowed : Boolean = false
  ) extends Borrowable {

  def description(): String = {
    if(isBorrowed){
      s"Type: ${this.getClass.getSimpleName} | Title: $title | Author: $author | Year: $year | Status: Unavailable."
    }
    else {
      s"Type: ${this.getClass.getSimpleName} | Title: $title | Author: $author | Year: $year | Status: Available."
    }
  }

  override def borrow(): Boolean = {
    if (!isBorrowed) {      
      isBorrowed=true
      true
    }
    else {
      false
    }
  }

  override def returnItem(): Boolean = {
    if(isBorrowed) {
      isBorrowed=false
      true
    }
    else {
      false
    }
  }
}