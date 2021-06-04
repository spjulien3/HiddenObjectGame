package com.example.hiddenobjectgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] hiddenObjects = {
                R.drawable.cereal,
                R.drawable.energy_drink,
                R.drawable.hand_sanitzer,
                R.drawable.mask,
                R.drawable.wallet,
                R.drawable.blank
        };
        System.out.println(R.drawable.blank.);
        ImageButton[] imageButtons = {
                findViewById(R.id.placement1),
                findViewById(R.id.placement2),
                findViewById(R.id.placement3),
                findViewById(R.id.placement4),
                findViewById(R.id.placement5),
                findViewById(R.id.placement6),
                findViewById(R.id.placement7),
                findViewById(R.id.placement8)
        };
        for (int i = 0; i < imageButtons.length-1 ; i++) {
            imageButtons[i].setTag("blank");
        }
        int blankPlacements = 8;
        Random random = new Random(System.currentTimeMillis());

        int randomTemp = random.nextInt(8);
        int [] previousButtonIndex = new int[5];
        previousButtonIndex[0]=randomTemp;
        if(imageButtons[randomTemp].getTag()=="blank") {
            imageButtons[randomTemp].setImageResource(hiddenObjects[0]);
            imageButtons[randomTemp].setTag("cereal");
        }
        randomTemp = random.nextInt(8);
        previousButtonIndex[1]=randomTemp;
        if(imageButtons[randomTemp].getTag()=="blank") {
            imageButtons[randomTemp].setImageResource(hiddenObjects[1]);
        }
        randomTemp = random.nextInt(8);
        previousButtonIndex[2]=randomTemp;
        if(imageButtons[randomTemp].getTag()=="blank") {
            imageButtons[randomTemp].setImageResource(hiddenObjects[2]);
        }
        randomTemp = random.nextInt(8);
        previousButtonIndex[3]=randomTemp;
        if(imageButtons[randomTemp] =="blank") {
            imageButtons[randomTemp].setImageResource(hiddenObjects[3]);
        }
        randomTemp = random.nextInt(8);
        previousButtonIndex[4]=randomTemp;
        if(imageButtons[randomTemp].getTag()=="blank") {
            imageButtons[randomTemp].setImageResource(hiddenObjects[4]);
        }
    }
    public boolean checkRepeat(int x, int [] array){
        for (int i = 0; i < array.length-1; i++) {
            if(x == array[i]){
                return false;
            }
        }
        return true;
    }
}