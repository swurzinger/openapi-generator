/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.EquilateralTriangle;
import org.openapitools.client.model.IsoscelesTriangle;
import org.openapitools.client.model.ScaleneTriangle;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class Triangle extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Triangle.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Triangle.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Triangle' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EquilateralTriangle> adapterEquilateralTriangle = gson.getDelegateAdapter(this, TypeToken.get(EquilateralTriangle.class));
            final TypeAdapter<IsoscelesTriangle> adapterIsoscelesTriangle = gson.getDelegateAdapter(this, TypeToken.get(IsoscelesTriangle.class));
            final TypeAdapter<ScaleneTriangle> adapterScaleneTriangle = gson.getDelegateAdapter(this, TypeToken.get(ScaleneTriangle.class));

            return (TypeAdapter<T>) new TypeAdapter<Triangle>() {
                @Override
                public void write(JsonWriter out, Triangle value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `EquilateralTriangle`
                    if (value.getActualInstance() instanceof EquilateralTriangle) {
                        JsonElement element = adapterEquilateralTriangle.toJsonTree((EquilateralTriangle)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `IsoscelesTriangle`
                    if (value.getActualInstance() instanceof IsoscelesTriangle) {
                        JsonElement element = adapterIsoscelesTriangle.toJsonTree((IsoscelesTriangle)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ScaleneTriangle`
                    if (value.getActualInstance() instanceof ScaleneTriangle) {
                        JsonElement element = adapterScaleneTriangle.toJsonTree((ScaleneTriangle)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle");
                }

                @Override
                public Triangle read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    Triangle newTriangle = new Triangle();
                    if (jsonObject.get("triangleType") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for Triangle as `triangleType` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `triangleType`
                        switch (jsonObject.get("triangleType").getAsString()) {
                            case "EquilateralTriangle":
                                deserialized = adapterEquilateralTriangle.fromJsonTree(jsonObject);
                                newTriangle.setActualInstance(deserialized);
                                return newTriangle;
                            case "IsoscelesTriangle":
                                deserialized = adapterIsoscelesTriangle.fromJsonTree(jsonObject);
                                newTriangle.setActualInstance(deserialized);
                                return newTriangle;
                            case "ScaleneTriangle":
                                deserialized = adapterScaleneTriangle.fromJsonTree(jsonObject);
                                newTriangle.setActualInstance(deserialized);
                                return newTriangle;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for Triangle. Possible values: EquilateralTriangle IsoscelesTriangle ScaleneTriangle", jsonObject.get("triangleType").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize EquilateralTriangle
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EquilateralTriangle.validateJsonElement(jsonElement);
                        actualAdapter = adapterEquilateralTriangle;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EquilateralTriangle'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EquilateralTriangle failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EquilateralTriangle'", e);
                    }
                    // deserialize IsoscelesTriangle
                    try {
                        // validate the JSON object to see if any exception is thrown
                        IsoscelesTriangle.validateJsonElement(jsonElement);
                        actualAdapter = adapterIsoscelesTriangle;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'IsoscelesTriangle'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for IsoscelesTriangle failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'IsoscelesTriangle'", e);
                    }
                    // deserialize ScaleneTriangle
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ScaleneTriangle.validateJsonElement(jsonElement);
                        actualAdapter = adapterScaleneTriangle;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ScaleneTriangle'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ScaleneTriangle failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ScaleneTriangle'", e);
                    }

                    if (match == 1) {
                        Triangle ret = new Triangle();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Triangle: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Triangle() {
        super("oneOf", Boolean.FALSE);
    }

    public Triangle(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("EquilateralTriangle", EquilateralTriangle.class);
        schemas.put("IsoscelesTriangle", IsoscelesTriangle.class);
        schemas.put("ScaleneTriangle", ScaleneTriangle.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Triangle.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof EquilateralTriangle) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof IsoscelesTriangle) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ScaleneTriangle) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle");
    }

    /**
     * Get the actual instance, which can be the following:
     * EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle
     *
     * @return The actual instance (EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `EquilateralTriangle`. If the actual instance is not `EquilateralTriangle`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EquilateralTriangle`
     * @throws ClassCastException if the instance is not `EquilateralTriangle`
     */
    public EquilateralTriangle getEquilateralTriangle() throws ClassCastException {
        return (EquilateralTriangle)super.getActualInstance();
    }

    /**
     * Get the actual instance of `IsoscelesTriangle`. If the actual instance is not `IsoscelesTriangle`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IsoscelesTriangle`
     * @throws ClassCastException if the instance is not `IsoscelesTriangle`
     */
    public IsoscelesTriangle getIsoscelesTriangle() throws ClassCastException {
        return (IsoscelesTriangle)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ScaleneTriangle`. If the actual instance is not `ScaleneTriangle`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ScaleneTriangle`
     * @throws ClassCastException if the instance is not `ScaleneTriangle`
     */
    public ScaleneTriangle getScaleneTriangle() throws ClassCastException {
        return (ScaleneTriangle)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Triangle
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with EquilateralTriangle
        try {
            EquilateralTriangle.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for EquilateralTriangle failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with IsoscelesTriangle
        try {
            IsoscelesTriangle.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for IsoscelesTriangle failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ScaleneTriangle
        try {
            ScaleneTriangle.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ScaleneTriangle failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for Triangle with oneOf schemas: EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of Triangle given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Triangle
     * @throws IOException if the JSON string is invalid with respect to Triangle
     */
    public static Triangle fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Triangle.class);
    }

    /**
     * Convert an instance of Triangle to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

