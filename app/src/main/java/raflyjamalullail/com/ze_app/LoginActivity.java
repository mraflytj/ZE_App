package raflyjamalullail.com.ze_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    AppCompatButton btn_Login;
    TextView tv_Daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initialize();
    }

    public void initialize(){
        btn_Login = findViewById(R.id.buttonLogin);
        tv_Daftar = findViewById(R.id.tv_Daftardong);

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, HomeActActivity.class);
                startActivity(intent);

                finish();
            }
        });

        tv_Daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);

//                finish();
            }
        });
    }
}
