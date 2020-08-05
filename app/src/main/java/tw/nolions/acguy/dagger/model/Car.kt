package tw.nolions.acguy.dagger.model

import javax.inject.Inject

class Car @Inject constructor() {

    fun wheelCount(): Int {
        return 4;
    }
}