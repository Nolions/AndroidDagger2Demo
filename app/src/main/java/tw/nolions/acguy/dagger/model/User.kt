package tw.nolions.acguy.dagger.model

class User(var name: String) {
    fun name(): String {
        return name
    }

    fun sayHi(): String {
        return "Hi, $name"
    }
}