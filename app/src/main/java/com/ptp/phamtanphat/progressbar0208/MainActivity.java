package com.ptp.phamtanphat.progressbar0208;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    Button btnprogressbar;
    CountDownTimer countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        btnprogressbar = (Button) findViewById(R.id.buttondownload);
        Toast.makeText(this, "Show man hinh", Toast.LENGTH_SHORT).show();
        btnprogressbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 countDownTimer = new CountDownTimer(6000,500) {
                    @Override
                    public void onTick(long l) {
                        int curent = progressBar.getProgress();
//                Toast.makeText(MainActivity.this, curent + "", Toast.LENGTH_SHORT).show();
                        if (curent == 100){
                            curent = 0;
                        }
                        progressBar.setProgress(curent + 10);
                    }

                    @Override
                    public void onFinish() {
                        this.start();
                        Toast.makeText(MainActivity.this, "Het gio", Toast.LENGTH_SHORT).show();
                    }
                };
                countDownTimer.start();

            }
        });
    }
}
