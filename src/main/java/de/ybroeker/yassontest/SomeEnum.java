package de.ybroeker.yassontest;

import javax.json.bind.annotation.JsonbTypeAdapter;

/**
 * @author ybroeker
 */
@JsonbTypeAdapter(SomeEnumAdapter.class)
public enum SomeEnum {
    SOME_VALUE;
}
