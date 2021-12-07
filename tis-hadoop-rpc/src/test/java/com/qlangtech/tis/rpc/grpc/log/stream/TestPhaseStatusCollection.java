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
package com.qlangtech.tis.rpc.grpc.log.stream;

import com.google.protobuf.util.JsonFormat;
import com.qlangtech.tis.manage.common.TisUTF8;
import com.qlangtech.tis.rpc.grpc.log.common.TableDumpStatus;
import junit.framework.TestCase;
import org.apache.commons.io.IOUtils;
import java.io.InputStream;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @create: 2020-05-12 11:19
 */
public class TestPhaseStatusCollection extends TestCase {

    public void testJsonFormat() throws Exception {
        JsonFormat.Printer jsonPrint = JsonFormat.printer();
        PDumpPhaseStatus.Builder dumpState = PDumpPhaseStatus.newBuilder();
        String tableName = "totalpayinfo";
        TableDumpStatus.Builder dumpBuilder = TableDumpStatus.newBuilder();
        dumpBuilder.setWaiting(true);
        dumpBuilder.setComplete(true);
        dumpBuilder.setFaild(true);
        dumpBuilder.setTaskid(9527);
        dumpBuilder.setTableName(tableName);
        dumpBuilder.setReadRows(127);
        dumpBuilder.setAllRows(9999);
        dumpState.putTablesDump(tableName, dumpBuilder.build());
        try (InputStream input = TestPhaseStatusCollection.class.getResourceAsStream("totalpayinfo_proto_json_format.json")) {
            assertEquals(IOUtils.toString(input, TisUTF8.get()), jsonPrint.print(dumpState));
        }
    }
}
