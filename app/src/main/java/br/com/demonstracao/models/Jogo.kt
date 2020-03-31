package br.com.demonstracao.models

import java.util.*

public class Jogo(
    val local: String,
    val IdTimeCasa: Int,
    val IdTimeVisitante: Int,
    val GolsTimeCasa: Int,
    val GolsTimeVisitante: Int,
    var Encerrada: Boolean,
    var DataHora: Date,
    var TempoReal: Boolean
) {


}