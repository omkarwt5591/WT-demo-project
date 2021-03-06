/*
 * MobileAccess v1.3.0
 *  ##### **NaaS API Version:** 2.4.0 ##### **mobileAccess service version:** 1.2.3 ## OVERVIEW TMF 640 - Activation and Configuration API. This is a strategic mobileAccess service aiming to provide network capabilities to products.   **Note: Enum values are case sensitive**
 *
 * OpenAPI spec version: 2.4.5
 * Contact: D1701045@team.telstra.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.client.model.RelatedService;
import io.swagger.client.model.TaskCharacteristic;
import io.swagger.client.model.TaskResponseSubBar;
import io.swagger.client.model.TaskStateEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * TaskResponseSubBar
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T11:27:23.768Z[GMT]")
public class TaskResponseSubBar {
  @SerializedName("id")
  private String id = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("state")
  private TaskStateEnum state = null;

  @SerializedName("taskCreationDate")
  private String taskCreationDate = "Today";

  @SerializedName("relatedService")
  private List<RelatedService> relatedService = new ArrayList<RelatedService>();

  @SerializedName("taskCharacteristic")
  private List<TaskCharacteristic> taskCharacteristic = null;

  public TaskResponseSubBar id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Created by Domain. Identifier of task resource. Required to be unique. This should be in UUID format
   * @return id
  **/
  @Schema(required = true, description = "Created by Domain. Identifier of task resource. Required to be unique. This should be in UUID format")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TaskResponseSubBar href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Complete URI Reference to the task resource (useful for delete or modify command)
   * @return href
  **/
  @Schema(required = true, description = "Complete URI Reference to the task resource (useful for delete or modify command)")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public TaskResponseSubBar state(TaskStateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(required = true, description = "")
  public TaskStateEnum getState() {
    return state;
  }

  public void setState(TaskStateEnum state) {
    this.state = state;
  }

  public TaskResponseSubBar taskCreationDate(String taskCreationDate) {
    this.taskCreationDate = taskCreationDate;
    return this;
  }

   /**
   * Task creation date. Format ISO-8601 (e.g. 2018-03-19T08:20:00.123Z)
   * @return taskCreationDate
  **/
  @Schema(required = true, description = "Task creation date. Format ISO-8601 (e.g. 2018-03-19T08:20:00.123Z)")
  public String getTaskCreationDate() {
    return taskCreationDate;
  }

  public void setTaskCreationDate(String taskCreationDate) {
    this.taskCreationDate = taskCreationDate;
  }

  public TaskResponseSubBar relatedService(List<RelatedService> relatedService) {
    this.relatedService = relatedService;
    return this;
  }

  public TaskResponseSubBar addRelatedServiceItem(RelatedService relatedServiceItem) {
    this.relatedService.add(relatedServiceItem);
    return this;
  }

   /**
   * SupportingService is a collection of child Service Instances.
   * @return relatedService
  **/
  @Schema(required = true, description = "SupportingService is a collection of child Service Instances.")
  public List<RelatedService> getRelatedService() {
    return relatedService;
  }

  public void setRelatedService(List<RelatedService> relatedService) {
    this.relatedService = relatedService;
  }

  public TaskResponseSubBar taskCharacteristic(List<TaskCharacteristic> taskCharacteristic) {
    this.taskCharacteristic = taskCharacteristic;
    return this;
  }

  public TaskResponseSubBar addTaskCharacteristicItem(TaskCharacteristic taskCharacteristicItem) {
    if (this.taskCharacteristic == null) {
      this.taskCharacteristic = new ArrayList<TaskCharacteristic>();
    }
    this.taskCharacteristic.add(taskCharacteristicItem);
    return this;
  }

   /**
   * A list of task characteristics represented as name/value pairs
   * @return taskCharacteristic
  **/
  @Schema(description = "A list of task characteristics represented as name/value pairs")
  public List<TaskCharacteristic> getTaskCharacteristic() {
    return taskCharacteristic;
  }

  public void setTaskCharacteristic(List<TaskCharacteristic> taskCharacteristic) {
    this.taskCharacteristic = taskCharacteristic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskResponseSubBar taskResponseSubBar = (TaskResponseSubBar) o;
    return Objects.equals(this.id, taskResponseSubBar.id) &&
        Objects.equals(this.href, taskResponseSubBar.href) &&
        Objects.equals(this.state, taskResponseSubBar.state) &&
        Objects.equals(this.taskCreationDate, taskResponseSubBar.taskCreationDate) &&
        Objects.equals(this.relatedService, taskResponseSubBar.relatedService) &&
        Objects.equals(this.taskCharacteristic, taskResponseSubBar.taskCharacteristic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, state, taskCreationDate, relatedService, taskCharacteristic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskResponseSubBar {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taskCreationDate: ").append(toIndentedString(taskCreationDate)).append("\n");
    sb.append("    relatedService: ").append(toIndentedString(relatedService)).append("\n");
    sb.append("    taskCharacteristic: ").append(toIndentedString(taskCharacteristic)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
