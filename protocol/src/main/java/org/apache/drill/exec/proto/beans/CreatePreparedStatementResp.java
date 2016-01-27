/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from protobuf

package org.apache.drill.exec.proto.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;

public final class CreatePreparedStatementResp implements Externalizable, Message<CreatePreparedStatementResp>, Schema<CreatePreparedStatementResp>
{

    public static Schema<CreatePreparedStatementResp> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static CreatePreparedStatementResp getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final CreatePreparedStatementResp DEFAULT_INSTANCE = new CreatePreparedStatementResp();

    
    private RequestStatus status;
    private PreparedStatement preparedStatement;
    private DrillPBError error;

    public CreatePreparedStatementResp()
    {
        
    }

    // getters and setters

    // status

    public RequestStatus getStatus()
    {
        return status == null ? RequestStatus.UNKNOWN_STATUS : status;
    }

    public CreatePreparedStatementResp setStatus(RequestStatus status)
    {
        this.status = status;
        return this;
    }

    // preparedStatement

    public PreparedStatement getPreparedStatement()
    {
        return preparedStatement;
    }

    public CreatePreparedStatementResp setPreparedStatement(PreparedStatement preparedStatement)
    {
        this.preparedStatement = preparedStatement;
        return this;
    }

    // error

    public DrillPBError getError()
    {
        return error;
    }

    public CreatePreparedStatementResp setError(DrillPBError error)
    {
        this.error = error;
        return this;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<CreatePreparedStatementResp> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public CreatePreparedStatementResp newMessage()
    {
        return new CreatePreparedStatementResp();
    }

    public Class<CreatePreparedStatementResp> typeClass()
    {
        return CreatePreparedStatementResp.class;
    }

    public String messageName()
    {
        return CreatePreparedStatementResp.class.getSimpleName();
    }

    public String messageFullName()
    {
        return CreatePreparedStatementResp.class.getName();
    }

    public boolean isInitialized(CreatePreparedStatementResp message)
    {
        return true;
    }

    public void mergeFrom(Input input, CreatePreparedStatementResp message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.status = RequestStatus.valueOf(input.readEnum());
                    break;
                case 2:
                    message.preparedStatement = input.mergeObject(message.preparedStatement, PreparedStatement.getSchema());
                    break;

                case 3:
                    message.error = input.mergeObject(message.error, DrillPBError.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, CreatePreparedStatementResp message) throws IOException
    {
        if(message.status != null)
             output.writeEnum(1, message.status.number, false);

        if(message.preparedStatement != null)
             output.writeObject(2, message.preparedStatement, PreparedStatement.getSchema(), false);


        if(message.error != null)
             output.writeObject(3, message.error, DrillPBError.getSchema(), false);

    }

    public String getFieldName(int number)
    {
        switch(number)
        {
            case 1: return "status";
            case 2: return "preparedStatement";
            case 3: return "error";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
        __fieldMap.put("status", 1);
        __fieldMap.put("preparedStatement", 2);
        __fieldMap.put("error", 3);
    }
    
}