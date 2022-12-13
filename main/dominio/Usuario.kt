package main.dominio

import main.data.Post

data class Usuario (val fNome: String,
                    val lNome: String,
                    val email: String,
                    val post: Post
)
