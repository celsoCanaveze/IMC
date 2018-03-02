package br.com.canaveze.celso.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btncalcular.setOnClickListener{
            val telaResultado = Intent(this, ResultadoActivity::class.java)

            telaResultado.putExtra("PESO",inputpeso.editText?.text.toString())
            telaResultado.putExtra("ALTURA",inputaltura.editText?.text.toString())

            startActivity(telaResultado)
        }
        btnLimpar.setOnClickListener{
            inputaltura.editText?.setText("")
            inputpeso.editText?.setText("")
        }
    }
}
