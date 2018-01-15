package de.ybroeker.yassontest;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

/**
 * @author ybroeker
 */
public class SomeEnumWrapper {
    private SomeEnum someEnum;

    @JsonbCreator
    public SomeEnumWrapper(@JsonbProperty("someEnum") final SomeEnum someEnum) {
        this.someEnum = someEnum;
    }

    public SomeEnum getSomeEnum() {
        return someEnum;
    }

    public void setSomeEnum(final SomeEnum someEnum) {
        this.someEnum = someEnum;
    }
}
