package application.server;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Modal {

  private String id;
  private String name;
  private String description;

  @JsonCreator
  public Modal(@JsonProperty("id") String id,
               @JsonProperty("name") String name,
               @JsonProperty("description") String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return "Modal{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", description='" + description + '\'' +
      '}';
  }
}
