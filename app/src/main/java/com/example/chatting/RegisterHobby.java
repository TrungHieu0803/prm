package com.example.chatting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RegisterHobby extends AppCompatActivity {

    private static final String TAG = "RegisterHobby";

    //User Info
    Users userInfo;
    String password;

    private Context mContext;
    private Button hobbiesContinueButton;
    private Button sportsSelectionButton;
    private Button travelSelectionButton;
    private Button musicSelectionButton;
    private Button fishingSelectionButton;


    private String append = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_hobby);
        mContext = RegisterHobby.this;

        Log.d(TAG, "onCreate: started");

        Intent intent = getIntent();
        userInfo = (Users) intent.getSerializableExtra("classUser");
        password = intent.getStringExtra("password");

        initWidgets();

        init();
    }

    private void initWidgets() {
        sportsSelectionButton = findViewById(R.id.sportsSelectionButton);
        travelSelectionButton = findViewById(R.id.travelSelectionButton);
        musicSelectionButton = findViewById(R.id.musicSelectionButton);
        fishingSelectionButton = findViewById(R.id.fishingSelectionButton);
        hobbiesContinueButton = findViewById(R.id.hobbiesContinueButton);

        // Initially all the buttons needs to be grayed out so this code is added, on selection we will enable it later
        sportsSelectionButton.setAlpha(.5f);
        sportsSelectionButton.setBackgroundColor(Color.GRAY);

        travelSelectionButton.setAlpha(.5f);
        travelSelectionButton.setBackgroundColor(Color.GRAY);

        musicSelectionButton.setAlpha(.5f);
        musicSelectionButton.setBackgroundColor(Color.GRAY);

        fishingSelectionButton.setAlpha(.5f);
        fishingSelectionButton.setBackgroundColor(Color.GRAY);





    }



    public void init() {
        hobbiesContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();

            }
        });
    }
}