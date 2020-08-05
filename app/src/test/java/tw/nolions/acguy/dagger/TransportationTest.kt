package tw.nolions.acguy.dagger

import io.mockk.every
import io.mockk.mockk
import org.junit.Assert
import org.junit.Test
import tw.nolions.acguy.dagger.model.Car
import tw.nolions.acguy.dagger.model.Scooter


class TransportationTest {

    @Test
    fun testAllWheelCount() {
        val transportation = Transportation()

        // mock wheel Count of car
        transportation.car = mockk<Car>()
        every { transportation.car.wheelCount() } returns 1

        // mock wheel Scooter of car
        transportation.scooter = mockk<Scooter>()
        every { transportation.scooter.wheelCount() } returns 1

        Assert.assertEquals(2, transportation.allWheelCount())
    }
}
