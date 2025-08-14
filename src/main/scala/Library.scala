class Library () {

  // List of all the documents in the library 
  var documents : List[Document] = List()

  // List of the registred users 
  var users : List[User] = List()

  // Getters
  def getDocuments: List[Document] = documents.toList
  def getUsers: List[User] = users.toList

  def addDocument(newDoc : Document) : Unit = {
    // Adding doc lifo (quicker than fifo)
    documents = newDoc :: documents
    println(s"The document <<${newDoc.title}>> has been added.")
  }

  def addUser(newUser : User) : Unit = {
    // Add user
    users = newUser :: users
    println(s"The user <<${newUser.name}>> has joined us !")
  }

  def listAvailableDocuments(): Unit = {
    // Print available documents
    if (documents.isEmpty) {
      println("\nThere are no documents in the library, come back soon!")
    } else {

      val availableDocs = documents.filterNot(_.isBorrowed)

      if (availableDocs.isEmpty) {
        println("\nAll documents are currently borrowed.")
      } else {
        println("\nAvailable documents :")
        availableDocs.foreach(doc => println(s"- ${doc.description()}"))
      }
      
    }
  }

}
