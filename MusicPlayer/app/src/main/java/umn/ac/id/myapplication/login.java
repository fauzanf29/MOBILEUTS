package umn.ac.id.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;




public class login extends AppCompatActivity {


    Button btnLogin;
    EditText User, Password;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);



        btnLogin = (Button) findViewById(R.id.btnLogin);
        User = (EditText) findViewById(R.id.editUser);
        Password= (EditText) findViewById(R.id.editPass);




        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                if (User.getText().toString().equals("uasmobile") &&
                        Password.getText().toString().equals("uasmobilegenap"))
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                else {


                    Toast.makeText(getApplicationContext(), "Username atau Password Anda Salah",

                            Toast.LENGTH_SHORT).show();


                }
                btnLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        Intent intent = new Intent(login.this, musicplayer.class);
                        startActivity(intent);
                        setResult(RESULT_OK, null);
                        finish();
                    }
                });

            }
        });



    }
}