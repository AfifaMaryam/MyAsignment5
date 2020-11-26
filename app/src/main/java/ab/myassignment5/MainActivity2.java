package ab.myassignment5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.security.Key;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    String Name="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle =getIntent().getExtras();
        if(bundle != null) {
            String key;
            Name = bundle.getString("NAME");
        }
        tv = findViewById(R.id.showText);
    }
}