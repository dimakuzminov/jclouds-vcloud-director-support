/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.cloudstack.options;

import static org.jclouds.cloudstack.options.UpdateDiskOfferingOptions.Builder.displayText;
import static org.jclouds.cloudstack.options.UpdateDiskOfferingOptions.Builder.name;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.google.common.collect.ImmutableSet;

/**
 * Tests behavior of {@code UpdateDiskOfferingOptions}
 *
 * @author Andrei Savu
 */
@Test(groups = "unit")
public class UpdateDiskOfferingOptionsTest {

   public void testName() {
      UpdateDiskOfferingOptions options = new UpdateDiskOfferingOptions().name("test-name");
      assertEquals(ImmutableSet.of("test-name"), options.buildQueryParameters().get("name"));
   }

   public void testNameStatic() {
      UpdateDiskOfferingOptions options = name("test-name");
      assertEquals(ImmutableSet.of("test-name"), options.buildQueryParameters().get("name"));
   }

   public void testDisplayText() {
      UpdateDiskOfferingOptions options = new UpdateDiskOfferingOptions().displayText("test-display-text");
      assertEquals(ImmutableSet.of("test-display-text"), options.buildQueryParameters().get("displaytext"));
   }

   public void testDisplayTextStatic() {
      UpdateDiskOfferingOptions options = displayText("test-display-text");
      assertEquals(ImmutableSet.of("test-display-text"), options.buildQueryParameters().get("displaytext"));
   }


}
