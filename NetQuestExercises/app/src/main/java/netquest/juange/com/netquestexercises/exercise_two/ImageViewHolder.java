package netquest.juange.com.netquestexercises.exercise_two;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import butterknife.Bind;
import butterknife.ButterKnife;
import netquest.juange.com.netquestexercises.R;

/**
 * Created by juange on 21/7/15.
 */
public class ImageViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.img_load)
    public ImageView imageView;

    public ImageViewHolder(View item) {
        super(item);
        ButterKnife.bind(this, item);
    }
}
