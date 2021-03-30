package com.example.parent_app

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_page.*

class login_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)
        //變數帶入值
        var userid = userid.text
        var userpw = userpw.text
        //登入按鈕 IF判斷 / 跳轉
        button_login.setOnClickListener {
            if (userid.length == 0) {
                Toast.makeText(this, "記得輸入帳號 ID WAY", Toast.LENGTH_LONG).show()
            }
            if (userpw.length == 0) {
                Toast.makeText(this, "記得輸入密碼 PW WAY", Toast.LENGTH_LONG).show()
            }
            if (userid.length == 0 && userpw.length == 0) {
                Toast.makeText(this, "請輸入帳號密碼 ALL WAY", Toast.LENGTH_LONG).show()
            }
            //
            //夾資料傳送 驗證
            //
        }

        //註冊按鈕 /跳轉
            button_signup.setOnClickListener {
                val gotosignup = Intent(this@login_page,signup_page::class.java)
                startActivity(gotosignup)
            }


            //------------------TEST SIDE----------------------------//
            /* button_Login.setOnClickListener {
            var loginid = userid.text.toString().trim()
            var loginpw = userpw.text.toString().trim()
            TEST.text = String.format(loginid + "  www  " + loginpw)
        } */
        //------------------TEST SIDE----------------------------//


        }
    }