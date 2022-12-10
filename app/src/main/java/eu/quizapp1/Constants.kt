package eu.quizapp1

object Constants {
    const val USER_NAME :String="user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"
    const val QUIZAPP_PREFERENCES:String = "QuizAppPreferences"
    const val NEW_SC0RE:String = "new_score"
    const val LAST_SCORE:String = "last_score"




    fun getQuestions() : ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que1= Question(1,
            "A que país pertence esta bandeira?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia","Armenia","Austria",
            1)
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "A que país pertence esta bandeira?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "A que país pertence esta bandeira?",
            R.drawable.ic_flag_of_brazil,
            "Bielorrússia", "Belize",
            "Brunei", "Brasil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "A que país pertence esta bandeira?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Bélgica",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "A que país pertence esta bandeira?",
            R.drawable.ic_flag_of_fiji,
            "Gabão", "França",
            "Fiji", "Finlândia", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "A que país pertence esta bandeira?",
            R.drawable.ic_flag_of_germany,
            "Alemanha", "Georgia",
            "Grecia", "Nenhuma dessas", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "A que país pertence esta bandeira?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egito",
            "Dinamarca", "Etiópia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "A que país pertence esta bandeira?",
            R.drawable.ic_flag_of_india,
            "Irlanda", "Iran",
            "Hungria", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "A que país pertence esta bandeira?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "Nova Zelandia",
            "Tuvalu", "Estados Unidos", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "A que país pertence esta bandeira?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordania",
            "Sudan", "Palestina", 1
        )

        questionsList.add(que10)
        return questionsList
    }
}