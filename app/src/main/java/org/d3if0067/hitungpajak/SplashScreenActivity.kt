package org.d3if0067.hitungpajak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import java.lang.Exception

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//        val toolbar = findViewById<Toolbar>(R.id.Toolbar)
//        setSupportActionBar(toolbar)
//        <androidx.appcompat.widget.Toolbar
//        android:id="@+id/Toolbar"
//        android:layout_width="match_parent"
//        android:layout_height="100dp"
//        android:background="@color/color_blue"
//        android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
//        app:layout_constraintEnd_toEndOf="parent"
//        app:layout_constraintStart_toStartOf="parent"
//        app:layout_constraintTop_toTopOf="parent"
//        app:logo="@drawable/ic_menu_black_24dp"
//        app:title="Z-TAX"
//        app:titleMarginStart="40dp" />

        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(5000)
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
