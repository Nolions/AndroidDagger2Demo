package tw.nolions.acguy.dagger.model.animal

import tw.nolions.acguy.dagger.model.animal.Animal

class CatModel : Animal {
    override fun shout(): String {
        return "Nya"
    }
}