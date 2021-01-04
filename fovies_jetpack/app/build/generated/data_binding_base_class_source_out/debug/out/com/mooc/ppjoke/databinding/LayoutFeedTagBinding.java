// Generated by data binding compiler. Do not edit!
package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.mooc.ppjoke.R;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.String;

public abstract class LayoutFeedTagBinding extends ViewDataBinding {
  @Bindable
  protected String mTagText;

  protected LayoutFeedTagBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setTagText(@Nullable String tagText);

  @Nullable
  public String getTagText() {
    return mTagText;
  }

  @NonNull
  public static LayoutFeedTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_feed_tag, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutFeedTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutFeedTagBinding>inflateInternal(inflater, R.layout.layout_feed_tag, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedTagBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_feed_tag, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutFeedTagBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutFeedTagBinding>inflateInternal(inflater, R.layout.layout_feed_tag, null, false, component);
  }

  public static LayoutFeedTagBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LayoutFeedTagBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutFeedTagBinding)bind(component, view, R.layout.layout_feed_tag);
  }
}
