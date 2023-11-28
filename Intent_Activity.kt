package com.android.myapplicationdd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

lateinit var intent: Intent


class Intent_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val wbEditText = findViewById<EditText>(R.id.ET_WB)
        val answerEt1 = findViewById<EditText>(R.id.answer_6_1)
        val answerEt2 = findViewById<EditText>(R.id.answer_6_2)
        val answerEt3 = findViewById<EditText>(R.id.answer_6_3)
        val answerEt4 = findViewById<EditText>(R.id.answer_6_4)
        val answerEt5 = findViewById<EditText>(R.id.answer_6_5)
        val submitButton = findViewById<Button>(R.id.btn_next)
        val tvName = findViewById<EditText>(R.id.name_1)
        val tvName2 = findViewById<EditText>(R.id.name_2)
        val answerRadioGroup = listOf<RadioGroup>(
            findViewById(R.id.rg_answer_1),
            findViewById(R.id.rg_answer_3),
        )








        submitButton.setOnClickListener {

            val isAllAnswered = answerRadioGroup.all { it.checkedRadioButtonId != -1 }

            if (isAllAnswered == false) {
                Toast.makeText(this, "성별,컨디션을 선택해주세요", Toast.LENGTH_SHORT).show()
            }
            if (wbEditText.text.isEmpty()) {
                Toast.makeText(this, "체중을 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (tvName.text.isEmpty()) {
                Toast.makeText(this, "반려견 이름을 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
            if (tvName2.text.isEmpty()) {
                Toast.makeText(this, "사료 이름을 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
            if (answerEt1.text.isEmpty()) {
                Toast.makeText(this, "단백질 함류량을 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
            if (answerEt2.text.isEmpty()) {
                Toast.makeText(this, "지방 함류량을 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (answerEt3.text.isEmpty()) {
                Toast.makeText(this, "조섬유 함류량을 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (answerEt4.text.isEmpty()) {
                Toast.makeText(this, "수분 함류량을 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (answerEt5.text.isEmpty()) {
                Toast.makeText(this, "조회분 함류량을 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (tvName2.text.isEmpty()) {
                Toast.makeText(this, "사료 이름을 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


        }


        val wbEdit: Double = wbEditText.text.toString().toDouble()
        val asEt1: Double = answerEt1.text.toString().toDouble()
        val asEt2: Double = answerEt2.text.toString().toDouble()
        val asEt3: Double = answerEt3.text.toString().toDouble()
        val asEt4: Double = answerEt4.text.toString().toDouble()
        val asEt5: Double = answerEt5.text.toString().toDouble()
        val rgas1: Int = answerRadioGroup.toString().toInt()
        val intent = Intent(this, isvisivlefalse::class.java)


        intent.putExtra("wbEdit", wbEdit)
        intent.putExtra("asEt1", asEt1)
        intent.putExtra("asEt2", asEt2)
        intent.putExtra("asEt3", asEt3)
        intent.putExtra("asEt4", asEt4)
        intent.putExtra("asEt5", asEt5)
        intent.putExtra("rgas1", rgas1)
        startActivity(intent)
    }


}


