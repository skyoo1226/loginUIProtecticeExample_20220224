package com.skyoo.loginuiprotecticeexample_20220224

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 참조, 메모 시작... 아이디, 비번, 로그인...
        // 자동 완성 잘 안됨...추후 문의

        btnLogin.setOnClickListener {

            val id = "admin"
            val password = "qwer"

            if (id == edtId && password == edtPassword) {

                Toast.makeText(this,"관리자님 환영합니다.", Toast.LENGTH_SHORT). show()

            }

            else if (id != edtId) {

                Toast.makeText(this,"아이디가 틀립니다.", Toast.LENGTH_SHORT). show()
            }

            else if (password != edtPassword) {

                Toast.makeText(this,"비번이 잘못되었습니다.", Toast.LENGTH_SHORT). show()
            }

            else {

                Toast.makeText(this,"로그인에 실패하였습니다.", Toast.LENGTH_SHORT). show()
            }

        }



    }
}