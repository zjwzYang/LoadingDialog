package com.example.loadingdialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

/**
 * Created by yfx on 16/10/31.
 */

public class LoadingDialog extends Dialog {
    public LoadingDialog(Context context) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setContentView(R.layout.loading);
        //是否设置当点击屏幕其他地方时,dialog消失
        //setCanceledOnTouchOutside(false);
    }
}
