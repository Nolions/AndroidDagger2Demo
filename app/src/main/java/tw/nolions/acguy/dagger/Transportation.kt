package tw.nolions.acguy.dagger

import tw.nolions.acguy.dagger.model.Car
import tw.nolions.acguy.dagger.model.Scooter
import javax.inject.Inject

class Transportation {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var scooter: Scooter

    init {
        // general inject
        DaggerTransportationComponent.builder().build().inject(this)

        // Sub inject
//        DaggerParentComponent.builder().build().getSubComponent().inject(this)
    }

    fun allWheelCount(): Int {
        return car.wheelCount() + scooter.wheelCount()
    }
}