package com.raywenderlich.pretryout

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  var billAmount = 0.0
  var tipPercentage = 0

  val KEY_TIP_PERCENTGE = "KEY_TIP_PERCENTGE"
  val KEY_BILL_AMOUNT = "KEY_BILL_AMOUNT"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Task 1: Add click action to “Tip percentage” buttons

    // Task 2: Add text change listener to the bill amount <EditText>

    // Task 3: Handle orientation change

    // Task 4: Support different languages
  }
}