package com.kotlin.playground.classes.visibilitymodifiers

open class PrivateUser(val userName: String) {
    /**
     * There are four visibility modifiers in Kotlin:
     * - public, protected, private and internal
     * + public: This is the default access modifiers
     * + private: This marks the function or variable accessible only to that class
     * + protected: A protected member is visible in the class and subclass
     * + internal: This is new in Kotlin. Anything that's marked with internal is private to the module that's published using the Gradle or Maven
     * */

    private fun secret() {
        println("Inside the private secret function")
    }

    protected open fun logout() {
        println("Inside the protected logout function")
    }
}

class ProtectedUser(userName: String): PrivateUser(userName) {
    public override fun logout() {
        super.logout()
        println("Inside the ProtectedUser logout function")
    }
}

fun main() {
    val user: PrivateUser = PrivateUser("tince")
    // user.secret() -- Cannot access 'secret': it is private in 'PrivateUser'
    // user.logout() -- Cannot access 'logout': it is protected in 'PrivateUser'
    val protectedUser: ProtectedUser = ProtectedUser("ince")
    protectedUser.logout()
}