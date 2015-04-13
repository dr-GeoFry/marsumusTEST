package app.devast8.android.com.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class viewWorker extends ActionBarActivity implements View.OnClickListener {
    ImageView display;

    Button buttonBookWorker, buttonFavorites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_worker);

        display = (ImageView) findViewById(R.id.imageViewWorker);
        display.setImageResource(this.getIntent().getIntExtra("caddyImage", 0));

        buttonBookWorker = (Button) findViewById(R.id.buttonBookWorker);
        buttonFavorites = (Button) findViewById(R.id.buttonFavorites);

        buttonBookWorker.setOnClickListener(this);
        buttonFavorites.setOnClickListener(this);


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
            case R.id.buttonBookWorker:
                Intent intentBookWorker = new Intent(this, rateWorker.class);
                startActivity(intentBookWorker);
                finish();
                break;

        }
    }
}