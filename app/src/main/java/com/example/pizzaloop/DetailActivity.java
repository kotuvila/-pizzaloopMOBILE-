package com.example.pizzaloop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    CardView small;
    TextView pizzaname, pizzaprice, pizzadescription, allprice1;
    ImageView pizzaimage;
    Button Buy;

    String Pizzaname1;
    String PizzaDescription1;
    String Imageurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        pizzaname = findViewById(R.id.name);
        pizzadescription = findViewById(R.id.description);
        pizzaprice = findViewById(R.id.price);
        pizzaimage = findViewById(R.id.image);
        Buy = findViewById(R.id.btnBuy);

        //getting data from homeActivity
        Intent intent = getIntent();
        final String imgurl = intent.getStringExtra("IMG");
        final Double pizzaprice1 = intent.getDoubleExtra("PRICE", 0.00);
        final String pizzaname1 = intent.getStringExtra("NAME");
        final String pizzadescription1 = intent.getStringExtra("DETAILS");


        //assign homeActivity data to DetailsActivity's variables
        Imageurl = imgurl;
        PizzaDescription1 = pizzadescription1;
        Pizzaname1 = pizzaname1;


        //setting data to xml file
        Glide.with(DetailActivity.this).load(imgurl).into(pizzaimage);

        pizzaname.setText(pizzaname1);
        pizzadescription.setText(pizzadescription1);
        pizzaprice.setText("Rs." + pizzaprice1);


        Buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(DetailActivity.this, OrderDetailActivity.class);
                finish();
                startActivity(intent1);

            }
        });
    }

}

