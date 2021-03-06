package com.llj.netstatuslibrary.log;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static com.llj.netstatuslibrary.log.Utils.checkNotNull;


/**
 * This is used to saves log messages to the disk.
 * By default it uses {@link CsvFormatStrategy} to translates text message into CSV format.
 */
public class DiskLogAdapter implements LogAdapter {

  @NonNull private final FormatStrategy formatStrategy;

  public DiskLogAdapter(Context context) {
    formatStrategy = CsvFormatStrategy.newBuilder().build(context);
  }

  public DiskLogAdapter(@NonNull FormatStrategy formatStrategy) {
    this.formatStrategy = checkNotNull(formatStrategy);
  }

  @Override public boolean isLoggable(int priority, @Nullable String tag) {
    return true;
  }

  @Override public void log(int priority, @Nullable String tag, @NonNull String message) {
    formatStrategy.log(priority, tag, message);
  }
}
