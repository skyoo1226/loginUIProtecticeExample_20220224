package com.skyoo.loginuiprotecticeexample_20220224

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 참조, 메모 시작... 아이디, 비번, 로그인...
        // 자동 완성 잘 안됨...추후 문의

        btnLog.setOnClickListner{
            Log.d("메인화면","로그버튼 눌림")

        }










    }
}