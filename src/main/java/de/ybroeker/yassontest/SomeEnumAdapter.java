package de.ybroeker.yassontest;

import javax.json.bind.adapter.JsonbAdapter;

/**
 * @author ybroeker
 */
public class SomeEnumAdapter implements JsonbAdapter<SomeEnum, String> {

    public String adaptToJson(final SomeEnum obj) {
        return obj.name().toLowerCase();
    }

    public SomeEnum adaptFromJson(final String obj) {
        return SomeEnum.valueOf(obj.toUpperCase());
    }
}
