// CONSTRUCTORS (declaration completely different from Java)

// OPTION 01 - without default value + explicit constructor word
// class User constructor(var email: String) {...}

// OPTION 02 - with default value + implicit constructor word
// class User(var email: String = "George") {...}

// OPTION 03 - without default value + implicit constructor word - expects variable value
class User(var firstName: String, var lastName: String) {
    // OBJECT PROPERTIES - Each of the instances of this class has the following properties on its own. (They don't share them with each other. Each one has its own properties)
    var email: String = ""
    var password: String = ""
    var userName: String = ""

    // COMPANION OBJECT - (The scope where you can declare class properties or class functions in Kotlin) - (static properties and static methods in terms of Java)
    var count = 0 // Object count variable
    companion object {
        // CLASS PROPERTIES - Each property declared here will be shared with all instances of this class (The properties will be the same for each instance of this class)
        var count = 0 // Class count variable / same as static count variable

        fun resetCount() { // class function / same as static method
            count = 0
        }
    }

    //    CONSTRUCTOR OVERLOADING
    constructor(firstName: String) : this(firstName, "unknown") { // primary constructor call necessary here!!
        println("CONSTRUCTOR 2: $firstName | $lastName")
    }

    constructor() : this("unknown", "unknown") {
        println("CONSTRUCTOR 3: $firstName | $lastName")
    }

    // INIT BLOCKS
    // Is executed after the primary constructor (It is possible to have more than one init block)
    // Different from constructors they order matters
    init {
        count++ // Object var count call
        User.count++ // Class var count call - Like calling static variables in java
        println("object count: $count")
        println("class count: ${User.count}")
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