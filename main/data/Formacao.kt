package main.data

import main.dominio.Usuario

// Classe responsavel por salvar usuario, buscar usuario e mostrar todos usuarios

data class Formacao(
    val nome: String,
    val contents: List<ConteudoEducacional>,
    val level: Level
    ){

    val registro = mutableListOf<Usuario>()
// Metodo para adicionar novo usuario
    fun addUser(user: Usuario) {
        registro.add(user)
    }
//Metodo para buscar um usuario
    fun getAddUser(){
        for(user in registro){
            println("|Nome: ${user.fNome+" "+user.lNome}| - |Email: ${user.email}| - (${user.post})")
        }
    }
// Metodo para printar os usuarios
    fun printEducationalContent(){
        for(cont in contents){
            println("${cont.name} - ${cont.duration}min - (${cont.level})")
        }
    }
}