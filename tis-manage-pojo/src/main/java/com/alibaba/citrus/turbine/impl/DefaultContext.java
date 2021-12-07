/**
 *   Licensed to the Apache Software Foundation (ASF) under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ASF licenses this file
 *   to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.alibaba.citrus.turbine.impl;

import com.alibaba.citrus.turbine.Context;
import com.qlangtech.tis.runtime.module.misc.IMessageHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @date 2020/04/13
 */
public class DefaultContext implements Context {

    final Map<String, Object> contextMap = new HashMap<String, Object>();

    public Map<String, Object> getContextMap() {
        return contextMap;
    }

    public DefaultContext() {
    }

    public Map<String, Object> getContextValue() {
        return this.contextMap;
    }

    @Override
    public boolean hasErrors() {
        return this.get(IMessageHandler.ACTION_ERROR_MSG) != null && !((List<String>) this.get(IMessageHandler.ACTION_ERROR_MSG)).isEmpty();
    }

    @Override
    public boolean containsKey(String key) {
        return contextMap.containsKey(key);
    }

    @Override
    public Object get(String key) {
        return contextMap.get(key);
    }

    @Override
    public Set<String> keySet() {
        return contextMap.keySet();
    }

    @Override
    public void put(String key, Object value) {
        contextMap.put(key, value);
    }

    @Override
    public void remove(String key) {
    }
}
