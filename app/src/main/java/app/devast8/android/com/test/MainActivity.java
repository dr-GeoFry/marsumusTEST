package app.devast8.android.com.test;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    Button buttonSettings, buttonBARTENDERS, buttonFITNESS, buttonChat, buttonCONCIERGE;
    ImageView imageView1, imageView2, imageView3, imageView4, imageView5;
    int selectedWorkerImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSettings = (Button) findViewById(R.id.buttonSettings);
        buttonFITNESS = (Button) findViewById(R.id.buttonFITNESS);
        buttonBARTENDERS = (Button) findViewById(R.id.buttonBARTENDERS);
        buttonChat = (Button) findViewById(R.id.buttonChat);
        buttonCONCIERGE = (Button) findViewById(R.id.buttonCONCIERGE);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);

        buttonSettings.setOnClickListener(this);
        buttonFITNESS.setOnClickListener(this);
        buttonCONCIERGE.setOnClickListener(this);
        buttonChat.setOnClickListener(this);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View src) {
        switch (src.getId()) {
            case R.id.buttonFITNESS:
                Intent intentFITNESS = new Intent(this, Fitness.class);
                startActivity(intentFITNESS);
                finish();
                break;
            case R.id.buttonSettings:
                Intent intentSETTINGS = new Intent(this, userSettings.class);
                startActivity(intentSETTINGS);
                finish();
                break;
            case R.id.buttonChat:
                Intent intentCHAT = new Intent(this, chatActivity.class);
                startActivity(intentCHAT);
                finish();
                break;
            case R.id.imageView1:
                Intent intentWorker = new Intent(this, viewWorker.class);
                startActivity(intentWorker);
                finish();
                break;
        }
    }
}