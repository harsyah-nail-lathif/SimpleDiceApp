package com.example.newdiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.newdiceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRoll.setOnClickListener {
            rollDice()
        }
        rollDice()
    }

    private fun rollDice() {
        val dice = Dice(6) //batasan jumlah angak di dice
        val diceRoll = dice.roll() //fungsi rollling dice

        /*memilih gambar yang sebegai result berdasarkan angka yang keluar
        saat proses RNG */
        val drawableResource = when(diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //show result as an image
        binding.imgDice.setImageResource(drawableResource)

        //show result as a string
        binding.txtResult.text = diceRoll.toString()
    }
}