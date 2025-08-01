package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Must be named &#x60;File&#x60; for test.
 */

@Schema(name = "File", description = "Must be named `File` for test.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class File {

  private @Nullable String sourceURI;

  public File sourceURI(@Nullable String sourceURI) {
    this.sourceURI = sourceURI;
    return this;
  }

  /**
   * Test capitalization
   * @return sourceURI
   */
  
  @Schema(name = "sourceURI", description = "Test capitalization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceURI")
  public @Nullable String getSourceURI() {
    return sourceURI;
  }

  public void setSourceURI(@Nullable String sourceURI) {
    this.sourceURI = sourceURI;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    File file = (File) o;
    return Objects.equals(this.sourceURI, file.sourceURI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceURI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class File {\n");
    sb.append("    sourceURI: ").append(toIndentedString(sourceURI)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

