class User(
  val name : String,
  var borrowedDocs : List[Document] = List()
) {

  // Method to borrow a document by adding it to the list of borrowed docs
  def borrowDocument(doc : Document) : Boolean = {

    if (doc.borrow()) {
      borrowedDocs = doc :: borrowedDocs
      println(s"\n$name has borrowed ${doc.title}")
      true
    }
    else {
      println(s"\nThe document ${doc.title} is not currently available.")
      false
    }
  }

  // Method to return a document by removing it from the list of borrowed docs
  def returnDocument(doc : Document) : Boolean = {
    println(s"\n$name wants to return ${doc.title}.")
    //Verifying that the document is, in fact, borrowed by this user
    if (borrowedDocs.contains(doc)){
      if (doc.returnItem()) {
        borrowedDocs = borrowedDocs.filterNot(_.title == doc.title)
        println(s"\n$name has returned ${doc.title}.")
        true
      }
      else {
        false
      }
    }
    else {
      println(s"\n$name can't return a document they didn't borrow.")
      false
    }
  }
    
  def listBorrowedDocuments(): Boolean = {
      if (borrowedDocs.isEmpty) {
        println(s"\n$name has not borrowed any documents.")
        false

      } else {
        println(s"\n$name has borrowed the following documents:")
        borrowedDocs.foreach { d => println(s"-  ${d.description()}") }
        true
      }
    }
}
