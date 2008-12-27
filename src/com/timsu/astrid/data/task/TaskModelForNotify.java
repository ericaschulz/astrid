/*
 * ASTRID: Android's Simple Task Recording Dashboard
 *
 * Copyright (c) 2009 Tim Su
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package com.timsu.astrid.data.task;

import java.util.Date;

import android.database.Cursor;

import com.timsu.astrid.data.AbstractController;
import com.timsu.astrid.utilities.Notifications.Notifiable;



/** Fields that you would want to see in the TaskView activity */
public class TaskModelForNotify extends AbstractTaskModel implements Notifiable {

    static String[] FIELD_LIST = new String[] {
        AbstractController.KEY_ROWID,
        NOTIFICATIONS,
        HIDDEN_UNTIL,
    };

    // --- constructors

    public TaskModelForNotify(Cursor cursor) {
        super(cursor);
        getNotificationIntervalSeconds();
        getHiddenUntil();
    }

    // --- getters and setters

    @Override
    public Integer getNotificationIntervalSeconds() {
        return super.getNotificationIntervalSeconds();
    }

    @Override
    public Date getHiddenUntil() {
        return super.getHiddenUntil();
    }
}
