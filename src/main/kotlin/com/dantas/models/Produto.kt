package com.dantas.models

public class produto{
    var id:Long = 0
    var descricao:String = ""
    var unidade:String = ""

    constructor(descricao:String, unidade:String){
        this.descricao = descricao
        this.unidade = unidade
    }

}