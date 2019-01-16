package com.example.esezer.youtubeplaylistlerim

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

//1- Manifest dosyasında internet izini verilmelidir.
class MainActivity : AppCompatActivity() {

    var API_KEY = "AIzaSyBTFB1LrBXuA1F5RY7scS6KdALtYnDzYlA"
    val CHANNEL_ID = "UCYvmuw-JtVrTZQ-7Y4kd63Q"
    //tum veriyi tutuyor.
    var gelenVeri:PlaylistData?=null
    //recyclerview göstermek istediğimiz veriler
    var oynatmaListeleri:List<PlaylistData.Items> ?= null

    var myAdapter:PlaylistAdapter?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Oluşturduğumuz Apiınterfaceni kullanması için bunu yazıyoruz. cleint yoksa oluştur varsa kullan.
        //retrofit ile java baglantısı.
        //yapılacak istekleri hangi clienta yapacağımızı burada belirtiyoruz. bunun içindeki çağrıları yapacağım.
        var apiInterface = ApiClient.client?.create(ApiInterface::class.java)
        //gelecek olan verileri apiCalle eklicez.
        var apiCall = apiInterface?.tumListeleriGetir(CHANNEL_ID, API_KEY, 25)

        apiCall?.enqueue(object : Callback<PlaylistData> {
            override fun onFailure(call: Call<PlaylistData>, t: Throwable) {

            }
            override fun onResponse(call: Call<PlaylistData>, response: Response<PlaylistData>) {
                gelenVeri=response?.body()
                oynatmaListeleri=gelenVeri?.items
                myAdapter=PlaylistAdapter(oynatmaListeleri)
                supportActionBar?.setSubtitle("Toplam Liste Sayısı :"+oynatmaListeleri?.size)
            }
        })



    }
}

