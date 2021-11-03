package com.launcher.cachi.activitys;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.app.Activity;
import android.widget.Toast;
import android.service.dreams.DreamService;
import android.widget.ImageView;


import com.launcher.cachi.R;
import com.launcher.cachi.application.ClientApplication;
import com.launcher.cachi.cache.loader.ImageWorker;

import java.util.List;

public class LocalServiceFragment extends WoDouGameBaseFragment implements View.OnClickListener {

    private ImageWorker mImageLoader;
    private static final boolean d = ClientApplication.debug;
    private Context context;
    private List<ContentValues> datas;

    private ImageButton tour;
    private ImageButton tv;
    private ImageButton ad1;
    private ImageButton cate;
    private ImageButton weather;
    private ImageButton ad2;
    private ImageButton news;
    private ImageButton appStore;
    private ImageButton video;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_local_service, null);
        initView(view);
        return view;
    }

    private void initView(View view) {

        tv = (ImageButton) view.findViewById(R.id.local_tv);
        tour = (ImageButton) view.findViewById(R.id.local_tour);
//        ad1 = (ImageButton) view.findViewById(R.id.local_ad1);
        ad2 = (ImageButton) view.findViewById(R.id.local_ad2);
//        cate = (ImageButton) view.findViewById(R.id.local_cate);
//        weather = (ImageButton) view.findViewById(R.id.local_weather);
//        news = (ImageButton) view.findViewById(R.id.local_news);
//        appStore = (ImageButton) view.findViewById(R.id.local_app_store);
//        video = (ImageButton) view.findViewById(R.id.local_video);

        tv.setOnFocusChangeListener(mFocusChangeListener);
        tour.setOnFocusChangeListener(mFocusChangeListener);
//        ad1.setOnFocusChangeListener(mFocusChangeListener);
        ad2.setOnFocusChangeListener(mFocusChangeListener);
//        cate.setOnFocusChangeListener(mFocusChangeListener);
//        weather.setOnFocusChangeListener(mFocusChangeListener);
//        news.setOnFocusChangeListener(mFocusChangeListener);
//        appStore.setOnFocusChangeListener(mFocusChangeListener);
//        video.setOnFocusChangeListener(mFocusChangeListener);

        tv.setOnClickListener(this);
        tour.setOnClickListener(this);
        ad2.setOnClickListener(this);
//        video.setOnClickListener(this);

        tv.setFocusable(true);
        tv.setFocusableInTouchMode(true);
        tv.requestFocus();
        tv.requestFocusFromTouch();

        tour.setFocusable(true);
        tour.setFocusableInTouchMode(true);
        tour.requestFocus();
        tour.requestFocusFromTouch();

        ad2.setFocusable(true);
        ad2.setFocusableInTouchMode(true);
        ad2.requestFocus();
        ad2.requestFocusFromTouch();
    }

    private void showImages() {}

//    @Override
//    public void onAttachedToWindow () {
//        super.onAttachedToWindow();
//
//        setInteractive(false);
//        setFullscreen(true);
//
//        ImageView imageView = new ImageView(this);
//        imageView.setImageResource(R.drawable.dream);
//
//        setContentView(imageView);
//    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.local_tv:
                Toast.makeText(context, "TV player pressed",
                        Toast.LENGTH_SHORT).show();
                PackageManager manager = getActivity().getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("ar.tvplayer.tv");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {

                }
                break;
            case R.id.local_ad2:
                Toast.makeText(context, "Youtube player pressed",
                        Toast.LENGTH_SHORT).show();
                manager = getActivity().getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("com.android.chrome");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {

                }
                break;
//            case R.id.local_ad1:
//                break;
//            case R.id.local_weather:
//                break;
//            case R.id.local_app_store:
//                break;
//            case R.id.local_cate:
//                break;
//            case R.id.local_news:
//                break;
            case R.id.local_tour:
                Toast.makeText(context, "Youtube player pressed",
                        Toast.LENGTH_SHORT).show();
                manager = getActivity().getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("com.google.android.youtube");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {

                }

                break;
//            case R.id.local_video:
//                break;
        }
    }
}
