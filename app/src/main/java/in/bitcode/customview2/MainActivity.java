package in.bitcode.customview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private WebImageView mWebImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebImageView = findViewById(R.id.webImageView);
        mWebImageView.setImageURI("http://bitcode.in/image.jpg");
    }
}