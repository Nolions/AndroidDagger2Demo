package tw.nolions.acguy.dagger.model

import javax.inject.Inject

class Scooter @Inject constructor() {
    fun wheelCount(): Int {
        return 2;
    }
}