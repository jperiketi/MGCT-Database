package com.mgcloudtech.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum WorkAuthType {
    CPT("CPT"),
    OPT_EAD("OPT EAD"),
    STEM_OPT_EAD("STEM OPT EAD"),
    H1B("H1B"),
    GC_EAD("GC EAD"),
    GC("Green Card"),
    H4EAD("H4 EAD"),
    USC("USC"),
    L1("L1"),
    L2("L2");

    private final String value;

    WorkAuthType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static WorkAuthType fromValue(String value) {
        for (WorkAuthType type : WorkAuthType.values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown enum value: " + value);
    }
}
