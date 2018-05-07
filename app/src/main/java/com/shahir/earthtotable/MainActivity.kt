package com.shahir.earthtotable

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
//this the main activity file for earthtotable


class MainActivity : AppCompatActivity(){

    /** onCreate is called when the app is first launched.
     * @param savedInstanceState is the saved state of the application.
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(
               val intent = Intent (this,findmore::class.java)
               startActivity(intent)
            )
    }

    override fun onClick(v: View?) {
        when (v.id) {
            R.id.button -> findmore()
            else -> println("error in file")
        }
    }

    // create function findmore to be called when user clicks on find more button
    private fun findmore() {

        val nextScreenIntent = Intent(packageContext:this, findmore::class.java).apply {

        }
        startActivity(nextScreenIntent)
    }

}
