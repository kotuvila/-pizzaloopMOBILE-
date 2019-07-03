package com.example.pizzaloop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }
    public void goToCardPayment(View view) {
        Intent intent = new Intent(this, CardPaymentActivity.class);
        startActivity(intent);
    }

    public void goToMap(View view) {

        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    public void goToList(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void gotoDetailImage(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}
