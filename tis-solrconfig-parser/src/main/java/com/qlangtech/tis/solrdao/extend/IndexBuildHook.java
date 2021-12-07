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
package com.qlangtech.tis.solrdao.extend;

import org.apache.commons.lang.StringUtils;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @date 2018年10月8日
 */
public class IndexBuildHook extends BaseExtendConfig {

    private static final String CLASS = "class";

    private final String fullClassName;

    private IndexBuildHook(String args) {
        super(args);
        fullClassName = this.params.get(CLASS);
        if (StringUtils.isEmpty(fullClassName)) {
            throw new IllegalArgumentException();
        }
    }

    public static IndexBuildHook create(String args) {
        IndexBuildHook indexBuildHook = new IndexBuildHook(args);
        return indexBuildHook;
    }

    public String getFullClassName() {
        return this.fullClassName;
    }
}
