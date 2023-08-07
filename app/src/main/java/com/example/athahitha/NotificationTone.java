package com.example.athahitha;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationTone extends AppCompatActivity {
    MediaPlayer mediaPlayer1;
    MediaPlayer mediaPlayer2;
    MediaPlayer mediaPlayer3;
    MediaPlayer mediaPlayer4;
    MediaPlayer mediaPlayer5;
    MediaPlayer mediaPlayer6;
    MediaPlayer mediaPlayer7;
    MediaPlayer mediaPlayer8;
    MediaPlayer mediaPlayer9;
    MediaPlayer mediaPlayer10;
    MediaPlayer mediaPlayer11;
    MediaPlayer mediaPlayer12;
    MediaPlayer mediaPlayer13;
    MediaPlayer mediaPlayer14;
    MediaPlayer mediaPlayer15;
    MediaPlayer mediaPlayer16;
    MediaPlayer mediaPlayer17;
    MediaPlayer mediaPlayer18;
    MediaPlayer mediaPlayer19;
    MediaPlayer mediaPlayer20;
    MediaPlayer mediaPlayer21;
    MediaPlayer mediaPlayer22;
    MediaPlayer mediaPlayer23;
    MediaPlayer mediaPlayer24;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notificationtone);

        getSupportActionBar().setTitle("Notification Tone");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.lavender)));
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_arrow_back_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button button = findViewById(R.id.button1);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.beep_beep);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer1.isPlaying()){
                    mediaPlayer1.pause();
                } else {
                    mediaPlayer1.seekTo(0);
                    mediaPlayer1.start();
                }
            }
        });

        button = findViewById(R.id.button2);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.iphone_sound);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer2.isPlaying()){
                    mediaPlayer2.pause();
                } else {
                    mediaPlayer2.seekTo(0);
                    mediaPlayer2.start();
                }
            }
        });

        button = findViewById(R.id.button3);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.knock_knock);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer3.isPlaying()){
                    mediaPlayer3.pause();
                } else {
                    mediaPlayer3.seekTo(0);
                    mediaPlayer3.start();
                }
            }
        });


        button = findViewById(R.id.button4);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.notif_sound);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer4.isPlaying()){
                    mediaPlayer4.pause();
                } else {
                    mediaPlayer4.seekTo(0);
                    mediaPlayer4.start();
                }
            }
        });

        button = findViewById(R.id.button5);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.notifacation);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer5.isPlaying()){
                    mediaPlayer5.pause();
                } else {
                    mediaPlayer5.seekTo(0);
                    mediaPlayer5.start();
                }
            }
        });

        button = findViewById(R.id.button6);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.notification);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer6.isPlaying()){
                    mediaPlayer6.pause();
                } else {
                    mediaPlayer6.seekTo(0);
                    mediaPlayer6.start();
                }
            }
        });

        button = findViewById(R.id.button7);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.notification_sound);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer7.isPlaying()){
                    mediaPlayer7.pause();
                } else {
                    mediaPlayer7.seekTo(0);
                    mediaPlayer7.start();
                }
            }
        });

        button = findViewById(R.id.button8);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.notification_sound_eight);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer8.isPlaying()){
                    mediaPlayer8.pause();
                } else {
                    mediaPlayer8.seekTo(0);
                    mediaPlayer8.start();
                }
            }
        });

        button = findViewById(R.id.button9);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.notification_sound_fivemp3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer9.isPlaying()){
                    mediaPlayer9.pause();
                } else {
                    if(mediaPlayer9.getCurrentPosition() > 0){
                        mediaPlayer9.start();
                    } else {
                        mediaPlayer9.seekTo(0);
                        mediaPlayer9.start();
                    }
                }
            }
        });

        button = findViewById(R.id.button10);
        final MediaPlayer mediaPlayer10 = MediaPlayer.create(this,R.raw.notification_sound_four);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer10.isPlaying()){
                    mediaPlayer10.pause();
                } else {
                    mediaPlayer10.seekTo(0);
                    mediaPlayer10.start();
                }
            }
        });

        button = findViewById(R.id.button11);
        final MediaPlayer mediaPlayer11 = MediaPlayer.create(this,R.raw.notification_sound_nine);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer11.isPlaying()){
                    mediaPlayer11.pause();
                } else {
                    mediaPlayer11.seekTo(0);
                    mediaPlayer11.start();
                }
            }
        });

        button = findViewById(R.id.button12);
        final MediaPlayer mediaPlayer12 = MediaPlayer.create(this,R.raw.notification_sound_one);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer12.isPlaying()){
                    mediaPlayer12.pause();
                } else {
                    mediaPlayer12.seekTo(0);
                    mediaPlayer12.start();
                }
            }
        });

        button = findViewById(R.id.button13);
        final MediaPlayer mediaPlayer13 = MediaPlayer.create(this,R.raw.notifications_sound);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer13.isPlaying()){
                    mediaPlayer13.pause();
                } else {
                    mediaPlayer13.seekTo(0);
                    mediaPlayer13.start();
                }
            }
        });
        button = findViewById(R.id.button14);
        final MediaPlayer mediaPlayer14 = MediaPlayer.create(this,R.raw.notification_sound_seven);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer14.isPlaying()){
                    mediaPlayer14.pause();
                } else {
                    mediaPlayer14.seekTo(0);
                    mediaPlayer14.start();
                }
            }
        });

        button = findViewById(R.id.button15);
        final MediaPlayer mediaPlayer15 = MediaPlayer.create(this,R.raw.notification_sound_six);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer15.isPlaying()){
                    mediaPlayer15.pause();
                } else {
                    mediaPlayer15.seekTo(0);
                    mediaPlayer15.start();
                }
            }
        });

        button = findViewById(R.id.button16);
        final MediaPlayer mediaPlayer16 = MediaPlayer.create(this,R.raw.notification_sound_ten);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer16.isPlaying()){
                    mediaPlayer16.pause();
                } else {
                    mediaPlayer16.seekTo(0);
                    mediaPlayer16.start();
                }
            }
        });

        button = findViewById(R.id.button17);
        final MediaPlayer mediaPlayer17 = MediaPlayer.create(this,R.raw.notification_sound_three);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer17.isPlaying()){
                    mediaPlayer17.pause();
                } else {
                    mediaPlayer17.seekTo(0);
                    mediaPlayer17.start();
                }
            }
        });

        button = findViewById(R.id.button18);
        final MediaPlayer mediaPlayer18 = MediaPlayer.create(this,R.raw.notification_sound_two);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer18.isPlaying()){
                    mediaPlayer18.pause();
                } else {
                    mediaPlayer18.seekTo(0);
                    mediaPlayer18.start();
                }
            }
        });
        button = findViewById(R.id.button19);
        final MediaPlayer mediaPlayer19 = MediaPlayer.create(this,R.raw.r2d2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mediaPlayer19.isPlaying()){
                    mediaPlayer19.pause();
                } else  {
                    mediaPlayer19.seekTo(0);
                    mediaPlayer19.start();
                }
            }
        });

        button = findViewById(R.id.button20);
        final MediaPlayer mediaPlayer20 = MediaPlayer.create(this,R.raw.sku_sku_bts_v);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer20.isPlaying()){
                    mediaPlayer20.pause();
                } else {
                    mediaPlayer20.seekTo(0);
                    mediaPlayer20.start();
                }
            }
        });

        button = findViewById(R.id.button21);
        final MediaPlayer mediaPlayer21 = MediaPlayer.create(this,R.raw.sms);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer21.isPlaying()){
                    mediaPlayer21.pause();
                } else {
                    mediaPlayer21.seekTo(0);
                    mediaPlayer21.start();
                }
            }
        });

        button = findViewById(R.id.button22);
        final MediaPlayer mediaPlayer22 = MediaPlayer.create(this,R.raw.tu_sm2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer22.isPlaying()){
                    mediaPlayer22.pause();
                } else {
                    mediaPlayer22.seekTo(0);
                    mediaPlayer22.start();
                }
            }
        });

        button = findViewById(R.id.button23);
        final MediaPlayer mediaPlayer23 = MediaPlayer.create(this,R.raw.under_bottle_random);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer23.isPlaying()){
                    mediaPlayer23.pause();
                } else {
                    mediaPlayer23.seekTo(0);
                    mediaPlayer23.start();
                }
            }
        });

        button = findViewById(R.id.button24);
        final MediaPlayer mediaPlayer24 = MediaPlayer.create(this,R.raw.whistle_elle);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer24.isPlaying()){
                    mediaPlayer24.pause();
                } else {
                    mediaPlayer24.seekTo(0);
                    mediaPlayer24.start();
                }
            }
        });

    }
}