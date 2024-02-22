fun main() {
// Unique objects (Singleton)
    val userA = User("Tiago")
    println(Database.name)
    println(Database.loggedUser?.firstName)

    login(userA)

    println(Database.loggedUser?.firstName)

    val userB = User("Bruce")
    login(userB)

    println(Database.loggedUser?.firstName)
}

fun login(user: User) {
    Database.loggedUser = user
}

// The (object) keyword can also be used to group constants.
// Class -> is the model to create multiple objects.
// Objects -> is the grouping of properties and behaviors of a specific context in your system. (Button, LoginScreen, PassValidator)
// Object -> it is also an object, but in this case it is a unique object.
// (Example: Database, user session, logs).
object Constants {
    const val  MAX_NAME_LENGTH = 8
    const val IMAGE_PATH = "/Images/"
    const val PHOTO_EXT = ".jpg"
    const val DOMAIN = "https://example.com"
}