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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The endpoint of a meeting session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/MessagingSessionEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessagingSessionEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of a meeting session endpoint.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The URL of a meeting session endpoint.
     * </p>
     * 
     * @param url
     *        The URL of a meeting session endpoint.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of a meeting session endpoint.
     * </p>
     * 
     * @return The URL of a meeting session endpoint.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of a meeting session endpoint.
     * </p>
     * 
     * @param url
     *        The URL of a meeting session endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessagingSessionEndpoint withUrl(String url) {
        setUrl(url);
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
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessagingSessionEndpoint == false)
            return false;
        MessagingSessionEndpoint other = (MessagingSessionEndpoint) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public MessagingSessionEndpoint clone() {
        try {
            return (MessagingSessionEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.MessagingSessionEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
