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
package com.qlangtech.tis.manage;

import java.io.File;

/**
 * @author 百岁（baisui@qlangtech.com）
 * @date 2020/04/13
 */
public class UploadJarForm {

    private File uploadfile;

    private File schema;

    private File config;

    private File spring;

    private File coreprop;

    private File datasource;

    public File getUploadfile() {
        return uploadfile;
    }

    public void setUploadfile(File uploadfile) {
        this.uploadfile = uploadfile;
    }

    public File getSchema() {
        return schema;
    }

    public void setSchema(File schema) {
        this.schema = schema;
    }

    public File getConfig() {
        return config;
    }

    public void setConfig(File config) {
        this.config = config;
    }

    public File getSpring() {
        return spring;
    }

    public void setSpring(File spring) {
        this.spring = spring;
    }

    public File getCoreprop() {
        return coreprop;
    }

    public void setCoreprop(File coreprop) {
        this.coreprop = coreprop;
    }

    public File getDatasource() {
        return datasource;
    }

    public void setDatasource(File datasource) {
        this.datasource = datasource;
    }
}
