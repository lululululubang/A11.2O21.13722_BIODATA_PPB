package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import static java.net.Proxy.Type.HTTP;

public class MainActivity extends AppCompatActivity {

    TextView txt_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_desc = findViewById(R.id.txt_desc);
        txt_desc.setMovementMethod(new ScrollingMovementMethod());
    }

    public void alamat(View v) {
        Uri location = Uri.parse("geo:0,0?q=Jl.Sawah Besar VII NO.55, Gayamsari, Kaligawe");
        Intent it = new Intent(Intent.ACTION_VIEW, location);
        startActivity(it);
    }

    public void telpon(View v) {
        String no = "081329424096";
        Intent it = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + no));
        startActivity(it);
    }

    public void email(View v){
        Intent it = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "111202113722@mhs.dinus.ac.id", null));
        startActivity(Intent.createChooser(it, "Send email..."));
    }
}