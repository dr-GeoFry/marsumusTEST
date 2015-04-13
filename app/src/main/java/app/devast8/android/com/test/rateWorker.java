package app.devast8.android.com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class rateWorker extends Activity implements OnClickListener {
    Button button10, button15, button20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_worker);

        button10 = (Button) findViewById(R.id.button10);
        button15 = (Button) findViewById(R.id.button15);
        button20 = (Button) findViewById(R.id.button20);

        button10.setOnClickListener(this);
        button15.setOnClickListener(this);
        button20.setOnClickListener(this);
    }

    public void onClick(View src) {
        switch (src.getId()) {
            case R.id.textViewDone:
                Intent intentBACK = new Intent(this, MainActivity.class);
                startActivity(intentBACK);
                finish();
                break;
        }
    }
}
