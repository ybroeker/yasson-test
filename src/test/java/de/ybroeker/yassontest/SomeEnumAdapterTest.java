package de.ybroeker.yassontest;


import javax.json.bind.JsonbBuilder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ybroeker
 */
class SomeEnumAdapterTest {

    @Test
    void adaptToJson() {
        SomeEnumWrapper someEnumWrapper = new SomeEnumWrapper(SomeEnum.SOME_VALUE);

        String json = JsonbBuilder.create().toJson(someEnumWrapper);

        Assertions.assertThat(json).isEqualTo("{\"someEnum\":\"some_value\"}");
    }

    @Test
    void adaptFromJson() {
        SomeEnumWrapper someEnum = JsonbBuilder.create().fromJson("{\"someEnum\":\"some_value\"}", SomeEnumWrapper.class);

        Assertions.assertThat(someEnum.getSomeEnum()).isEqualTo(SomeEnum.SOME_VALUE);
    }
}
