package tw.nolions.acguy.dagger.module

import dagger.Module
import dagger.Provides
import tw.nolions.acguy.dagger.model.animal.Animal
import tw.nolions.acguy.dagger.model.animal.CatModel
import tw.nolions.acguy.dagger.model.animal.DogModel

@Module
class AnimalModule(private val creatureType: Int) {

    companion object {
        const val DOG: Int = 0
        const val CAT: Int = 1
    }

    @Provides
    fun provideAnimal(): Animal
    {
        return when (creatureType) {
            CAT ->
                CatModel()
            DOG ->
                DogModel()
            else ->
                DogModel()
        }
    }
}