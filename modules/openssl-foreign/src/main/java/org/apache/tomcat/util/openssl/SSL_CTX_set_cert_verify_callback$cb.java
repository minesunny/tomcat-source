/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface SSL_CTX_set_cert_verify_callback$cb {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
    static MemorySegment allocate(SSL_CTX_set_cert_verify_callback$cb fi, MemorySession session) {
        return RuntimeHelper.upcallStub(SSL_CTX_set_cert_verify_callback$cb.class, fi, constants$15.SSL_CTX_set_cert_verify_callback$cb$FUNC, session);
    }
    static SSL_CTX_set_cert_verify_callback$cb ofAddress(MemorySegment addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, session);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
            try {
                return (int)constants$15.SSL_CTX_set_cert_verify_callback$cb$MH.invokeExact((MemorySegment)symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


