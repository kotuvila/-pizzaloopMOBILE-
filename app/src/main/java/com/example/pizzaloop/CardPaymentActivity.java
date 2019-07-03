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

import java.util.Date;

public class CardPaymentActivity extends AppCompatActivity {

    private static final String URL_DATA ="http://localhost:8080/pizzaloop/addorder?name="+"&address="+"&contactNumber="+"";
    private static String cardNo;
    private static String pinNo;
    private static Date expDate;
    EditText CardNo;
    EditText  PinNo;
    EditText  ExpDate;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_payment);
        CardNo=findViewById(R.id.txtCardNo);
        PinNo=findViewById(R.id.txtPinNo);
        ExpDate=findViewById(R.id.txtExpdate);

        confirm =(Button) findViewById(R.id.btnConfirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CardPaymentActivity.this, MapActivity.class);
                startActivity(intent);
                cardNo = String.valueOf(CardNo.getText());
                pinNo = String.valueOf(PinNo.getText());

                //date field ak date akat damima
               // expDate = String.valueOf(ExpDate.getText());
                StringRequest stringRequest = new StringRequest(Request.Method.GET,"http://172.19.19.113:8080/demo/addorder?cardNo="+cardNo+"&&pinNo="+pinNo+"&&expdate="+expDate+"",
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {

                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(CardPaymentActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
                        error.printStackTrace();
                    }
                });


                Volley.newRequestQueue(CardPaymentActivity.this).add(stringRequest);
                Toast.makeText(CardPaymentActivity.this, "Your payment is placed", Toast.LENGTH_LONG).show();


            }
        });
    }




}


