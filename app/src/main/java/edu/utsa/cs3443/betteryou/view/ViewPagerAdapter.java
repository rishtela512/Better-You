package edu.utsa.cs3443.betteryou.view;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import edu.utsa.cs3443.betteryou.controller.LoginTabFragment;
import edu.utsa.cs3443.betteryou.controller.SignupTabFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Return appropriate fragment based on the position
        if (position == 1) {
            return new SignupTabFragment(); // Signup fragment for the second tab
        }
        return new LoginTabFragment(); // Login fragment for the first tab
    }

    @Override
    public int getItemCount() {
        return 2; // Number of tabs
    }
}
