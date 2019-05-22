package com.unava.dia.kodeindotaopenapi.data
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {
    @GET("players/{accountId}/matches")
    fun getPlayerMatches(@Path("accountId") key: String) : Observable<List<PlayerMatches>>


    //fun getMovies(@Query("page") page: Int): Observable<MovieResult>

}