package mario.antolovic.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese","Hamburger","Pizza","McDonalds","Italien", "Sushi")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decide_button.setOnClickListener() {
            val random = Random
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }
        add_food_button.setOnClickListener {
            val newFood = add_food.text.toString()
            foodList.add(newFood)
            add_food.text.clear()
        }
    }
}
