package POJO;

import POJODependencies.Fields;
import POJODependencies.IssueType;
import POJODependencies.Project;

public class JIRAAddIssuePOJORequest {
Fields fields;
public JIRAAddIssuePOJORequest() {
	fields=new Fields();
	fields.setDescription("This is not working");
	fields.setIssuetype(new IssueType());
	fields.setProject(new Project("PROJ"));
	fields.setSummary("This is defect summary");
}
public Fields getFields() {
	return fields;
}
public void setFields(Fields fields) {
	this.fields = fields;
}
}
