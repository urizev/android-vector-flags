package com.urizev.flags.lib;

import android.content.Context;
import android.text.TextUtils;

import java.util.Locale;

/**
 * Creado por jcvallejo en 31/3/16.
 */
public class CountryFlag {
    public static int flag(Context context, Locale locale) {
        return CountryFlag.flag(context, locale.getCountry().toLowerCase());
    }

    public static int flag(Context context, String iso) {
        if (TextUtils.isEmpty(iso)) {
            return R.drawable.flag__unknown;
        }
        if (iso.length() > 3) {
            iso = iso.substring(0, 3);
        }
        String name = "flag_" + iso.toLowerCase();

        int resId = context.getResources().getIdentifier(name, "drawable", context.getPackageName());
        if (resId > 0) {
            return resId;
        }
        else {
            return R.drawable.flag__unknown;
        }
    }
}
