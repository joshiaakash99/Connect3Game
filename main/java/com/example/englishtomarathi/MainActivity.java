package com.example.englishtomarathi;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void playphrase(View view) {
        String tag = view.getTag().toString();
        int tags = Integer.parseInt(tag);
        playAudio(tags);
    }

    public void playAudio(int tags) {
        switch (tags) {


            case 1:
                mediaPlayer = MediaPlayer.create(this, R.raw.namaskar);
                break;
            case 2:
                mediaPlayer = MediaPlayer.create(this, R.raw.whatudoin);
                break;
            case 3:
                mediaPlayer = MediaPlayer.create(this, R.raw.whatsuname);
                break;
            case 4:
                mediaPlayer = MediaPlayer.create(this, R.raw.howareu);
                break;
            case 5:
                mediaPlayer = MediaPlayer.create(this, R.raw.hungry);
                break;
            case 6:
                mediaPlayer = MediaPlayer.create(this, R.raw.tc);
                break;
            case 7:
                mediaPlayer = MediaPlayer.create(this, R.raw.loudya);
                break;
            case 8:
                mediaPlayer = MediaPlayer.create(this, R.raw.ilikeu);
                break;
            default:
                Toast.makeText(this, "fuc u", Toast.LENGTH_SHORT).show();

        }
        mediaPlayer.start();

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
