package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var parsedInt1: Int = 0;
        var parsedInt2: Int = 0;
        var result: Int = 0;

        btn_sum.setOnClickListener(){
            var parsedStr1: String = editText.text.toString();
            var parsedStr2: String = editText2.text.toString();
            parsedInt1 = parsedStr1.toInt();
            parsedInt2 = parsedStr2.toInt();
            result = parsedInt1 + parsedInt2;
            textView.text = result.toString();
        }

        btn_sub.setOnClickListener(){
            var parsedStr1: String = editText.text.toString();
            var parsedStr2: String = editText2.text.toString();
            parsedInt1 = parsedStr1.toInt();
            parsedInt2 = parsedStr2.toInt();
            result = parsedInt1 - parsedInt2;
            textView.text = result.toString();
        }

        btn_mult.setOnClickListener(){
            var parsedStr1: String = editText.text.toString();
            var parsedStr2: String = editText2.text.toString();
            parsedInt1 = parsedStr1.toInt();
            parsedInt2 = parsedStr2.toInt();
            result = parsedInt1 * parsedInt2;
            textView.text = result.toString();
        }

        btn_div.setOnClickListener(){
            var parsedStr1: String = editText.text.toString();
            var parsedStr2: String = editText2.text.toString();
            parsedInt1 = parsedStr1.toInt();
            parsedInt2 = parsedStr2.toInt();
            result = parsedInt1 / parsedInt2;
            textView.text = result.toString();
        }
    }
}
