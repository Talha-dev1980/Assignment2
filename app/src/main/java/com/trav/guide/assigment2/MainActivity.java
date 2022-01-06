package com.trav.guide.assigment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtVal1,edtVal2;
    private TextView tvAns;
    private Button btnAdd,btnMul,btnDiv,btnSub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        edtVal1=(EditText) findViewById( R.id.edtVal1 );
        edtVal2=(EditText) findViewById( R.id.edtVal2 );
        btnAdd=(Button) findViewById( R.id.btnAdd );
        btnSub=(Button) findViewById( R.id.btnSub );
        btnMul=(Button) findViewById( R.id.btnMul );
        btnDiv=(Button) findViewById( R.id.btnDiv );
        tvAns=(TextView) findViewById( R.id.tvAnswer );

        btnAdd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtVal1.getText().length()>0 && edtVal2.getText().length()>0){
                    int v1=Integer.parseInt( edtVal1.getText().toString() );
                    int v2=Integer.parseInt( edtVal2.getText().toString() );
                    String ans=v1+"+"+v2+"="+(v1+v2)+"";
                    tvAns.setText( ans );

                }
            }
        } );
        btnSub.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtVal1.getText().length()>0 && edtVal2.getText().length()>0){
                    int v1=Integer.parseInt( edtVal1.getText().toString() );
                    int v2=Integer.parseInt( edtVal2.getText().toString() );
                    String ans=v1+"-"+v2+"="+(v1-v2)+"";
                    tvAns.setText( ans+"" );

                }
            }
        } );
        btnMul.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtVal1.getText().length()>0 && edtVal2.getText().length()>0){
                    int v1=Integer.parseInt( edtVal1.getText().toString() );
                    int v2=Integer.parseInt( edtVal2.getText().toString() );
                    String ans=v1+"*"+v2+"="+(v1*v2)+"";
                    tvAns.setText( ans+"" );

                }
            }
        } );
        btnDiv.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtVal1.getText().length()>0 && edtVal2.getText().length()>0){
                    int v1=Integer.parseInt( edtVal1.getText().toString() );
                    int v2=Integer.parseInt( edtVal2.getText().toString() );
                    String ans=v1+"/"+v2+"="+(v1/v2)+"";
                    tvAns.setText( ans+"" );

                }
            }
        } );

    }
}