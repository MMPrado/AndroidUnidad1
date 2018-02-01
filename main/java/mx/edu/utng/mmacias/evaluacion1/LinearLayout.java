package mx.edu.utng.mmacias.evaluacion1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinearLayout extends AppCompatActivity {
    private EditText edtName;
    private EditText edtAge;
    private EditText edtPhone;
    private Button btnSubmit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        edtName = (EditText)findViewById(R.id.edt_name);
        edtAge = (EditText)findViewById(R.id.edt_age);
        edtPhone = (EditText)findViewById(R.id.edt_phone);
        btnSubmit = (Button) findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =
                        new Intent(LinearLayout.this, RelativeLayout.class);


                Bundle b = new Bundle();
                b.putString("name", edtName.getText().toString());
                b.putString("age", edtAge.getText().toString());
                b.putString("phone", edtPhone.getText().toString());

                intent.putExtras(b);


                startActivity(intent);
            }
        });
    }

    }



