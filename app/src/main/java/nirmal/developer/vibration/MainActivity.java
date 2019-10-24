package nirmal.developer.vibration;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Vibrator Vibrator;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                btn= findViewById(R.id.button);


        Vibrator = (Vibrator)getSystemService(MainActivity.VIBRATOR_SERVICE);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                Vibrator.vibrate(10000);

            }});



    }
}
