package com.example.parent_app

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.set
import kotlinx.android.synthetic.main.signup_page.*

class signup_page: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_page)
        //------------------TEST SIDE----------------------------//
        /* button_Login.setOnClickListener {
        var loginid = userid.text.toString().trim()
        var loginpw = userpw.text.toString().trim()
        TEST.text = String.format(loginid + "  www  " + loginpw)
    } */
        //------------------TEST SIDE----------------------------//

        //變數帶入值
        var signup_userid = signup_userid.text
        var signup_userpw = signup_userpw.text

        //註冊按鈕 IF判斷 / 跳轉
        signup_button.setOnClickListener {

            if (signup_userid.length == 0 || signup_userpw.length == 0 || signup_stu_number.length() == 0) {
                Toast.makeText(this, "有資料尚未輸入", Toast.LENGTH_LONG).show()
            }
            if (signup_userid.length != 0 && signup_userpw.length != 0 && signup_stu_number.length() != 0) {
                val signupsuccess = Intent(this@signup_page, signup_ques_page::class.java)
                startActivity(signupsuccess)
                //
                // 夾資料傳送
                //
            }
            //返回登入介面 /跳轉
            back_button.setOnClickListener {
                val backtologin = Intent(this@signup_page, login_page::class.java)
                startActivity(backtologin)
            }

        }
    }
}