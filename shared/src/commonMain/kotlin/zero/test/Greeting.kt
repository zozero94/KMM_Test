package zero.test

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}