package com.hdwallpaper.galatasaraywallpaper.galatasarayduvarkagitlari.util

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

infix fun <T> AppCompatActivity.extStartActivity(className: Class<T>) {
    startActivity(Intent(this, className))
}