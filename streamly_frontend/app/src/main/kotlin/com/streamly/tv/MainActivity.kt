package com.streamly.tv

import org.apache.commons.text.WordUtils
import org.example.list.LinkedList
import org.example.utilities.SplitUtils
import org.example.utilities.StringUtils

import android.widget.TextView
import android.os.Bundle
import android.app.Activity

/**
 * PUBLIC_INTERFACE
 * MainActivity
 * The main/home activity for the Streamly TV app.
 */
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = buildMessage()
    }

    private fun buildMessage(): String {
        val tokens: LinkedList = SplitUtils.split(MessageUtils.message())
        val result: String = StringUtils.join(tokens)
        return WordUtils.capitalize(result)
    }
}
