package mx.edu.utng.mmacias.evaluacion1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RelativeLayout extends AppCompatActivity {
private TextView txtMsj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
txtMsj=(TextView)findViewById(R.id.txt_msj);

Bundle bundle =this.getIntent().getExtras();

txtMsj.setText(bundle.getString("name")+","+bundle.getString("age")+","+bundle.getString("phone"));

    }

}
