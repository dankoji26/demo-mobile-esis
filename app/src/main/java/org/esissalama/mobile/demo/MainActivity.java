package org.esissalama.mobile.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] des = {
                R.drawable.dice_1,
                R.drawable.dice_2,
                R.drawable.dice_3,
                R.drawable.dice_4,
                R.drawable.dice_5,
                R.drawable.dice_6
        };
        Button btn = findViewById(R.id.btn_1);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ImageView imgview = findViewById(R.id.img_1);
                        int rand_int = (int)(6 * Math.random() + 1);
                        for(int i=0; i < des.length; i++){
                            if(rand_int == i)
                                imgview.setImageResource(des[i]);
                        }
                    }
                }


        ) ;

    }
}