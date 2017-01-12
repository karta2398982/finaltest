package ksu4040e071.finaltest;



import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Handler;
import android.view.View;

public class login extends Activity {

    private ProgressDialog progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent().setClass(login.this, MainActivity.class));
            }
        }, 6000);
        //登入畫面的時間

        progress = new ProgressDialog(this);

        progress.setMessage("下載中．．． 請稍等");
        //載入視窗的訊息
        progress.setTitle("期末考");
        //標題
        progress.setIcon(R.drawable.slide1);
        //
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        //載入視窗格式設定為水平進度條

        //progress.setIndeterminate(true);

        progress.show();

        final int totalProgressTime = 100;
        //進度值

        final Thread t = new Thread(){

            @Override
            public void run(){

                int jumpTime = 0;
                while(jumpTime < totalProgressTime){
                    try {
                        sleep(200);
                        jumpTime += 5;
                        progress.setProgress(jumpTime);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }

            }
        };
        t.start();



    }
}
