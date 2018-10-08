package joelepinal.com.roboelectricdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button changeMessageButton;
    private TextView showMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMessageTextView = findViewById(R.id.textView_show_message);
        changeMessageButton = findViewById(R.id.button_change_message);

        changeMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessageTextView.setText("Hello World!");
            }
        });

    }
}
