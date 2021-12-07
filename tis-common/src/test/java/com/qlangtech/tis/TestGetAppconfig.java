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
package com.qlangtech.tis;

import com.qlangtech.tis.manage.biz.dal.pojo.UploadResource;
import com.qlangtech.tis.manage.common.ConfigFileReader;
import com.qlangtech.tis.manage.common.HttpConfigFileReader;
import com.qlangtech.tis.manage.common.RepositoryException;
import com.qlangtech.tis.manage.common.SnapshotDomain;
import com.qlangtech.tis.pubhook.common.RunEnvironment;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @date 2020/04/13
 */
public class TestGetAppconfig extends TestCase {

    public void testGetResource() {
        try {
            SnapshotDomain domain = HttpConfigFileReader.getResource("search4punish", 0, RunEnvironment.DAILY, ConfigFileReader.FILE_SCHEMA);
            System.out.println(domain.getSnapshot());
            UploadResource resource = domain.getSolrSchema();
            Assert.assertNotNull(resource);
            Assert.assertNotNull(resource.getContent());
            System.out.println(new String(resource.getContent()));
            resource = domain.getSolrConfig();
            Assert.assertNotNull(resource);
            Assert.assertNull(resource.getContent());
        } catch (RepositoryException e) {
            Assert.assertFalse(e.getMessage(), true);
        }
    }
}
