package id.co.djoendhie.quizavg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNilai1, etNilai2, etNilai3, etNilai4;
    Button button;
    TextView textView, textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNilai1 = (EditText)findViewById(R.id.etNilai1);
        etNilai2 = (EditText)findViewById(R.id.etNilai2);
        etNilai3 = (EditText)findViewById(R.id.etNilai3);
        etNilai4 = (EditText)findViewById(R.id.etNilai4);
        button = (Button)findViewById(R.id.btnCare);
        textView = (TextView)findViewById(R.id.txtHasel);
        textView1 = (TextView)findViewById(R.id.txtRata);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nNilai1 = etNilai1.getText().toString();
                String nNilai2 = etNilai2.getText().toString();
                String nNilai3 = etNilai3.getText().toString();
                String nNilai4 = etNilai4.getText().toString();

                if (nNilai1.isEmpty()) {
                    etNilai1.setError("jgn EMpty");
                }else {

                    int aNilai1 = Integer.parseInt(nNilai1);
                    int aNilai2 = Integer.parseInt(nNilai2);
                    int aNilai3 = Integer.parseInt(nNilai3);
                    int aNilai4 = Integer.parseInt(nNilai4);

                    int Rata = (aNilai1 + aNilai2 + aNilai3 +aNilai4 ) / 4;
                    if ((Rata >= 0) && (Rata <= 40)) {

                        textView.setText("Rata-Rata = " + " " + Rata);
                        textView1.setText("Grade D ");
                    }else if ((Rata >= 41) && (Rata <= 65)){
                        textView1.setText("Grade C ");
                        textView.setText("Rata-Rata = " + " " + Rata);
                    }else if ((Rata >= 66) && (Rata <= 80)){
                        textView.setText("Rata-Rata = " + " " + Rata);
                        textView1.setText("Grade B ");
                    }else if ((Rata >= 81) && (Rata <= 100)){
                        textView.setText("Rata-Rata = " + " " + Rata);
                        textView1.setText("Grade A ");
                    }




                }
            }
        });


    }
}
