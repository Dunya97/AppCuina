package guerrero.com.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import org.w3c.dom.Text;

public class MainActivityApp1 extends AppCompatActivity {

    TextView titol;
    EditText username;
    EditText password;
    Button login;
    TextView dont,logging;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app1);

        //Vinculem els elements amb l'activity main(instanciar)
        titol = (TextView)findViewById(R.id.titol);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);
        dont = (TextView)findViewById(R.id.dont);
        register = (Button)findViewById(R.id.register);
        logging = (TextView)findViewById(R.id.logging);


        //accions
        login.setOnClickListener(new View.OnClickListener() {
            //Qué passa quan apreten el botó
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                logging.setText("Logging in as " +user);

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrar = new Intent(MainActivityApp1.this, mainRegistrar.class);
            }
        });
    }
}
