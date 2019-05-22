package com.unava.dia.kodeindotaopenapi.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PlayerMatches (@SerializedName("match_id")
                          @Expose
                          var matchId: Long? = null,

                          @SerializedName("player_slot")
                          @Expose
                          var playerSlot: Int? = null,

                          @SerializedName("radiant_win")
                          @Expose
                          var radiantWin: Boolean? = false,

                          @SerializedName("duration")
                          @Expose
                          var duration: Int? = null,

                          @SerializedName("game_mode")
                          @Expose
                          var gameMode: Int? = null,

                          @SerializedName("lobby_type")
                          @Expose
                          var lobbyType: Int? = null,

                          @SerializedName("hero_id")
                          @Expose
                          var heroId: Int? = null,

                          @SerializedName("start_time")
                          @Expose
                          var startTime: Int? = null,

                          @SerializedName("version")
                          @Expose
                          var version: Any? = null,

                          @SerializedName("kills")
                          @Expose
                          var kills: Int? = null,

                          @SerializedName("deaths")
                          @Expose
                          var deaths: Int? = null,

                          @SerializedName("assists")
                          @Expose
                          var assists: Int? = null,

                          @SerializedName("skill")
                          @Expose
                          var skill: Any? = null,

                          @SerializedName("leaver_status")
                          @Expose
                          var leaverStatus: Int? = null,

                          @SerializedName("party_size")
                          @Expose
                          var partySize: Any? = null

                          )