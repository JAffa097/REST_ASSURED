package POJODependencies;

public class Fields {
	Project project;
String summary;
String description;

IssueType issuetype;
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Project getProject() {
	return project;
}
public void setProject(Project project) {
	this.project = project;
}
public IssueType getIssuetype() {
	return issuetype;
}
public void setIssuetype(IssueType issuetype) {
	this.issuetype = issuetype;
}


}
