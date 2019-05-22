package com.unava.dia.kodeindotaopenapi

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import com.unava.dia.kodeindotaopenapi.di.App
import org.kodein.di.generic.instance
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import retrofit2.Retrofit
import butterknife.ButterKnife
import com.unava.dia.kodeindotaopenapi.data.ApiInterface
import com.unava.dia.kodeindotaopenapi.data.PlayerMatches
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity(), KodeinAware {
    override lateinit var kodein: Kodein
    private val retrofit: Retrofit by instance<Retrofit>()
    private lateinit var apiInterface: ApiInterface

    var accId = "131519220"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        kodein = (application as App).kodein


        val btnFind = findViewById<Button>(R.id.buttonGo)
        btnFind.setOnClickListener {
            getPlayerMatch(accId)
        }

    }

    @SuppressLint("CheckResult")
    fun getPlayerMatch(accId: String) {
        // observable
        // observer
        // subscription

        apiInterface = retrofit.create(ApiInterface::class.java)
        apiInterface.getPlayerMatches(accId)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { li ->
                val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, li.toList())
                val listView = findViewById<ListView>(R.id.listView)
                listView!!.adapter = adapter
            }
    }
}
