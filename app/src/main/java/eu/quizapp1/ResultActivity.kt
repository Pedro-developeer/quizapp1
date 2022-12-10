package eu.quizapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvName:TextView = findViewById(R.id.tv_name)
        val tvScore:TextView=findViewById(R.id.tv_score)
        val tvNextScore:TextView=findViewById(R.id.tv_last_score)
        val btnFinish : Button = findViewById(R.id.btn_finish)
        tvName.text= intent.getStringExtra(Constants.USER_NAME)
        //salvar a pontuação do usuário no shared preferences
        val scoreSharedPrefs = getSharedPreferences(Constants.QUIZAPP_PREFERENCES, MODE_PRIVATE)
        //salvar a pontuação anterior do usuário no shared preferences
        val lastScore = scoreSharedPrefs.getInt(Constants.LAST_SCORE,0)
        //passar a nova pontuação para receber a pontuação anterior
        val currentScore = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        //salvar a pontuação atual no shared preferences
        val editor = scoreSharedPrefs.edit()
        editor.putInt(Constants.LAST_SCORE,currentScore)
        editor.apply()
        tvScore.text = "Sua pontuação é $currentScore"
        tvNextScore.text = "Sua última pontuação foi $lastScore"

        btnFinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }


    }
}