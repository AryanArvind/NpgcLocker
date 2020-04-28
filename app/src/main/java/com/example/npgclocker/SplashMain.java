package com.example.npgclocker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashMain extends AppCompatActivity {
    Button button;
    Animation frombutton,fromtop;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_main);

        button = findViewById(R.id.request);
        //logo = findViewById(R.id.logo);
        frombutton = AnimationUtils.loadAnimation(this, R.anim.frombutton);
        fromtop = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        logo = findViewById(R.id.logo);
        button.setAnimation(frombutton);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView8 = findViewById(R.id.textView8);

        textView4.setAnimation(fromtop);
        textView8.setAnimation(frombutton);
        logo.setAnimation(fromtop);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(SplashMain.this,ChoiceSelection.class);
               startActivity(intent);
           }
       });

    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            //SplashScreen finished without manual canceling
        } else if (resultCode == RESULT_CANCELED) {
            //SplashScreen finished through manual canceling
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            finish();

        }
        super.onActivityResult(requestCode, resultCode, data);
    }*/
}
