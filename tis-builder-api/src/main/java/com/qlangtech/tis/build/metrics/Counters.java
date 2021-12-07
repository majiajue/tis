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
package com.qlangtech.tis.build.metrics;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @date 2020/09/25
 */
public class Counters {

    public enum Counter {

        //
        MAP_ALL_RECORDS,
        //
        MAP_INPUT_RECORDS,
        //
        MAP_SKIPPED_RECORDS,
        //
        MAP_INPUT_BYTES,
        //
        MAP_OUTPUT_RECORDS,
        //
        MAP_OUTPUT_BYTES,
        DOCMAKE_COMPLETE,
        DOCMAKE_QUEUE_PUT_TIME,
        INDEXMAKE_COMPLETE,
        MERGE_COMPLETE,
        DOCMAKE_FAIL,
        INDEXMAKE_FAIL
    }

    private final Map<Counter, AtomicLong> counters = new HashMap<>();

    public void incrCounter(Counter counter, int val) {
        AtomicLong aval = getCounter(counter);
        aval.addAndGet(val);
    }

    public void setCounterValue(Counter type, long val) {
        AtomicLong aval = getCounter(type);
        aval.set(val);
    }

    public AtomicLong getCounter(Counter type) {
        AtomicLong aval = counters.get(type);
        if (aval == null) {
            synchronized (counters) {
                aval = counters.get(type);
                if (aval == null) {
                    aval = new AtomicLong();
                    counters.put(type, aval);
                }
            }
        }
        return aval;
    }
}
