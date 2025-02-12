package org.example;

import org.example.util.StringUtil;
import org.junit.jupiter.api.Test;

/**
 * @author stephen
 */
class TestUtil {
    @Test
    void test() {
        assert "aaa".equals(StringUtil.toLowerCase("AAA"));
    }
}
