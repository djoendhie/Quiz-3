package id.co.djoendhie.month;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etBln1;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBln1 = (EditText) findViewById(R.id.etBln1);
        button = (Button) findViewById(R.id.btnCare);
        textView = (TextView) findViewById(R.id.txtBulan);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Bln = etBln1.getText().toString();

                if (Bln.isEmpty()) {
                    etBln1.setError("jgn Empty");
                }else {

                    if (Bln.equalsIgnoreCase("january")) {
                        textView.setText("Bulan 1" );
                    } else if (Bln.equalsIgnoreCase("February")) {
                        textView.setText("Bulan 2");
                    } else if (Bln.equalsIgnoreCase("March")) {
                        textView.setText("Bulan 3");
                    } else if (Bln.equalsIgnoreCase("Aprel")) {
                        textView.setText("Bulan 4");
                    } else if (Bln.equalsIgnoreCase("May")) {
                        textView.setText("Bulan 5");
                    } else if (Bln.equalsIgnoreCase("June")) {
                        textView.setText("Bulan 6");
                    } else if (Bln.equalsIgnoreCase("July")) {
                        textView.setText("Bulan 7");
                    } else if (Bln.equalsIgnoreCase("August")) {
                        textView.setText("Bulan 8");
                    } else if (Bln.equalsIgnoreCase("September")) {
                        textView.setText("Bulan 9");
                    } else if (Bln.equalsIgnoreCase("October")) {
                        textView.setText("Bulan 10");
                    } else if (Bln.equalsIgnoreCase("November")) {
                        textView.setText("Bulan 11");
                    } else if (Bln.equalsIgnoreCase("December")) {
                        textView.setText("Bulan 12");
                    }else {
                        textView.setText("Salah Nama");
                    }



                }
            }
        });


    }
}
