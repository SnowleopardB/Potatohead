package com.example.potatohead;

import android.content.res.Configuration;
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
        if (savedInstanceState != null){
            ImageView shoes = (ImageView) findViewById((R.id.Shoes));
            shoes.setVisibility(savedInstanceState.getInt("Shoes"));

            ImageView mustache = (ImageView) findViewById((R.id.Mustache));
            mustache.setVisibility(savedInstanceState.getInt("Mustache"));

            ImageView arms = (ImageView) findViewById((R.id.Arms));
            arms.setVisibility(savedInstanceState.getInt("Arms"));

            ImageView eyes = (ImageView) findViewById((R.id.Eyes));
            eyes.setVisibility(savedInstanceState.getInt("eyes"));

            ImageView hat = (ImageView) findViewById((R.id.Hat));
            hat.setVisibility(savedInstanceState.getInt("Hat"));

            ImageView ears = (ImageView) findViewById((R.id.Ears));
            ears.setVisibility(savedInstanceState.getInt("Ears"));

            ImageView mouth = (ImageView) findViewById((R.id.Mouth));
            mouth.setVisibility(savedInstanceState.getInt("Mouth"));

            ImageView nose = (ImageView) findViewById((R.id.Nose));
            nose.setVisibility(savedInstanceState.getInt("Nose"));

            ImageView glasses = (ImageView) findViewById((R.id.Glasses));
            glasses.setVisibility(savedInstanceState.getInt("Glasses"));

            ImageView eyebrows = (ImageView) findViewById((R.id.Eyebrows));
            eyebrows.setVisibility(savedInstanceState.getInt("Eyebrows"));
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super

        ImageView shoes = (ImageView) findViewById((R.id.Shoes));
        outState.putInt("Shoes", shoes.getVisibility());

        ImageView mustache = (ImageView) findViewById((R.id.Mustache));
        outState.putInt("Mustache", mustache.getVisibility());

        ImageView eyes = (ImageView) findViewById((R.id.Eyes));
        outState.putInt("Eyes", eyes.getVisibility());

        ImageView ears = (ImageView) findViewById((R.id.Ears));
        outState.putInt("Ears", ears.getVisibility());

        ImageView hat = (ImageView) findViewById((R.id.Hat));
        outState.putInt("Hat", hat.getVisibility());

        ImageView mouth = (ImageView) findViewById((R.id.Mouth));
        outState.putInt("Mouth", mouth.getVisibility());

        ImageView nose = (ImageView) findViewById((R.id.Nose));
        outState.putInt("Nose", nose.getVisibility());

        ImageView glasses = (ImageView) findViewById((R.id.Glasses));
        outState.putInt("Glasses", glasses.getVisibility());

        ImageView arms = (ImageView) findViewById((R.id.Arms));
        outState.putInt("Arms", arms.getVisibility());

        ImageView eyebrows = (ImageView) findViewById((R.id.Eyebrows));
        outState.putInt("Eyebrows", eyebrows.getVisibility());
    }

    public void checkClicked(View view) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) view;
        String checkStr = checkbox.getText().toString();
        ImageView image = (ImageView) findViewById((R.id.Body));

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