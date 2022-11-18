package com.example.newshouse.Fragments;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newshouse.R;
import com.example.newshouse.WebViewController;


public class Tensports extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tensports, container, false);
        WebView webView = view.findViewById(R.id.webViewten);
        webView.loadUrl("https://www.tensportstv.com/");
        webView.setWebViewClient(new WebViewController());
        return view;
        
    }

}