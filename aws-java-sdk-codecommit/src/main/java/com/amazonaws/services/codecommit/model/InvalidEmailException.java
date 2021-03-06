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
package com.amazonaws.services.codecommit.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified email address either contains one or more characters that are not allowed, or it exceeds the maximum
 * number of characters allowed for an email address.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidEmailException extends com.amazonaws.services.codecommit.model.AWSCodeCommitException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidEmailException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidEmailException(String message) {
        super(message);
    }

}
