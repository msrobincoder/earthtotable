package com.shahir.earthtotable

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_findoutmore.*
import kotlinx.android.synthetic.main.activity_main.*

class findoutmoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_findoutmore)

        //set listener for signup now button to go to sign up screen
        btn_signup.setOnClickListener {

            val intent = Intent(this, registerActivity::class.java)
            startActivity(intent)
        }//end btn_signupnow
    }//oncreate


}// end findoutmoreActivity


