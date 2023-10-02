package com.My.giuting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import com.My.giuting.databinding.ActivityMainBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





//        val buttonTodo: MaterialCardView = findViewById(R.id.SendNewWriting)

        binding.imdb.setOnClickListener {
            var intent = Intent(this, NavigationActivity2::class.java)
            startActivity(intent)
        }
    }


}