package com.timehop.stickyheadersrecyclerview;

import android.graphics.Rect;

import java.util.List;

/**
 * Listener which get called every time headers get redrawn
 */
public interface HeaderPositionChangeListener {
    /**
     * <p>Called after all headers get redrawn.</p>
     * <p>Notice coordinates may not actually change for some of the headers
     * it's up to the client to track actual coordinates changes</p>
     *
     * @param headerRects list of all headers (ordered top to bottom)
     */
    void headerPositionChanged(List<Rect> headerRects);
}
