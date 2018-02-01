package mx.edu.utng.mmacias.evaluacion1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

    }
    public void nextActivity5(View view) {
        startActivity(new Intent(this, mx.edu.utng.mmacias.evaluacion1.GridLayout.class));

    }
    public void nextActivity2(View view) {
        startActivity(new Intent(this, LinearLayout.class));

    }

}
