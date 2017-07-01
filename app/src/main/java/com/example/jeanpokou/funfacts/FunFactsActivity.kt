package com.example.jeanpokou.funfacts

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fun_facts.*

class FunFactsActivity : AppCompatActivity() {
    val factBook = FactBook()
    val colorWheel = ColorWheel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        mShowFactButton.setOnClickListener {
            // Instantiate FactBook;
            // update the screen with random fact
            mFactTextView.text = factBook.getFact()
            val color = colorWheel.getColor()
            mRelativeLayout.setBackgroundColor(color)
            mShowFactButton.setTextColor(color)

        }



    }
}
