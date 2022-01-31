package com.abhaysapp.progressdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.airbnb.lottie.LottieAnimationView;

import org.w3c.dom.Text;

public class CustomDialog {

    Dialog dialog;
    Context context;
    public static final String STYLE_LOADING_DOTS = "STYLE_LOADING_DOTS";
    public static final String STYLE_LOADING_TILES = "STYLE_LOADING_TILES";
    public static final String STYLE_LOADING_GEARS = "STYLE_LOADING_GEARS";
    public static final String STYLE_LOADING_PLANE = "STYLE_LOADING_PLANE";
    public static final String STYLE_LOADING_EARTH = "STYLE_LOADING_EARTH";
    public static final String STYLE_LOADING_ROCKET = "STYLE_LOADING_ROCKET";
    public static final String STYLE_LOADING_CART = "STYLE_LOADING_CART";
    public static final String STYLE_LOADING_DELIVERY = "STYLE_LOADING_DELIVERY";
    public static final String STYLE_LOADING_SCOOTER = "STYLE_LOADING_SCOOTER";
    public static final String STYLE_LOADING_SIMPLE = "STYLE_LOADING_SIMPLE";
    public static final String STYLE_LOADING_SANDCLOCK = "STYLE_LOADING_SANDCLOCK";
    public static final String STYLE_LOADING_FERRISWHEEL = "STYLE_LOADING_FERRISWHEEL";
    public static final String STYLE_LOADING_WHEEL = "STYLE_LOADING_WHEEL";
    public static final String STYLE_LOADING_SPIDER = "STYLE_LOADING_SPIDER";
    public static final String STYLE_LOADING_BARS = "STYLE_LOADING_BARS";
    public static final String STYLE_LOADING_CIRCLE = "STYLE_LOADING_CIRCLE";
    public static final String STYLE_LOADING_CIRCLE2 = "STYLE_LOADING_CIRCLE2";

    public CustomDialog(Context context){
        this.context = context;
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.loading_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void addTitle(String title){
        TextView titleView = dialog.findViewById(R.id.titleView);
        titleView.setText(title);
    }

    public void isCancelable(boolean val){
        if (val){
            dialog.setCancelable(true);
        }
        else {
            dialog.setCancelable(false);
        }
    }

    public void setStyle(@NonNull String style){
        LottieAnimationView lottieAnimationView = dialog.findViewById(R.id.animation_view);
        switch (style){
            case STYLE_LOADING_TILES:
                lottieAnimationView.setAnimation(R.raw.loadingtiles);
                lottieAnimationView.playAnimation();
                break;
            case STYLE_LOADING_DOTS:
                lottieAnimationView.setAnimation(R.raw.loadingcirculardots);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_GEARS:
                lottieAnimationView.setAnimation(R.raw.loadinggears);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_PLANE:
                lottieAnimationView.setAnimation(R.raw.loadingpaperplane);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_EARTH:
                lottieAnimationView.setAnimation(R.raw.loading_earth);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_ROCKET:
                lottieAnimationView.setAnimation(R.raw.loadingrocket);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_CART:
                lottieAnimationView.setAnimation(R.raw.loadingcart);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_DELIVERY:
                lottieAnimationView.setAnimation(R.raw.loadingdelivery);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_SCOOTER:
                lottieAnimationView.setAnimation(R.raw.loadingscooter);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_SIMPLE:
                lottieAnimationView.setAnimation(R.raw.loadingsimple);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_SANDCLOCK:
                lottieAnimationView.setAnimation(R.raw.loadingsandclock);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_FERRISWHEEL:
                lottieAnimationView.setAnimation(R.raw.loadingferriswheel);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_WHEEL:
                lottieAnimationView.setAnimation(R.raw.loading_wheel);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_SPIDER:
                lottieAnimationView.setAnimation(R.raw.loadingspider);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_BARS:
                lottieAnimationView.setAnimation(R.raw.loadingbars);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_CIRCLE:
                lottieAnimationView.setAnimation(R.raw.loadingcircle);
                lottieAnimationView.playAnimation();
                break;

            case STYLE_LOADING_CIRCLE2:
                lottieAnimationView.setAnimation(R.raw.loadingthreecircles);
                lottieAnimationView.playAnimation();
                break;

            default:
                lottieAnimationView.setAnimation(R.raw.loadingsimple);
                lottieAnimationView.playAnimation();
                break;
        }
    }

    public void hideTitle(){
        TextView titleView = dialog.findViewById(R.id.titleView);
        titleView.setVisibility(View.GONE);
    }

    public void showDialog(){
        dialog.create();
        dialog.show();
    }

    public void setNoInternet(String title){
        LottieAnimationView lottieAnimationView = dialog.findViewById(R.id.animation_view);
        TextView titleView = dialog.findViewById(R.id.titleView);
        lottieAnimationView.setAnimation(R.raw.unplug);
        lottieAnimationView.playAnimation();
        if (title.isEmpty()){
            titleView.setVisibility(View.GONE);
        }else {
            titleView.setText(title);
        }
    }


    public void dismissDialog(){
        dialog.dismiss();
    }









}
