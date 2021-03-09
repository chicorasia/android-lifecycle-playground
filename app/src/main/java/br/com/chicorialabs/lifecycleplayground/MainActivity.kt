package br.com.chicorialabs.lifecycleplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "lifecycle_playground"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        android.util.Log.i(TAG, "CREATE: estou criando a tela")
//        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "START: deixei a tela visível para você")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "RESUME: agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "PAUSE: a tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "STOP: a tela não está mais visível mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "RESTART: a tela está recuperando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "DESTROY: a tela foi destruída")
    }


}