package dev.com.example;

import android.net.nsd.NsdManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button Login;
    EditText EmailView;
    EditText pass;

    EditText username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));

            }
        });
        EmailView = findViewById(R.id.EmailView);
        pass = findViewById(R.id.pass);
        Login = findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         String password = pass.getText().toString();
                                         String user = EmailView.getText().toString();
                                         String text = user + ":" + password;
                                         Toast.makeText(MainActivity.this,text, Toast.LENGTH_SHORT).show();
                                     }
                                 }
        );
}
    }
