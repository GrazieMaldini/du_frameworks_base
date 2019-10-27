package com.google.android.systemui;

import android.content.Context;
import com.android.systemui.SystemUIFactory;
import com.android.systemui.statusbar.NotificationLockscreenUserManager;

import com.android.systemui.statusbar.notification.NotificationEntryManager;
import com.google.android.systemui.statusbar.NotificationEntryManagerGoogle;

public class SystemUIGoogleFactory extends SystemUIFactory {

    @Override
    public NotificationLockscreenUserManager provideNotificationLockscreenUserManager(Context context) {
        return new NotificationLockscreenUserManagerGoogle(context);
	}
}
