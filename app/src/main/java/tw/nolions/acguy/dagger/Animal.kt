package tw.nolions.acguy.dagger

import tw.nolions.acguy.dagger.model.animal.Animal
import tw.nolions.acguy.dagger.module.AnimalModule
import javax.inject.Inject

class Animal(val creatureType: Int = 0) {

    @Inject
    lateinit var creature: Animal

    init {
        DaggerComponent.builder().animalModule(
            AnimalModule(
                creatureType
            )
        ).build().inject(this)
    }

    fun shout(): String {
        return creature.shout()
    }


}