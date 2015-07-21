package netquest.juange.com.netquestexercises.exercise_two;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import netquest.juange.com.netquestexercises.R;

/**
 * Created by juange on 21/7/15.
 */
public class ImageViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;

    public ImageViewHolder(View item) {
        super(item);
        imageView = (ImageView) item.findViewById(R.id.img_load);
    }
}
