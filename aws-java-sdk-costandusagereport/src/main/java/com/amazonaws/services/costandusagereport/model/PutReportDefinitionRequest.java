/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.costandusagereport.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a Cost and Usage Report.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/PutReportDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutReportDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the output of the PutReportDefinition operation. The content consists of the detailed metadata and
     * data file information.
     * </p>
     */
    private ReportDefinition reportDefinition;

    /**
     * <p>
     * Represents the output of the PutReportDefinition operation. The content consists of the detailed metadata and
     * data file information.
     * </p>
     * 
     * @param reportDefinition
     *        Represents the output of the PutReportDefinition operation. The content consists of the detailed metadata
     *        and data file information.
     */

    public void setReportDefinition(ReportDefinition reportDefinition) {
        this.reportDefinition = reportDefinition;
    }

    /**
     * <p>
     * Represents the output of the PutReportDefinition operation. The content consists of the detailed metadata and
     * data file information.
     * </p>
     * 
     * @return Represents the output of the PutReportDefinition operation. The content consists of the detailed metadata
     *         and data file information.
     */

    public ReportDefinition getReportDefinition() {
        return this.reportDefinition;
    }

    /**
     * <p>
     * Represents the output of the PutReportDefinition operation. The content consists of the detailed metadata and
     * data file information.
     * </p>
     * 
     * @param reportDefinition
     *        Represents the output of the PutReportDefinition operation. The content consists of the detailed metadata
     *        and data file information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutReportDefinitionRequest withReportDefinition(ReportDefinition reportDefinition) {
        setReportDefinition(reportDefinition);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReportDefinition() != null)
            sb.append("ReportDefinition: ").append(getReportDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutReportDefinitionRequest == false)
            return false;
        PutReportDefinitionRequest other = (PutReportDefinitionRequest) obj;
        if (other.getReportDefinition() == null ^ this.getReportDefinition() == null)
            return false;
        if (other.getReportDefinition() != null && other.getReportDefinition().equals(this.getReportDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportDefinition() == null) ? 0 : getReportDefinition().hashCode());
        return hashCode;
    }

    @Override
    public PutReportDefinitionRequest clone() {
        return (PutReportDefinitionRequest) super.clone();
    }

}
