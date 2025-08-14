object Main extends App {
  println("################################################################")
  println("################### WELCOME TO OUR LIBRARY ! ###################")
  println("################################################################\n")
  
  val library = new Library()

  // Creating examples of documents to work with
  val book1 = new Book("Crown of Midnight", "Sarah J. Maas", 2013, "YA Fantasy")
  val book2 = new Book("The Queen of Nothing", "Holly Black", 2019, "YA Fantasy")
  val book3 = new Book("The Assassin's Blade", "Sarah J. Maas", 2014, "YA Fantasy")
  val mag1  = new Magazine("Game Informer", "Game Studios", 2024, "April Edition")
  val comic1 = new Comic("One Piece", "Eiichiro Oda", 2024, "Volume 102")

  val user1 = new User("Selma Yahioune")
  val user2 = new User("Celaena Sardothian")
  val user3 = new User("Jude Duarte")
  val user4 = new User("Mikasa Ackerman")

  // Adding the documents to the library
  library.addDocument(book1)
  library.addDocument(book2)
  library.addDocument(book3)
  library.addDocument(mag1)
  library.addDocument(comic1)

  // Adding the users
  library.addUser(user1)
  library.addUser(user2)
  library.addUser(user3)
  library.addUser(user4)

  // A little simulation
  library.listAvailableDocuments()
  library.users(0).borrowDocument(book1)
  library.users(0).borrowDocument(book2)
  library.users(0).listBorrowedDocuments()
  library.users(2).returnDocument(book3)
  library.listAvailableDocuments()
  library.users(2).borrowDocument(book3)
  library.users(1).borrowDocument(book3)
  library.users(0).returnDocument(book1)
  library.users(0).listBorrowedDocuments()
  library.listAvailableDocuments()

  println("\n#################################################################")
  println("################### HOPE WE'LL SEE YOU SOON ! ###################")
  println("#################################################################")

}