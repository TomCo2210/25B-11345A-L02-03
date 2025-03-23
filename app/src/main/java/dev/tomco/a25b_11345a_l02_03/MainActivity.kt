package dev.tomco.a25b_11345a_l02_03

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {

    private lateinit var main_IMG_flag: AppCompatImageView

    private lateinit var main_LBL_countryName: MaterialTextView

    private lateinit var main_LBL_score: MaterialTextView

    private lateinit var main_BTN_yes: MaterialButton

    private lateinit var main_BTN_no: MaterialButton

    private lateinit var main_IMG_hearts: Array<AppCompatImageView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViews()
    }

    private fun findViews() {
        main_IMG_flag = findViewById(R.id.main_IMG_flag)
        main_LBL_countryName = findViewById(R.id.main_LBL_countryName)
        main_LBL_score = findViewById(R.id.main_LBL_score)
        main_BTN_yes = findViewById(R.id.main_BTN_yes)
        main_BTN_no = findViewById(R.id.main_BTN_no)
        main_IMG_hearts = arrayOf(
            findViewById(R.id.main_IMG_heart0),
            findViewById(R.id.main_IMG_heart1),
            findViewById(R.id.main_IMG_heart2)
        )
    }
}