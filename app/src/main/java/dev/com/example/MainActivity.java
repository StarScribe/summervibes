package dev.com.example;

import android.net.nsd.NsdManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

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
              //  startActivity(new Intent(MainActivity.this, Main2Activity.class));
                runrequest();
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
public  void  runrequest (){
    RequestQueue queue = Volley.newRequestQueue(this);
    String url = "https://reqres.in/api/login";
    
    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest

            (Request.Method.POST, url, null, new Response.Listener<JSONObject>() {


                @Override
                public void onResponse(JSONObject response) {
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });
queue.add(jsonObjectRequest);

            }
    }


