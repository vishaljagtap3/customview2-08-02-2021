package in.bitcode.customview2;

import android.content.Context;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WebImageView extends androidx.appcompat.widget.AppCompatImageView {

    private String mUri;

    public WebImageView(@NonNull Context context) {
        super(context);
    }

    public WebImageView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setImageURI(String uri) {
        mUri = uri;
        //start thread to download image
        setImageResource(R.drawable.bitcode_logo);
        new ImageDownloader().execute(uri);
    }

    private class ImageDownloader extends AsyncTask<String, Object, Integer> {
        @Override
        protected Integer doInBackground(String... uri) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return R.mipmap.ic_launcher;
        }

        @Override
        protected void onPostExecute(Integer imageId) {
            WebImageView.this.setImageResource(imageId);
        }
    }
}
