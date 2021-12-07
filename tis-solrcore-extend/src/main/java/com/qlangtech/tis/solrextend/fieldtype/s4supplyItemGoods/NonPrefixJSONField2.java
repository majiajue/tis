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
package com.qlangtech.tis.solrextend.fieldtype.s4supplyItemGoods;

import org.apache.commons.lang.StringUtils;
import com.qlangtech.tis.solrextend.fieldtype.JSONField2;

/**
 * 业务方不希望在json映射的字段中有前缀
 *
 * @author 百岁（baisui@qlangtech.com）
 * @date 2019年1月17日
 */
public class NonPrefixJSONField2 extends JSONField2 {

    @Override
    protected boolean isPropPrefixNotEmpty() {
        return true;
    }

    @Override
    protected String getPropPrefix() {
        return StringUtils.EMPTY;
    }
}
