package netquest.juange.com.netquestexercises.exercise_one;

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
public class ExerciseOneFirstStepFragment extends BaseFragment {

    public ExerciseOneFirstStepFragment() {}

    public static ExerciseOneFirstStepFragment newInstance() {
        return new ExerciseOneFirstStepFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View containerView = inflater.inflate(R.layout.fragment_exercise_one, container, false);
        ButterKnife.bind(this, containerView);
        return containerView;
    }
}