package tw.nolions.acguy.dagger

import tw.nolions.acguy.dagger.model.User
import javax.inject.Inject

class User {

    init {
        DaggerUserComponent.builder().build().inject(this)
    }

    @Inject
    lateinit var user: User

    fun greet(name: String): String {
        user.name = name
        return user.sayHi()
    }
}