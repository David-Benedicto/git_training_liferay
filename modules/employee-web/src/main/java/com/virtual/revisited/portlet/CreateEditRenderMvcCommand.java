package com.virtual.revisited.portlet;

import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.virtual.revisited.constants.EmployeeControllerPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;


@Component(
		immediate=true,
		property = {
				"javax.portlet.name=" + EmployeeControllerPortletKeys.EMPLOYEECONTROLLER,
				"mvc.command.name=/create/edit"
		},
		
		service = MVCRenderCommand.class
		)
public class CreateEditRenderMvcCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest arg0, RenderResponse arg1) throws PortletException {
		
		return "/edit.jsp";
	}

}
