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
package org.jclouds.vcloud.director.v1_5.compute.config;

import com.google.inject.AbstractModule;

/**
 * per docs, we are to use pool mode.
 */
public class VCloudDirectorComputeServiceDependenciesModule extends
		AbstractModule {

	@Override
	protected void configure() {

	}
	// FIXME: enable when compute service done
	// extends VCloudDirectorComputeServiceContextModule {
	//
	// @Override
	// protected TemplateOptions provideTemplateOptions(Injector injector,
	// TemplateOptions options) {
	// return
	// options.as(VCloudDirectorTemplateOptions.class).ipAddressAllocationMode(IpAddressAllocationMode.POOL);
	// }
}