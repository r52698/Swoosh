package com.example.org.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.org.swoosh.R
import com.example.org.swoosh.Utilities.EXTRA_LEAGUE
import com.example.org.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)
        //println("Looking for a $league $skill league near you…")
        searchLeaguesText.text = "Looking for a $league $skill league near you…"
    }
}
