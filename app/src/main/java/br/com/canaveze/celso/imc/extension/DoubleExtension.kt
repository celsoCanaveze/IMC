package br.com.canaveze.celso.imc.extension

/**
 * Created by logonrm on 02/03/2018.
 */
fun Double.format(digite: Int) =
        java.lang.String.format("%.${digite}f", this)