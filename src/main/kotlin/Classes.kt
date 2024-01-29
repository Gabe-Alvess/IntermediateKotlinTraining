fun main() {
// MODEL (TEMPLATE)
// Class (Model responsible for the creation of multiple objects through properties)
// Object (Object is the instance "creation" of something real through the model class)
    var userA = User("tiago#01")  // Instance
    var userB = User("robert#01")
    var userC = User("joseph#01")

    userA.firstName = "Tiago"
    userB.firstName = "Robert"
    userC.firstName = "Joseph"
    userC.email = "gabriel.webdev@hotmail.com"

    userA.sayHelloToUser()
    userB.sayHelloToUser()

    userA.setNewName("Jhon")

    userA.sayHelloToUser()

    println(userC.getUserEmail())

    val buttonSuccess = Button()
    val buttonCancel = Button()

    buttonSuccess.text = "Success"
    buttonSuccess.color = "00FF00"
    buttonCancel.text = "Cancel"
    buttonCancel.color = "FF0000"

    var nameLength = userC.getFirstNameLength()

    println(nameLength)
}