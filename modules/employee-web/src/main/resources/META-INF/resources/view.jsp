<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="employeecontroller.caption"/></b>
	
	<p>Esto es el intento 2 para editar el portlet con acciones y renders</p>
</p>

<portlet:renderURL var="createEditRender">
	<portlet:param name="mvcRenderCommandName" value="/create/edit"/>
</portlet:renderURL>

<a href="${createEditRender}">Crear Empleado</a>