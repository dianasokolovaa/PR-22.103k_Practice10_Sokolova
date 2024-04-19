package com.example.pr_22103k_sokolova_practice10;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

public class MyPicture extends View {

    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap1;
    private Bitmap mBitmap2;
    private Bitmap mBitmap3;
    private Bitmap mBitmap4;
    private Bitmap mBitmap5;

    public MyPicture(Context context) {
        super(context);

        //здесь вывести картинку из ресурсов
        Resources res = this.getResources();
        mBitmap1 = BitmapFactory.decodeResource(res, R.drawable.seastar1);
        mBitmap2 = BitmapFactory.decodeResource(res, R.drawable.seagrass);
        mBitmap3 = BitmapFactory.decodeResource(res, R.drawable.wave);
        mBitmap4 = BitmapFactory.decodeResource(res, R.drawable.walrus);
        mBitmap5 = BitmapFactory.decodeResource(res, R.drawable.fish1);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();


        //стиль
        mPaint.setStyle(Paint.Style.FILL);

        //залить холст белым
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        //море
        mPaint.setColor(Color.rgb(27, 85, 131));
        canvas.drawRect(0, height - 1000, width, height, mPaint);

        canvas.save();

        canvas.restore();

        //небо
        mPaint.setColor(Color.rgb(239, 152, 170));
        canvas.drawRect(0, height - 1000, width, height - 2230, mPaint);

        canvas.save();

        canvas.restore();

        //солнце
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.rgb(255,130,67));
        canvas.drawCircle(width - 250, 500, 200, mPaint);

        canvas.save();

        canvas.restore();

        //изображение 1 морская звезда
        canvas.drawBitmap(mBitmap1, width - mBitmap1.getWidth() + 50, height - mBitmap1.getHeight() - 10, mPaint);

        //изображение 3 волна
        canvas.drawBitmap(mBitmap3, width - mBitmap3.getWidth() - 150, height - 1650, mPaint);

        //изображение 4 морж
        canvas.drawBitmap(mBitmap4, width - mBitmap3.getWidth() - 200, height - mBitmap4.getHeight(), mPaint);

        //изображение 2 водоросли
        canvas.drawBitmap(mBitmap2, width - mBitmap2.getWidth() - 200, height - mBitmap2.getHeight() + 50, mPaint);

        //изображение 5 рыбы
        canvas.drawBitmap(mBitmap5, width - mBitmap5.getWidth() - 50, height - mBitmap5.getHeight() - 610, mPaint);
    }
}
