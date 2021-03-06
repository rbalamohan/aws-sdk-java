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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A behavior graph in Detective.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/Graph" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Graph implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the behavior graph was created. The value is in milliseconds since the epoch.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @param arn
     *        The ARN of the behavior graph.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @return The ARN of the behavior graph.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @param arn
     *        The ARN of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Graph withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the behavior graph was created. The value is in milliseconds since the epoch.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the behavior graph was created. The value is in milliseconds since the epoch.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that the behavior graph was created. The value is in milliseconds since the epoch.
     * </p>
     * 
     * @return The date and time that the behavior graph was created. The value is in milliseconds since the epoch.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that the behavior graph was created. The value is in milliseconds since the epoch.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the behavior graph was created. The value is in milliseconds since the epoch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Graph withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Graph == false)
            return false;
        Graph other = (Graph) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public Graph clone() {
        try {
            return (Graph) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.GraphMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
