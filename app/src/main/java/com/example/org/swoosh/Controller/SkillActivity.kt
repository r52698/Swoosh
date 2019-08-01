package com.example.org.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.org.swoosh.Utilities.EXTRA_LEAGUE
import com.example.org.swoosh.R
import com.example.org.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClick(view: View) {
        ballerSkillBtn.isChecked = false
        selectedSkill = "beginner"
    }

    fun onBallerClick(view: View) {
        beginnerSkillBtn.isChecked = false
        selectedSkill = "baller"
    }

    fun onSkillFinishClicked(view: View) {
        if (selectedSkill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select your skill.", Toast.LENGTH_SHORT).show()
        }
    }
}
