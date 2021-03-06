/*
 * Copyright © 2015-2016, AnHui Mobiao technology co. LTD Inc. All Rights Reserved.
 */

package com.mo008.crdm.controllers.statistics;

import com.mo008.crdm.models.device.Device;

import goja.mvc.Controller;

import java.util.List;

/**
 * <p> </p>
 *
 * @author BOGON
 * @version 1.0
 * @since JDK 1.6
 */
public class SysworkController extends Controller {

    /**
     * The index route.
     */
    public void index() {
    }

    public void data(){
        String areaCode = getPara("code");
        int type = getParaToInt("type",2);
        List<Device> devices = Device.dao.findForStatus(areaCode,type);
        renderJson(devices);
    }
}