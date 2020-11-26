package ab.myassignment5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.call);
                tv = findViewById(R.id.showText);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,MainActivity4.class);
                        startActivityForResult(i,2);

                    }
                });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2 && resultCode == RESULT_OK && data.getData() != null) {
            String NAME =data.getStringExtra("NAME");
            tv.setText(NAME);
        }
    }

    public void Move(View v){
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        String name;
        int[] value;
        i.putExtra("NAME", "TechiLoft");
        startActivity(i);
        finish();

    }
}