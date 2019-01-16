package com.example.esezer.youtubeplaylistlerim

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {


    // https://www.googleapis.com/youtube/v3/playlists?part=snippet&channelId=UCYvmuw-JtVrTZQ-7Y4kd63Q&maxResults=20&key={YOUR_API_KEY}
    @GET("playlists?part=snippet")
    fun tumListeleriGetir(@Query("channelId") channelId:String, @Query("key") apiKey:String, @Query("maxResults") limit:Int):retrofit2.Call<PlaylistData>

}