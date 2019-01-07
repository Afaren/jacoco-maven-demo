package afar.jacoco.demo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @Test
    public void should_user_has_name() {
        User user = new User();
        assertThat(user)
                .hasFieldOrPropertyWithValue("name", null);
        user.setName("afar");
        assertThat(user)
                .hasFieldOrPropertyWithValue("name", "afar");

    }
}

