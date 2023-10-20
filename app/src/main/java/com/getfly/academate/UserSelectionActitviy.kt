package com.getfly.academate

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.VideoView
import androidx.constraintlayout.widget.ConstraintLayout
import com.getfly.academate.databinding.ActivityUserSelectionBinding

class UserSelectionActitviy : AppCompatActivity() {

    private lateinit var binding : ActivityUserSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        binding.lottieAnimation.setAnimation("background_animation.json")
//        binding.lottieAnimation.playAnimation()
//        val videoView = findViewById<VideoView>(R.id.videoView)
//        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.myvideo) // Replace with your video resource ID
//        videoView.start()

//        val animationDrawable = binding.llRootLayout.background as AnimationDrawable
//        animationDrawable.start()


    }
}