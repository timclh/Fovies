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
import com.mooc.ppjoke.model.Feed;
import com.mooc.ppjoke.view.PPImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutFeedDetailTypeImageHeaderBinding extends ViewDataBinding {
  @NonNull
  public final PPImageView headerImage;

  @Bindable
  protected Feed mFeed;

  protected LayoutFeedDetailTypeImageHeaderBinding(Object _bindingComponent, View _root,
      int _localFieldCount, PPImageView headerImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.headerImage = headerImage;
  }

  public abstract void setFeed(@Nullable Feed feed);

  @Nullable
  public Feed getFeed() {
    return mFeed;
  }

  @NonNull
  public static LayoutFeedDetailTypeImageHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_feed_detail_type_image_header, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutFeedDetailTypeImageHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutFeedDetailTypeImageHeaderBinding>inflateInternal(inflater, R.layout.layout_feed_detail_type_image_header, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedDetailTypeImageHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_feed_detail_type_image_header, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutFeedDetailTypeImageHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutFeedDetailTypeImageHeaderBinding>inflateInternal(inflater, R.layout.layout_feed_detail_type_image_header, null, false, component);
  }

  public static LayoutFeedDetailTypeImageHeaderBinding bind(@NonNull View view) {
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
  public static LayoutFeedDetailTypeImageHeaderBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (LayoutFeedDetailTypeImageHeaderBinding)bind(component, view, R.layout.layout_feed_detail_type_image_header);
  }
}