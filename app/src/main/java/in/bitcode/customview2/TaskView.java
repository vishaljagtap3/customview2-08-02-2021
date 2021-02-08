package in.bitcode.customview2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class TaskView extends TextView {

    private int mMarginColor;
    private  Paint mPaint;

    public TaskView(Context context) {
        super(context);
        hookup();
    }

    public TaskView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        hookup();
    }

    private void hookup() {
        setPadding(80, 10, 10, 10);
        setTextSize(40);
        mMarginColor = Color.RED;
        mPaint = new Paint();
        mPaint.setColor(mMarginColor);
    }

    public int getMarginColor() {
        return mMarginColor;
    }

    public void setMarginColor(int marginColor) {
        this.mMarginColor = marginColor;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Log.e("tag", "onDraw()");

        canvas.drawLine(40, 0, 40, getBottom(), mPaint);
        canvas.drawLine(41, 0, 41, getBottom(), mPaint);
        canvas.drawLine(54, 0, 54, getBottom(), mPaint);
        canvas.drawLine(55, 0, 55, getBottom(), mPaint);
    }
}
