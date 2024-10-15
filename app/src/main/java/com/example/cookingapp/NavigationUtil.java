package com.example.cookingapp;



import android.app.Activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class NavigationUtil {

    // Phương thức chung để xử lý quay lại
    public static void handleBackNavigation(Fragment fragment) {
        FragmentManager fragmentManager = fragment.getParentFragmentManager();
        // Nếu đang ở trong Fragment, thì quay lại Fragment trước đó
        if (fragmentManager.getBackStackEntryCount() > 0) {
            fragmentManager.popBackStack();
        } else {
            // Nếu không phải Fragment, thì quay lại Activity trước đó
            Activity activity = fragment.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }
}

