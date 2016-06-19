package org.jefrienalvizures.ticcalc.fragments;

import org.jefrienalvizures.ticcalc.models.TipRecord;

/**
 * Created by Jefrien Alvizures on 13/06/2016.
 */
public interface tipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
