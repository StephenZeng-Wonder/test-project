package org.example;

import org.example.util.StringUtil;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author stephen
 */
class TestUtil {
    private final Logger logger = LoggerFactory.getLogger(TestUtil.class);
    
    @Test
    void test() {
        assert "aaa".equals(StringUtil.toLowerCase("AAA"));
        assert "test".equals(StringUtil.kotlinTest());
        logger.info("Test passed");
    }
}
