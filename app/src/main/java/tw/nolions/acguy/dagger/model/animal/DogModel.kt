package tw.nolions.acguy.dagger.model.animal

import tw.nolions.acguy.dagger.model.animal.Animal

class DogModel : Animal {
    override fun shout(): String {
        return "Woof"
    }
}