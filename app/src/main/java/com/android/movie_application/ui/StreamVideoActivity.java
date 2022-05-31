package com.android.movie_application.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import com.android.movie_application.R;

public class StreamVideoActivity extends AppCompatActivity {

    private VideoView videoView;
    private Button playBtn;
    private TextView currentTimer;
    private TextView durationTimer;
    private ProgressBar videoProgress;
    private Uri videoUri;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stream_video_activity);

        videoView = (VideoView) findViewById(R.id.videoViewMain);
        playBtn = (Button) findViewById(R.id.playBtn);
        currentTimer = (TextView) findViewById(R.id.currentTimer);
        durationTimer = (TextView) findViewById(R.id.durationTimer);
        videoProgress = (ProgressBar) findViewById(R.id.videoProgress);
        videoUri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/movie-app-270d9.appspot.com/o/movie-source%2FDemon%20Slayer%20Season%203-%20Swordsmith%20Village%20Arc%20-%20Official%20Trailer%20-%20AniTV.mp4?alt=media&token=6d7f44a2-e26c-4ae9-948f-a7837d674fb8");
        videoView.setVideoURI(videoUri);
        videoView.requestFocus();
        videoView.start();
    }
}