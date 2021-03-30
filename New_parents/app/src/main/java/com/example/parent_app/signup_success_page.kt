package com.example.parent_app

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.set
import kotlinx.android.synthetic.main.signup_page.*
import kotlinx.android.synthetic.main.signup_success_page.*

class signup_success_page: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_success_page)
        signup_success_title.text = "註冊成功 TEST 03/" +
                "三秒後移動至首頁"

        //------------------TEST SIDE----------------------------//


        //------------------TEST SIDE----------------------------//

    }
    }