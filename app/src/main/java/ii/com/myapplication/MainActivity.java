package ii.com.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    private EditText weight;
    private EditText height;
    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","Onclick");
                new AlertDialog.Builder(MainActivity.this).setTitle("HELP")
                        .setMessage("BMI is weight/(height*height)")
                        .setPositiveButton("OK", null).show();
            }
        });
    }

    private void findViews() {
        weight = findViewById(R.id.ed_weight);
        height = findViewById(R.id.ed_height);
        help = findViewById(R.id.b_help);


    }
    public  void bmi(View view){
        String w = weight.getText().toString();
        String h = height.getText().toString();
        Log.d("MainActivity","bmi");
        float edweight = Float.parseFloat(w);
        float edheight = Float.parseFloat(h);
        float bmi = edweight/(edheight*edheight);
        Log.d("MainActivity",w+"/"+h);

        Intent intent =new Intent(this,ResultActivity.class);
        intent.putExtra("result",bmi);
        startActivity(intent);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","onDestory");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","onRestart");
    }


}
