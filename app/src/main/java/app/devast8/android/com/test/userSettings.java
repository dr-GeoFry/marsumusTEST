package app.devast8.android.com.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class userSettings extends Activity implements OnClickListener {
    //Button buttonBARTENDERS, buttonFITNESS;
    //ImageButton imageButtonBack;
    TextView textViewDONE;
    EditText editFIRSTNAME, editLASTName, editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_settings);

        //imageButtonBack = (ImageButton) findViewById(R.id.imageButtonBack);
        textViewDONE = (TextView) findViewById(R.id.textViewDone);

        editFIRSTNAME = (EditText) findViewById(R.id.editFIRSTNAME);
        editLASTName = (EditText) findViewById(R.id.editLASTName);
        editEmail = (EditText) findViewById(R.id.editEmail);

        textViewDONE.setOnClickListener(this);
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
