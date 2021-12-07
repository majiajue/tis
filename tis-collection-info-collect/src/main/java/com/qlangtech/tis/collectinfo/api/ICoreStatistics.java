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
package com.qlangtech.tis.collectinfo.api;

import java.util.List;
import java.util.Set;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @date 2014年10月8日下午10:35:32
 */
public interface ICoreStatistics {

    public List<String> getReplicIps(Integer groupIndex);

    public String getAppName();

    public int getHostsCount();

    public Set<String> getHosts();

    public int getGroupCount();

    public long getRequests();

    public String getFormatRequests();

    public long getNumDocs();

    public List<String> getAllServers();
}
