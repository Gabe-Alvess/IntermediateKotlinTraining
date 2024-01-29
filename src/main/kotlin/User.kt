// CONSTRUCTORS (declaration completely different from Java)
// OPTION 01 - without default value + explicit constructor word
// class User constructor(var email: String) {...}

// OPTION 02 - with default value + implicit constructor word
// class User(var email: String = "George") {...}

// OPTION 03 - without default value + implicit constructor word - expects variable value
class User(var userName: String, var isAdmin: Boolean) {
    //    PROPERTIES
    var email: String = ""
    var password: String = ""
    var firstName: String = ""
    var lastName: String = ""

    //    CONSTRUCTOR OVERLOADING
    constructor(userName: String) : this(userName, false) { // primary constructor call necessary here!!
        println("CONSTRUCTOR 2: $userName | $isAdmin")
    }

    constructor() : this("unknown", false) {
        println("CONSTRUCTOR 3: $userName | $isAdmin")
    }

    //    GETTERS
    fun getUserEmail(): String {
        return email
    }

    fun getFirstNameLength(): Int {
        return firstName.length
    }

    //    SETTERS
    fun setNewName(newName: String) {
        firstName = newName;
    }

    //    FUNCTIONS/METHODS/BEHAVIORS
    fun sayHelloToUser() {
        println("Hello, $firstName!")
    }
}