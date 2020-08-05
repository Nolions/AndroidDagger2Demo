package tw.nolions.acguy.dagger

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transportation = Transportation()
        Log.d("test", "count: ${transportation.allWheelCount()}")

        val dog = Animal(0)
        Log.d("test", "dog shout is ${dog.shout()}")

        val cat = Animal(1)
        Log.d("test", "cat shout is ${cat.shout()}")

        val u = User()
        Log.d("test", u.greet("John"))
    }
}

