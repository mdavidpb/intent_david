package id.sch.smktelkom_mlg.www.intent_david;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        txtResult = findViewById(R.id.textView);
        //get data
        if (getIntent().getExtras() != null) {
            String data = getIntent().getExtras().getString(MainActivity.EXTRA_DATA);
            txtResult.setText(data);
        }
    }
}