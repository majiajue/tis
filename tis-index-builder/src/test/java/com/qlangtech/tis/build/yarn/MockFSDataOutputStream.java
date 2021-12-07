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
package com.qlangtech.tis.build.yarn;

import com.qlangtech.tis.fs.TISFSDataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @create: 2020-05-27 19:00
 */
public class MockFSDataOutputStream extends TISFSDataOutputStream {

    public MockFSDataOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
    // super.write(b, off, len);
    }

    @Override
    public void write(int b) throws IOException {
    }

    @Override
    public long getPos() throws IOException {
        return 0;
    }
}
