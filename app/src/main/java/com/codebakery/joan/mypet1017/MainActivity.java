package com.codebakery.joan.mypet1017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chkAgree;
    RadioGroup rdoGroup;
    RadioButton rdoDog, rdoCat, rdoFox;
    Button btnOk;
    Button btnNext;
    ImageView imgPet;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.chkAgree = (CheckBox) findViewById(R.id.chkAgree);
        this.textView = (TextView) findViewById(R.id.textView);
        this.rdoGroup = (RadioGroup) findViewById(R.id.rdoGroup);
        this.rdoDog = (RadioButton) findViewById(R.id.rdoDog);
        this.rdoCat = (RadioButton) findViewById(R.id.rdoCat);
        this.rdoFox = (RadioButton) findViewById(R.id.rdoFox);
        this.btnOk = (Button) findViewById(R.id.btnOk);
        this.imgPet = (ImageView) findViewById(R.id.imgPet);
        this.btnNext = (Button) findViewById(R.id.btnNext);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked()){
                    textView.setVisibility(View.VISIBLE);
                    rdoGroup.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                } else{
                    textView.setVisibility(View.INVISIBLE);
                    rdoGroup.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rdoGroup.getCheckedRadioButtonId()){
                    case R.id.rdoDog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.rdoCat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rdoFox:
                        imgPet.setImageResource(R.drawable.fox);
                        break;
                        default:
                            Toast.makeText(getApplication(),"동물을 선택하세요",Toast.LENGTH_SHORT).show();

                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
