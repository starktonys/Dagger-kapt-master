// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package me.stark.tony.dagger;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class DaggerPresenter_Factory implements Factory<DaggerPresenter> {
  private final Provider<DaggerActivity> arg0Provider;

  public DaggerPresenter_Factory(Provider<DaggerActivity> arg0Provider) {
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public DaggerPresenter get() {
    return new DaggerPresenter(arg0Provider.get());
  }

  public static Factory<DaggerPresenter> create(Provider<DaggerActivity> arg0Provider) {
    return new DaggerPresenter_Factory(arg0Provider);
  }
}
