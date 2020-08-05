package tw.nolions.acguy.dagger

import dagger.Component
import dagger.Subcomponent
import tw.nolions.acguy.dagger.module.AnimalModule
import tw.nolions.acguy.dagger.module.UserModule

@Component(modules = [AnimalModule::class])
interface Component {
    fun inject(model: Animal)
}

@Component(modules = [UserModule::class])
interface UserComponent {
    fun inject(model: User)
}

@Component
interface TransportationComponent {
    fun inject(model: Transportation)
}

@Subcomponent
interface SubComponent {
    fun inject(model: Transportation)
}

@Component
interface ParentComponent {
    fun getSubComponent(): SubComponent
}