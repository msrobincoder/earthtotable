package com.shahir.earthtotable

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
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

        // set listener for findoutmore button to go to next screen
        btn_findoutmore.setOnClickListener {
            val intent = Intent(this, findoutmoreActivity::class.java)
            startActivity(intent)
            }//end btn_findoutmore
        }//end OnCreate

    }//end Main

