package org.cursoedx.android.tipcalc.fragments;

import org.cursoedx.android.tipcalc.models.TipRecord;

/**
 * Created by TrexT on 12/06/2016.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
