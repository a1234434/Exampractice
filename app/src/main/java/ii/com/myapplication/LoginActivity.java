package ii.com.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.AlteredCharSequence;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void login(View view){
        EditText user = findViewById(R.id.userid);
        EditText pass =findViewById(R.id.pasw);
        String u =user.getText().toString();
        String p =pass.getText().toString();
        if(u.equals("Judy")&&p.equals("1234")){
            Toast.makeText(this,"登入成功",Toast.LENGTH_LONG).show();
            setResult(RESULT_OK);
            finish();
        }else {
            new AlertDialog.Builder(this).setMessage("登入失敗").setTitle("Login")
                    .setPositiveButton("Ok",null).show();
        }
    }
}
