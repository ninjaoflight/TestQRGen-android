package net.xravn.testqr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    EditText txtContent;
    ImageView imgQr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents() {
        txtContent = findViewById(R.id.txt_qr_input);
        imgQr = findViewById(R.id.imageView_qr_image);
        onWindowFocusChanged(true);
    }


    public void onBtnCreateQrClicked(View v) {
        QRGenerator.setQR(txtContent.getText().toString(), imgQr);
    }
}