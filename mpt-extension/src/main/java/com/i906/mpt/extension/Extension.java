package com.i906.mpt.extension;

import android.net.Uri;

/**
 * @author Noorzaini Ilhami
 */
public interface Extension {

    String AUTHORITY = App.PACKAGE + ".provider.prayer";
    Uri AUTHORITY_URI = Uri.parse("content://" + AUTHORITY);

    String PRAYER_CONTEXT = "prayer-context";
    Uri PRAYER_CONTEXT_URI = Uri.withAppendedPath(AUTHORITY_URI, PRAYER_CONTEXT);

    String ACTION_MAIN_SCREEN = App.PACKAGE + ".action.MAIN_SCREEN";
    String ACTION_PRAYER_CONTEXT_UPDATED = App.PACKAGE + ".action.PRAYER_CONTEXT_UPDATED";
}
