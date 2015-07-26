package netquest.juange.com.netquestexercises.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import butterknife.ButterKnife;
import butterknife.OnClick;
import netquest.juange.com.netquestexercises.R;
import netquest.juange.com.netquestexercises.base.BaseFragment;
import netquest.juange.com.netquestexercises.fragment.exercise_one.ExerciseOneFirstStepFragment;
import netquest.juange.com.netquestexercises.fragment.exercise_two.ExerciseTwoFragment;

/**
 * Created by juange on 18/7/15.
 */
public class MainFragment extends BaseFragment {

    public MainFragment() {}

    public static MainFragment newInstance() {
        return new MainFragment();
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View containerView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, containerView);
        return containerView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.btn_exercise_one)
    public void onButtonOneClick(Button button){
        getMainActivity().replaceFragment(ExerciseOneFirstStepFragment.newInstance());
    }

    @OnClick(R.id.btn_exercise_two)
    public void onButtonTwoClick(Button button){
        getMainActivity().replaceFragment(ExerciseTwoFragment.newInstance());
    }
}
