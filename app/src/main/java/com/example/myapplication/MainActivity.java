package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.common.MediaItem;
import androidx.media3.ui.PlayerView;
import androidx.media3.exoplayer.ExoPlayer;





public class MainActivity extends AppCompatActivity {

    // creating a variable for exoplayerview.
    PlayerView playerView;





    // url of video which we are loading.
    String videoURL = "https://firebasestorage.googleapis.com/v0/b/onlinemusic-9f1a8.appspot.com/o/Musics%2FIndex%20of%20_%20-%20Google%20Chrome%202024-03-04%2006-44-46.mp4?alt=media&token=1ac3e94f-64ba-4372-8840-3cd1f036fa95";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExoPlayer player = new ExoPlayer.Builder(MainActivity.this).build();
        playerView = findViewById(R.id.playerView);
        playerView.setPlayer(player);
        MediaItem mediaItem = MediaItem.fromUri(videoURL);
// Set the media item to be played.
        player.setMediaItem(mediaItem);
// Prepare the player.
        player.prepare();
// Start the playback.
        player.play();

    }
}
