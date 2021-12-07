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
package com.qlangtech.tis.solrextend.fieldtype.pinyin;

import org.apache.commons.lang.StringUtils;
import org.apache.lucene.document.SortedDocValuesField;
import org.apache.lucene.index.IndexableField;
import org.apache.lucene.util.BytesRef;
import org.apache.solr.schema.SchemaField;
import org.apache.solr.schema.TextField;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @date 2019年1月17日
 */
public class PinyinField extends TextField {

    @Override
    public List<IndexableField> createFields(SchemaField field, Object value) {
        if (value == null || StringUtils.isBlank(String.valueOf(value))) {
            return null;
        }
        List<IndexableField> fields = new ArrayList<>();
        IndexableField f = createField(field, value);
        fields.add(f);
        if (field.hasDocValues()) {
            BytesRef bytes = new BytesRef(value.toString());
            fields.add(new SortedDocValuesField(field.getName(), bytes));
        }
        return fields;
    }

    @Override
    public boolean isPolyField() {
        return true;
    }

    @Override
    public void checkSchemaField(SchemaField field) {
    // do nothing
    // support docValues
    }
}
