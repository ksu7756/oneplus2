package my.oneplus;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Menu1Fragment extends Fragment {

   public Menu1Fragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


       View v = inflater.inflate(R.layout.fragment_menu1, container, false);
       WebView webView = v.findViewById(R.id.WebView_01);
       webView.getSettings().setJavaScriptEnabled(true);
       webView.setWebViewClient(new WebViewClient());
       webView.loadUrl("http://cu.bgfretail.com/event/plus.do?category=event&depth2=1&sf=N");
       return v;





    }




}