fun main() {
    // MODEL (TEMPLATE)
    // Class (Model responsible for the creation of multiple objects through properties)
    // Object (Object is the instance "creation" of something real through the model class)

    // Instances of model class user
    // Adding var values through constructors
    line("constructors")
    var userA = User("tiago#01", true) // Constructor 01
    var userB = User("robert#01") // Constructor 02
    var userC = User() // Constructor 03

    // Adding var values through property call
    userA.firstName = "Tiago"
    userB.firstName = "Robert"
    userC.firstName = "Joseph"
    userC.email = "gabriel.webdev@hotmail.com"

    line("functions")
    // Calling User class functions
    userA.sayHelloToUser()
    userB.sayHelloToUser()
    userC.sayHelloToUser()

    line("set functions")
    // Calling User class set functions
    userA.setNewName("Jhon")
    userA.sayHelloToUser()

    line("get functions")
    // Calling User class get functions
    var email = userC.getUserEmail()
    println(email)
    var nameLength = userC.getFirstNameLength()
    println(nameLength)

    // Another practical model class example
    val buttonSuccess = Button()
    val buttonCancel = Button()

    buttonSuccess.text = "Success"
    buttonSuccess.color = "00FF00"
    buttonCancel.text = "Cancel"
    buttonCancel.color = "FF0000"
}

fun line(title: String) {
    println(
        """
        ${"-".repeat(100)}
        ${title.uppercase()}
        ${"-".repeat(100)}
    """.trimIndent()
    )
}