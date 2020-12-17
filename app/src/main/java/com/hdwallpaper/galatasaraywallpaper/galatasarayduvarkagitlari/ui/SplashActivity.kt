package com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.ui

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.databinding.ActivitySplashBinding
import com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.util.extStartActivity

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //TODO("do splash db (firebase) control")
        //do firebase version control"
        //just for usage
        object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.txtCount.text = ((millisUntilFinished / 1000).toString())
                //Toast.makeText(getApplicationContext(), "BİR HATA OLUŞTU", Toast.LENGTH_LONG).show();
            }

            override fun onFinish() {
                //change Activity
                binding.txtCount.text = "Berker"
                this@SplashActivity extStartActivity MenuActivity::class.java
            }

        }.start()

    }
}