package css188.drake.myapplication2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button my_button;
    private EditText edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_button = (Button) findViewById(R.id.button);
        edit_text = (EditText) findViewById(R.id.editText);

        my_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("CS188", "Hello");
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();

                String input = edit_text.getText().toString();

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("value", input);
                startActivity(intent);
            }
        });
    }
}
