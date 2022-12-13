import main.data.*
import main.dominio.Usuario


fun main() {
    val contentList = cadastroConteudoEducacionals()

    val androidTraining = cadastroUsuarioComFormacao(contentList)

    setupView(androidTraining)

}

private fun cadastroUsuarioComFormacao(contentList: MutableList<ConteudoEducacional>): Formacao {
    val jorge = Usuario("Jorge", "Garcia", "jorgetraninportfolio@gmail.com", Post.STUDENT)
    val antonio = Usuario("Antonio", "Tranin", "jorgetraninportfolio@gmail.com", Post.STUDENT)
    val venilton = Usuario("Venilto", "Falvo", "veniltonfalvo@gmail.com", Post.TEACHER)

    val treinamentoAndroid = Formacao("Formação Android Developer", contentList, Level.INTERMEDIARY)

    treinamentoAndroid.addUser(jorge)
    treinamentoAndroid.addUser(antonio)
    treinamentoAndroid.addUser(venilton)
    return treinamentoAndroid
}

private fun cadastroConteudoEducacionals(): MutableList<ConteudoEducacional> {
    val moduleKotlinB = ConteudoEducacional("Linguagem Kotlin", 120, Level.BASIC)
    val moduleAndroidStudioB = ConteudoEducacional("Fundamentos Android Studio", 120, Level.BASIC)
    val moduleKotlinI = ConteudoEducacional("Orientação a objeto POO", 180, Level.INTERMEDIARY)
    val moduleAndroidStudioI = ConteudoEducacional("Fundamentos Multiscreen", 180, Level.ADVANCED)

    val contentList = mutableListOf<ConteudoEducacional>()
    contentList.add(moduleKotlinB)
    contentList.add(moduleAndroidStudioB)
    contentList.add(moduleKotlinI)
    contentList.add(moduleAndroidStudioI)
    return contentList
}

private fun setupView(androidTraining: Formacao) {
    println(" -----------------------------------------")
    println("|${androidTraining.nome} - ${androidTraining.level}|")
    println(" -----------------------------------------")

    println("Grade do curso")
    println(androidTraining.printEducationalContent())
    println("******************************************")

    println("Usuarios cadastrados no curso")
    println(androidTraining.getAddUser())
}
