package gage.vanderclay.youtubeplayertutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.youtube.player.YouTubeStandalonePlayer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = YouTubeStandalonePlayer.createVideoIntent(this, "XXXX", "oHg5SJYRHA0");
            startActivity(intent);
        }
    }
}
