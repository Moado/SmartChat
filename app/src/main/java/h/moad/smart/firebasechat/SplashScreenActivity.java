package h.moad.smart.firebasechat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;


import java.util.Timer;
import java.util.TimerTask;


public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent go = new Intent(SplashScreenActivity.this, Login.class);
                startActivity(go);
                finish();
            }
        }, 5000);
    }
}
