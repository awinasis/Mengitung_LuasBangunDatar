package id.ac.polinema.luasbangundatar.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import id.ac.polinema.luasbangundatar.R;
import id.ac.polinema.luasbangundatar.BujurSangkar;
import id.ac.polinema.luasbangundatar.PersegiPanjang;
import id.ac.polinema.luasbangundatar.Segitiga;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                Segitiga s = new Segitiga();
                return s;

            case 1:
                PersegiPanjang pp = new PersegiPanjang();
                return pp;

            case 2:
                BujurSangkar bs = new BujurSangkar();
                return bs;

            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Segitiga";
            case 1:
                return "Persegi Panjang";
            case 2:
                return "Bujur Sangkar";
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}