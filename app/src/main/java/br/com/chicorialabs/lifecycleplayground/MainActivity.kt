package br.com.chicorialabs.lifecycleplayground

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import br.com.chicorialabs.lifecycleplayground.databinding.ActivityMainBinding

const val TAG = "lifecycle_playground"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i(TAG, "CREATE: estou criando a tela")

        val markdownView = binding.mainMdView;
        markdownView.loadMarkdownFromAssets("lifecycle_playground.md")

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