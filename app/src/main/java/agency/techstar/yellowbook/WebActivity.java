package agency.techstar.yellowbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Intent iGet = getIntent();
        String org_web = iGet.getStringExtra("org_web");
        WebView webb = (WebView)findViewById(R.id.web);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl(org_web);
    }
}
