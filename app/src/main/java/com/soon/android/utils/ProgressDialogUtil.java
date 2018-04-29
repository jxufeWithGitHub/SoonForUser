package com.soon.android.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.service.quicksettings.Tile;

/**
 * Created by LYH on 2018/3/8.
 */

public class ProgressDialogUtil {
    
    public static ProgressDialog getProgressDialog(Context context, String title, String message, boolean cancelable){
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle(title);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(cancelable);
        return progressDialog;
    }
}
