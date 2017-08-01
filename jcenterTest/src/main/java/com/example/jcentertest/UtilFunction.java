package com.example.jcentertest;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by liugaoxin on 2017/7/31.
 * for test jcenter upload
 */

public class UtilFunction {
    public static void showFrom(Context context) {
        Toast.makeText(context, "this from jcenter libray", Toast.LENGTH_SHORT).show();
    }
}
