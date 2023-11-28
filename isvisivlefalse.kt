package com.android.myapplicationdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView

class isvisivlefalse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isvisivlefalse)

        val wbEdit = intent.getDoubleExtra("wbEdit", 0.0)
        val asEt1 = intent.getDoubleExtra("asEt1", 0.0)
        val asEt2 = intent.getDoubleExtra("asEt2", 0.0)
        val asEt3 = intent.getDoubleExtra("asEt3", 0.0)
        val asEt4 = intent.getDoubleExtra("asEt4", 0.0)
        val asEt5 = intent.getDoubleExtra("asEt5", 0.0)
        val rgas1 = intent.getIntExtra("rgas1", 0)




        //RER계산
        var value = (30 * wbEdit) + 70

        //value1 = 탄수화물 계산. value2 = 칼로리 계산
        var value1 = -asEt1-asEt2-asEt3-asEt4-asEt5+100
        var value2 = (value1*4+asEt1*4+asEt2*9)/100

        val tvResult1 = findViewById<TextView>(R.id.tv_result_1)
        val tvResult3 = findViewById<TextView>(R.id.tv_result_3)
        val tvResult4 = findViewById<TextView>(R.id.tv_result_4)

        tvResult4.text = value1.toString()
        tvResult1.text = value.toString()
        tvResult3.text = value2.toString()


    }
}