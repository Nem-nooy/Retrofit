package kr.ac.kumoh.ce.s20220736.retrofit

import retrofit2.http.GET
import retrofit2.http.Query

interface SongApi {
    @GET("song")
    suspend fun getSongs(
        @Query("apikey") apiKey: String = SongApiConfig.API_KEY
    ): List<Song>
}