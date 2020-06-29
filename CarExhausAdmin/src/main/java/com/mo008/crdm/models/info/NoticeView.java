/*
 * Copyright © 2015-2016, AnHui Mobiao technology co. LTD Inc. All Rights Reserved.
 */

package com.mo008.crdm.models.info;


import com.mo008.crdm.models.info.base.BaseNoticeView;

import goja.core.annotation.TableBind;
import goja.core.sqlinxml.SqlKit;

/**
 * Generated by JFinal.
 */
@TableBind(tableName = "mo_notice_view", pks = {"notice_id", "user_id"})
public class NoticeView extends BaseNoticeView<NoticeView> {
    public static final NoticeView dao = new NoticeView();

    public NoticeView findByUserAndNotice(int noticeId, int userId) {
        return findFirst(SqlKit.sql("info.notice.findByUserAndNotice"), noticeId, userId);
    }
}
