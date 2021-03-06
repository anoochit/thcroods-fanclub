package net.redlinesoft.app.thecroodfanclub;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

	final int PAGE_COUNT = 2;

	public MyFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		Bundle data = new Bundle();
		switch (arg0) {
		case 0:
			FragmentVideo videoFragment = new FragmentVideo();
			data.putInt("current_page", arg0 + 1);
			videoFragment.setArguments(data);
			return videoFragment;

		case 1:
			FragmentTwitter twitterFragment = new FragmentTwitter();
			data.putInt("current_page", arg0 + 1);
			twitterFragment.setArguments(data);
			return twitterFragment;
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return PAGE_COUNT;
	}

}
