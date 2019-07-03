package com.example.pizzaloop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.jar.Attributes;

public class LoginActivity extends AppCompatActivity {

    private static String username;
    private static String password;
    EditText UserName;
    EditText Password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        UserName = (EditText) findViewById(R.id.txtName);
        Password = (EditText) findViewById(R.id.txtPassword);
        Login = (Button) findViewById(R.id.btnLogin);

    }


  /*  public void validateUser(String Username, String Password) {
        if (!(Username.equals"admin") && (Password.equals== "123")) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else
            Toast.makeText(LoginActivity.this, "Enter correct username and password", Toast.LENGTH_LONG).show();
    }
*/
    public void goToMain(View view) {
        Toast.makeText(LoginActivity.this, "you are logged ", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    }




