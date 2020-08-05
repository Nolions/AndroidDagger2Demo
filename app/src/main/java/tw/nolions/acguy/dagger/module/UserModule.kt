package tw.nolions.acguy.dagger.module

import dagger.Module
import dagger.Provides
import tw.nolions.acguy.dagger.model.User

@Module
class UserModule {

    @Provides
    fun provideUser(): User {
        return User("John")
    }
}