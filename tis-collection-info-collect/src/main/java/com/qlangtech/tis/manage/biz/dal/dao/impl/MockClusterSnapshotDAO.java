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
package com.qlangtech.tis.manage.biz.dal.dao.impl;

import java.util.Date;
import java.util.List;
import com.qlangtech.tis.dataplatform.dao.IClusterSnapshotDAO;
import com.qlangtech.tis.dataplatform.pojo.ClusterSnapshot;
import com.qlangtech.tis.dataplatform.pojo.ClusterSnapshotCriteria;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @date 2020/04/13
 */
public class MockClusterSnapshotDAO implements IClusterSnapshotDAO {

    @Override
    public void insertList(List<ClusterSnapshot> records) {
    }

    @Override
    public void createTodaySummary(Date today) {
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public Integer insert(ClusterSnapshot record) {
        return null;
    }

    @Override
    public Integer insertSelective(ClusterSnapshot record) {
        return null;
    }

    @Override
    public ClusterSnapshot selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public ClusterSnapshot loadFromWriteDB(Integer id) {
        return null;
    }

    @Override
    public int countByExample(ClusterSnapshotCriteria example) {
        return 0;
    }

    @Override
    public int countFromWriteDB(ClusterSnapshotCriteria example) {
        return 0;
    }

    @Override
    public int deleteByExample(ClusterSnapshotCriteria criteria) {
        return 0;
    }

    @Override
    public List<ClusterSnapshot> selectByExample(ClusterSnapshotCriteria criteria) {
        return null;
    }

    @Override
    public List<ClusterSnapshot> selectByExample(ClusterSnapshotCriteria example, int page, int pageSize) {
        return null;
    }

    @Override
    public int updateByExample(ClusterSnapshot record, ClusterSnapshotCriteria example) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(ClusterSnapshot record, ClusterSnapshotCriteria example) {
        return 0;
    }
}
