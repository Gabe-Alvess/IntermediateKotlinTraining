fun main() {
    // MODEL (TEMPLATE)
    // Class (Model responsible for the creation of multiple objects through properties and behaviors)
    // Object (Object is the instance "creation" of an object through the model class)

    // User model class instances
    // Adding var values through constructors
    line("constructors")
    val userA = User("Tiago", "Aguiar") // Constructor 01
    val userB = User("Robert") // Constructor 02
    User.resetCount() // class function call / same as static method call in Java
    val userC = User() // Constructor 03

    // Adding var values through property call
    userA.email = "tiago.aguiar@hotmail.com"
    userB.lastName = "Lewandowski"
    userB.password = "number9"
    userC.firstName = "Gabriel"
    userC.userName = "Gabe-Alvess"

    line("functions")
    // Calling User object functions
    userA.sayHelloToUser()
    userB.sayHelloToUser()
    userC.sayHelloToUser()

    line("set functions")
    // Calling User object set functions
    userA.setNewName("Jhon")
    userA.sayHelloToUser()

    line("get functions")
    // Calling User object get functions
    val email = userA.getUserEmail()
    println(email)
    val nameLength = userC.getFirstNameLength()
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