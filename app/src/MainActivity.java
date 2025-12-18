package  com.fadcam;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // ஆப்-ன் பிரதான திரையை அமைத்தல்
        setContentView(R.layout.activity_main);

        // --- நீங்கள் கேட்ட பனோரமா பட்டன் இங்கே தொடங்குகிறது ---
        
        Button panoButton = new Button(this);
        panoButton.setText("Panorama");
        
        // பட்டனின் அளவு மற்றும் இடத்தை முடிவு செய்தல்
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        
        // பட்டனை கிளிக் செய்தால் என்ன நடக்க வேண்டும்?
        panoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, 
                    "விமல், பனோரமா வசதி இன்னும் இணைக்கப்படவில்லை. பட்டன் மட்டும் தயாராக உள்ளது!", 
                    Toast.LENGTH_LONG).show();
            }
        });

        // பட்டனை திரையில் சேர்த்தல்
        addContentView(panoButton, params);
        
        // --- பனோரமா பட்டன் குறியீடு முடிகிறது ---
    }
}
