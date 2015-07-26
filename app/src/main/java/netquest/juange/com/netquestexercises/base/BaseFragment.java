package netquest.juange.com.netquestexercises.base;

import android.support.v4.app.Fragment;
import netquest.juange.com.netquestexercises.activity.MainActivity;

/**
 * Created by juange on 18/7/15.
 */
public abstract class BaseFragment extends Fragment {

    public MainActivity getMainActivity() {
        if (getActivity() instanceof MainActivity) {
            return ((MainActivity) getActivity());
        }
        return null;
    }
}
