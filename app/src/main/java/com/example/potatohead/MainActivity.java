package com.example.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View view) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) view;
        String checkStr = checkbox.getText().toString();
        ImageView image = (ImageView) findViewById((R.id.Arms));

        switch(checkStr){
            case "arms":
                image = (ImageView) findViewById((R.id.Arms));
                break;

            case "glasses":
                image = (ImageView) findViewById((R.id.Glasses));
                break;

            case "shoes":
                image = (ImageView) findViewById((R.id.Shoes));
                break;

            case "ears":
                image = (ImageView) findViewById((R.id.Ears));
                break;

            case "hat":
                image = (ImageView) findViewById((R.id.Hat));
                break;

            case "mouth":
                image = (ImageView) findViewById((R.id.Mouth));
                break;

            case "mustache":
                image = (ImageView) findViewById((R.id.Mustache));
                break;

            case "nose":
                image = (ImageView) findViewById((R.id.Nose));
                break;

            case "eyebrows":
                image = (ImageView) findViewById((R.id.Eyebrows));
                break;

            case "eyes":
                image = (ImageView) findViewById((R.id.Eyes));
                break;
        }

        if (checkbox.isChecked()){
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.INVISIBLE);
        }
    }


}