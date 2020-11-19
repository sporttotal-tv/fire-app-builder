package com.amazon.dataloader.network;

import com.amazon.dataloader.network.model.response.matchdetail.MatchResponse;
import com.amazon.dataloader.network.model.response.videolist.VideoListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import rx.Observable;
import rx.Single;

public interface CMSApi {

    @Headers("Content-Type: application/json")
    @GET("rebcce1215.json?lang=en")
    Call<VideoListResponse> getLatestMatches();

    @Headers("Content-Type: application/json")
    @GET("{matchId}.json?lang=en")
    Call<MatchResponse> getMatchDetail(@Path("matchId") String matchId);
}
