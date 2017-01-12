package ksu4040e071.finaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        AdView adView = (AdView) this.findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()

        .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();


        adView.loadAd(adRequest);
    }

    public void onFdClick(View view) {
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        startActivity(new Intent(MyActivity.this ,Friends.class));
    }
    public void onEmClick(View view) {
        ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        startActivity(new Intent(MyActivity.this ,Employee.class));
    }

    public void ontabClick(View view){
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        startActivity(new Intent(this ,tabLayout.class));
    }

    public void onDetailClick(View view) {
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        startActivity(new Intent(MyActivity.this ,MasterActivity.class));
    }

    public void onPagerClick(View view) {
        ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        startActivity(new Intent(MyActivity.this ,viewPager.class));
    }

}
