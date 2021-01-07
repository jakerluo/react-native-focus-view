package com.robbe.lib;

import android.util.Log;
import android.view.ViewGroup;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;

public class ReactNativeFocusViewManager extends SimpleViewManager<ReactViewGroup> {

    public static final String REACT_CLASS = "ReactNativeFocusView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public ReactViewGroup createViewInstance(ThemedReactContext reactContext) {
      return new ReactViewGroup(reactContext);
    }

    @ReactProp(name = "descendantFocusability")
    public void setDescendantFocusability(ReactViewGroup view, boolean descendantFocusability) {
        Log.d(REACT_CLASS, String.valueOf(descendantFocusability));
        if (descendantFocusability) {
            view.setDescendantFocusability(ViewGroup.FOCUS_BLOCK_DESCENDANTS);
            view.setFocusable(false);
        } else {
//      view.setDescendantFocusability(ViewGroup.FOCUS_AFTER_DESCENDANTS);
            view.setDescendantFocusability(ViewGroup.FOCUS_BEFORE_DESCENDANTS);
        }
    }
}
