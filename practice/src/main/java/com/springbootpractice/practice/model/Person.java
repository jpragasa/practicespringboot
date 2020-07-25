package com.springbootpractice.practice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person
{
    private final UUID id;

    @NotBlank
    private final String name;

    // Converts variables into Json format
    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name)
    {
        this.id = id;
        this.name = name;
    }

    public UUID getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }
}