package netquest.juange.com.netquestexercises.exercise_two;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import java.util.List;
import netquest.juange.com.netquestexercises.R;

/**
 * Created by juange on 21/7/15.
 */
public class ImageViewAdapter extends RecyclerView.Adapter<ImageViewHolder> {

    private Context context;
    private List<String> urls;

    public ImageViewAdapter(Context context, List<String> urls) {
        this.context = context;
        this.urls = urls;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_image, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        final String url = urls.get(position);

        Glide.with(this.context)
             .load(url)
             .centerCrop()
//             .placeholder(R.drawable.loading_spinner)
             .crossFade()
             .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return urls.size();
    }
}
