package id.sch.smktelkom_mlg.www.intent_david;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_DATA = "EXTRA_DATA";
    private EditText editText;
    private Button btnSenData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        btnSenData = findViewById(R.id.button);
        btnSenData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, TargetActivity.class);
                intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });
    }
}
