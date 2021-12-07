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
package com.qlangtech.tis.sql.parser.tuple.creator;

import com.qlangtech.tis.compiler.streamcode.IDBTableNamesGetter;
import com.qlangtech.tis.sql.parser.DBNode;
import com.qlangtech.tis.sql.parser.er.IERRules;

import java.util.List;
import java.util.Map;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @date 2021-04-06 09:49
 */
public interface IStreamIncrGenerateStrategy {


    boolean isExcludeFacadeDAOSupport();

    Map<IEntityNameGetter, List<IValChain>> getTabTriggerLinker();

    /**
     * map<dbname,list<tables>>
     *
     * @return
     */
    Map<DBNode, List<String>> getDependencyTables(IDBTableNamesGetter dbTableNamesGetter);

    IERRules getERRule();


}
