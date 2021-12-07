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
package org.apache.solr.update.processor;

import org.apache.solr.common.util.NamedList;
import org.apache.solr.request.SolrQueryRequest;
import org.apache.solr.response.SolrQueryResponse;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @date 2019年1月17日
 */
public class TisDistributedUpdateProcessorFactory extends UpdateRequestProcessorFactory implements DistributingUpdateProcessorFactory {

    @Override
    public void init(NamedList args) {
    }

    @Override
    public UpdateRequestProcessor getInstance(SolrQueryRequest req, SolrQueryResponse rsp, UpdateRequestProcessor next) {
        return new DistributedUpdateProcessor(req, rsp, next);
    }

    public static void addParamToDistributedRequestWhitelist(final SolrQueryRequest req, final String... paramNames) {
        Set<String> whitelist = (Set<String>) req.getContext().computeIfAbsent(DistributedUpdateProcessor.PARAM_WHITELIST_CTX_KEY, key -> new TreeSet<>());
        Collections.addAll(whitelist, paramNames);
    }
}
