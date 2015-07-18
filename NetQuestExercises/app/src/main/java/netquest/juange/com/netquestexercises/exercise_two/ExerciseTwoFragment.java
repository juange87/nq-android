package netquest.juange.com.netquestexercises.exercise_two;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import netquest.juange.com.netquestexercises.R;
import netquest.juange.com.netquestexercises.base.BaseFragment;

/**
 * Created by juange on 18/7/15.
 */
public class ExerciseTwoFragment extends BaseFragment {

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
}
