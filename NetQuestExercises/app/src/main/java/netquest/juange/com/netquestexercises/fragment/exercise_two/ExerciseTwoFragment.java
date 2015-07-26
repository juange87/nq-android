package netquest.juange.com.netquestexercises.fragment.exercise_two;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;
import netquest.juange.com.netquestexercises.R;
import netquest.juange.com.netquestexercises.adapter.ImageViewAdapter;
import netquest.juange.com.netquestexercises.base.BaseFragment;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by juange on 18/7/15.
 */
public class ExerciseTwoFragment extends BaseFragment {

    private static final String API_URL = "https://www.nicequest.com/portal_nicequest_api/DocumentServlet?docid=";

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;

    public ExerciseTwoFragment() {}

    public static ExerciseTwoFragment newInstance() {
        return new ExerciseTwoFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View containerView = inflater.inflate(R.layout.fragment_exercise_two, container, false);
        ButterKnife.bind(this, containerView);
        return containerView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        Resources res = getResources();
        String[] urlIds = res.getStringArray(R.array.url_ids);
        Observable.from(urlIds)
                  .subscribeOn(Schedulers.computation())
                  .observeOn(AndroidSchedulers.mainThread())
                  .map(API_URL::concat)
                  .toList()
                  .map(strings -> new ImageViewAdapter(getActivity(), strings))
                  .subscribe(
                          recyclerView::setAdapter,
                          this::manageError
                  );
    }

    private void manageError(Throwable throwable) {
        Toast.makeText(getActivity(), throwable.getLocalizedMessage(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
