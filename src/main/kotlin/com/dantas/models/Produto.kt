package com.dantas.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class produto{@Id
    @GeneratedValue
    var id:Long = 0L;
    var descricao:String = ""
    var unidade:String = ""

    constructor(descricao:String, unidade:String){
        this.descricao = descricao
        this.unidade = unidade
    }

}