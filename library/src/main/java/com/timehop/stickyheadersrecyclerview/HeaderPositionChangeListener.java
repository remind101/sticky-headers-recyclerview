package com.timehop.stickyheadersrecyclerview;

import android.graphics.Rect;

/**
 * Listener which get called every time headers get redrawn
 */
public interface HeaderPositionChangeListener {
    /**
     * <p>Called for each header get redrawn.</p>
     * <p>Notice coordinates may not actually change for some of the headers
     * it's up to the client to track actual coordinates changes</p>
     *
     * @param headerId   id of the header being redrawn
     * @param headerRect new coordinates for the header
     */
    void headerPositionChanged(int headerId, Rect headerRect);
}
