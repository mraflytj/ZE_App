package raflyjamalullail.com.ze_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity2 extends AppCompatActivity {

    private EditText editTextNama, editTextEmail, editTextNomorTelepon, editTextPassword, editTextConfirmPassword;
    private AppCompatButton btnDaftar;
    private ProgressBar progressBar;
    private static String URL_REGIST = "http://localhost:8000/register";
    private String nama, email, nomorTelepon, password, confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        initialize();

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password != confirmPassword){
                    progressBar.setVisibility(View.VISIBLE);
                    btnDaftar.setVisibility(View.GONE);
                    Toast.makeText(RegisterActivity2.this, "Password Kamu Tidak Sesuai", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    btnDaftar.setVisibility(View.VISIBLE);

                }else{
                    regist();
                    Intent intent = new Intent(RegisterActivity2.this, HomeActActivity.class);
                    startActivity(intent);

                    finish();

                }
            }
        });
    }

    private void initialize(){
        btnDaftar = findViewById(R.id.btnDaftar);
        progressBar = findViewById(R.id.pb_loading);
        editTextNama = findViewById(R.id.ed_Nama);
        editTextConfirmPassword = findViewById(R.id.ed_PassUlang);
        editTextEmail = findViewById(R.id.ed_Email);
        editTextNomorTelepon = findViewById(R.id.ed_Telp);
        editTextPassword = findViewById(R.id.ed_Pass);

        this.nama = this.editTextNama.getText().toString();
        this.email = this.editTextEmail.getText().toString();
        this.password = this.editTextPassword.getText().toString();
        this.nomorTelepon = this.editTextNomorTelepon.getText().toString();
        this.confirmPassword = this.editTextConfirmPassword.getText().toString();

    }
    private void regist(){
        progressBar.setVisibility(View.VISIBLE);
        btnDaftar.setVisibility(View.GONE);

//        change Edit text to String

//        make String Request

        StringRequest stringRequest =  new StringRequest(Request.Method.POST, URL_REGIST, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject jsonObject = new JSONObject(response);
                    String success = jsonObject.getString("success");
                    if (success.equals("1")){
                        Toast.makeText(RegisterActivity2.this, "Pendaftaran berhasil!", Toast.LENGTH_SHORT).show();
                    }
                }catch (JSONException e){
                    e.printStackTrace();
                    Toast.makeText(RegisterActivity2.this, "Pendaftaran gagal! "+ e.toString(), Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    btnDaftar.setVisibility(View.VISIBLE);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(RegisterActivity2.this, "Pendaftaran gagal! "+ error.toString(), Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.GONE);
                btnDaftar.setVisibility(View.VISIBLE);
            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("name", nama);
                params.put("email", email);
                params.put("no_telp", nomorTelepon);
                params.put("password", password);
                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }
}
