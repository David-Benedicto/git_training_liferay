/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.revisited.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.revisited.model.Employee;

import com.liferay.revisited.service.EmployeeLocalServiceUtil;
import com.liferay.revisited.service.base.EmployeeLocalServiceBaseImpl;
import com.liferay.revisited.service.base.EmployeeServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=virtual", // nombre del contexto, coincide con el namespace del service.xml
		"json.web.service.context.path=Employee"
	},
	service = AopService.class
)
public class EmployeeServiceImpl extends EmployeeServiceBaseImpl {	
	
		
		public Employee addEmployee(String name,String address, String phoneNumber, long salary, String emailAddress) {
			
			// Ejemplo de permiso checker en métodos remotos ???		
			
			return EmployeeLocalServiceUtil.addEmployee(addEmployee(name, address, phoneNumber,salary,emailAddress));
		}	
	
	}
	

	
