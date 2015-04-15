package app.devast8.android.com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Fitness extends Activity implements OnClickListener {
    //Button buttonBARTENDERS, buttonFITNESS;
    //ImageButton imageButtonBack;
    TextView textViewBACK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);

        //imageButtonBack = (ImageButton) findViewById(R.id.imageButtonBack);
        textViewBACK = (TextView) findViewById(R.id.textViewBACK);

        textViewBACK.setOnClickListener(this);
    }

    public void onClick(View src) {
        switch (src.getId()) {
            case R.id.textViewBACK:
                Intent intentBACK = new Intent(this, MainActivity.class);
                startActivity(intentBACK);
                finish();
                break;
        }
    }
}
